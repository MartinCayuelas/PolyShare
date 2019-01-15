package persistent.mySQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import application.classesApp.Answer;
import application.classesApp.Student;
import database.BdConnection;
import facades.LoginFacade;
import facades.exceptions.DisconnectedStudentException;
import persistent.DAO.AnswerDAO;

/**
 * <b>Answer</b> to a question on the forum
 * @author ponthieu
 */
public class AnswerDAOMySQL extends AnswerDAO {

    /**
     * Default constructor
     */
    public AnswerDAOMySQL(Connection con) {
    	super(con);
    }

	@Override
	public void createAnswer(Answer a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addLike(Answer a) {
		Student sConnected;
		Boolean isLiked = false;
		try {
			//sConnected = LoginFacade.getInstance().getConnectedStudent();
			// TODO enelve le commentaire 
			sConnected = new Student(0);
			
			ResultSet rs = BdConnection.selectRequest(
					"select count(*) from Approve where idAnswer = " + a.getId() + " and idStudent = " + sConnected.getId());
			
			// if student already liked this answer, delete the like
			if (rs.next()) {
				isLiked = rs.getInt(1) >= 1 ;
				
				if (isLiked) {
					BdConnection.request("delete from Approve where idAnswer = " + a.getId() + " and idStudent = " + sConnected.getId());
					
				} else {
					BdConnection.request("insert into Approve values (" + a.getId()  + ", " + sConnected.getId()  + ")");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return isLiked;
		
		
	}

	@Override
	public List<Answer> getAllAnswerByQuestion(int idQuestion) {
		ResultSet rs =  BdConnection.selectRequest("select * from Answer where idQuestion = " + idQuestion);
		List<Answer> a = bdToObjects(rs);
		for (Answer answer : a) {
			ResultSet rsLike =  BdConnection.selectRequest("select count(*) as nbLike from Approve where idAnswer = " + answer.getId());
			
			try {
				if (rsLike.next()) {
					
					answer.setNbLikesAnswer(rsLike.getInt(1));
					
				}else {
					answer.setNbLikesAnswer(0);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		return a;
	}
	
	/**
	 * @param rs - a resultSet of all column of Question from the db
	 * @return a list of class
	 * Transform a resultSet of class in List of Question
	 */
	private Answer bdToObject (ResultSet rs ) {
		
		Answer question = null;
		try {
			question = new Answer(rs.getInt(1), rs.getString(2));
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return question;
	}
	
	/**
	 * 
	 * @param rs - the response of a query (with Answer inside)
	 * @return a list of Answer given in argument
	 * Transform a set of data from the Answer table in the db to 
	 * list of Answer object
	 */
	private List<Answer> bdToObjects (ResultSet rs) {
		List<Answer> list = new ArrayList<Answer>();
		try {
			while (rs.next()) {
				list.add(bdToObject(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public void addAnswer(Answer answer, int idQuestion) {
		String request = "insert into Answer values (null, \'" + answer.getContent() + "\' , " + idQuestion + ")";
		BdConnection.request(request);
	}

}