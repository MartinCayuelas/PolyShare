package persistent.mySQL;

import java.sql.Connection;

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

}