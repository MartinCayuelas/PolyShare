package persistent.mySQL;

import java.sql.Connection;

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

}