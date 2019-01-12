package persistent.mySQL;

import java.sql.Connection;

import application.classesApp.Answer;
import persistent.DAO.AnswerDAO;

/**
 * <b>Answer</b> to a question on the forum
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
	public void addLike(Answer a) {
		// TODO Auto-generated method stub
		
	}

}