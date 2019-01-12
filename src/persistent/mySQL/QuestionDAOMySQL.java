package persistent.mySQL;

import java.sql.Connection;

import application.classesApp.Question;
import persistent.DAO.QuestionDAO;

/**
 * <b>Question</b> on the forum
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

}