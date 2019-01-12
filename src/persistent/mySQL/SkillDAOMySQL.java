package persistent.mySQL;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import application.classesApp.Skill;
import application.classesApp.Student;
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

    
    public ArrayList<Skill> findSkillsByIdStudent(int id) {
    	ArrayList<Skill> skills = new ArrayList<Skill>();    
    	
    	    
    	  try {
    	    ResultSet result = this.connect.createStatement(
    	    ResultSet.TYPE_SCROLL_INSENSITIVE,
    	    ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Skill WHERE idStudent = " + id);
    	    
    	    
    	   
    	    while (result.next()) {
    	    	System.out.println("idSkill: "+result.getInt("idSkill") );
    	        Skill s = new Skill(result.getInt("idSkill"), result.getString("nomSkill"), result.getInt("markSkill"),id, result.getInt("idClass"));
    	       
    	        skills.add(s);
    	    }
    	    
    	    
    	    
    	  } catch (SQLException e) {
    	    e.printStackTrace();
    	  }
    	  return skills;
  	    
  	    
    	}
}