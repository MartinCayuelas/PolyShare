package persistent.mySQL;

import java.sql.Connection;

import persistent.DAO.SubjectDAO;
/**
 * <b>Subject</b> is in a school class and contains topics
 */
public class SubjectDAOMySQL extends SubjectDAO {

    
    public SubjectDAOMySQL(Connection con) {
    	super(con); 
    }

}