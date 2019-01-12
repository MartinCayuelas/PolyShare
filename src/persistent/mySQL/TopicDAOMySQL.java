package persistent.mySQL;

import java.sql.Connection;

import persistent.DAO.TopicDAO;

/**
 * <b>Topic</b> corresponds to a subject
 */
public class TopicDAOMySQL extends TopicDAO {

    
    public TopicDAOMySQL(Connection con) {
    	super(con);
    }

}