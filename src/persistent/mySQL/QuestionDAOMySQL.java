package persistent.mySQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import application.classesApp.Answer;
import application.classesApp.Question;
import application.classesApp.SchoolClass;
import application.classesApp.Student;
import database.BdConnection;
import persistent.DAO.QuestionDAO;

/**
 * <b>Question</b> on the forum
 * @author ponthieu
 */
public class QuestionDAOMySQL extends QuestionDAO {

    /**
     * Default constructor
     */
    public QuestionDAOMySQL(Connection con) {
    	super(con);
    }

	@Override
	public void createQuestion(Question q) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Question findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void close(Question q) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Question> getAllQuestionByIdTopic(int idTopic) {
		ResultSet rs =  BdConnection.selectRequest("select * from Question where idTopic = " + idTopic);
		List<Question> q = bdToObjects(rs);
		for (Question question : q) {
			
			ResultSet rsLike =  BdConnection.selectRequest("select count(*) as nbLike from Rank where idQuestion = " + question.getIdQuestion());
			
			try {
				if (rsLike.next()) {
					question.setNbLikesQuestion(rsLike.getInt(1));
				}else {
					question.setNbLikesQuestion(0);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		return q;
	}
	
	/**
	 * @param rs - a resultSet of all column of Question from the db
	 * @return a list of class
	 * Transform a resultSet of class in List of Question
	 */
	private Question bdToObject (ResultSet rs ) {
		
		Question question = null;
		try {
			question = new Question(rs.getInt(1), rs.getString(2));
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return question;
	}
	
	/**
	 * 
	 * @param rs - the response of a query (with Question inside)
	 * @return a list of Question given in argument
	 * Transform a set of data from the Question table in the db to 
	 * list of Question object
	 */
	private List<Question> bdToObjects (ResultSet rs) {
		List<Question> list = new ArrayList<Question>();
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
	public void addLike(Question q) {
		Student sConnected;
		try {
			//sConnected = LoginFacade.getInstance().getConnectedStudent();
			// TODO enelve le commentaire 
			sConnected = new Student(0);
			
			ResultSet rs = BdConnection.selectRequest(
					"select count(*) from Rank where idQuestion = " + q.getId() + " and idStudent = " + sConnected.getId());
			
			// if student already liked this answer, delete the like
			if (rs.next()) {
				
				if (rs.getInt(1) >= 1 ) {
					BdConnection.request("delete from Rank where idQuestion = " + q.getId() + " and idStudent = " + sConnected.getId());
					
				} else {
					BdConnection.request("insert into Rank values (" +  sConnected.getId() + ", " + q.getId() + ")");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addQuestion(Question question, int idTopic) {
		BdConnection.request("insert into Question values (null, \'" + question.getContentQuestion() + "\', " + idTopic + ")");
		
	}

}