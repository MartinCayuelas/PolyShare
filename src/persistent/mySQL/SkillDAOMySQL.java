package persistent.mySQL;


import java.sql.Connection;
import java.util.*;

import persistent.DAO.SkillDAO;

/**
 * <b>Answer</b> to a question on the forum
 */
public class SkillDAOMySQL extends SkillDAO {

    /**
     * Default constructor
     */
    public SkillDAOMySQL(Connection conn) {
    	super(conn);
    }

}