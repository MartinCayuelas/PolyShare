package persistent.mySQL;


import java.sql.Connection;

import persistent.DAO.MediaFileDAO;

/**
 * 
 */
public class MediaFileDAOMySQL extends MediaFileDAO {

   
    public MediaFileDAOMySQL(Connection con) {
    	super(con);
    }

}