package persistent.mySQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import application.classesApp.Student;
import persistent.DAO.StudentDAO;

/**
 * <b>Student</b> is a user who is register
 */
public class StudentDAOMySQL extends StudentDAO {

    /**
     * Default constructor
     */
    public StudentDAOMySQL(Connection conn) {
    	super(conn);
    }
    
    public Student login(String id, String password) {
		Student student = new Student(0, null, null, null, null, null, null);
		
		try {
		   ResultSet result = this.connect.createStatement().executeQuery("SELECT * FROM Student WHERE emailStudent = '" + id + "' AND password = '" + password + "'");
		   if(result.next()) {
			   student = new Student(
			    	result.getInt("idStudent"),
			        result.getString("nameStudent"),
			        result.getString("firstNameStudent"),
			        result.getString("emailStudent"),
			        result.getString("password"),
			        result.getString("loginID"),
			        null);
			   return student;
		   } else { 
			   return null;
		   }
		 } catch (SQLException e) {
			 e.printStackTrace();
		 }
		 return null;
	}
    
    public Student findById(int id) {
  	  Student student = new Student(0, null, null, null, null, null, null);      
  	    
  	  try {
  	    ResultSet result = this.connect.createStatement(
  	    ResultSet.TYPE_SCROLL_INSENSITIVE,
  	    ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Student WHERE idStudent = " + id);
  	    if(result.first())
  	      student = new Student(
  	    		id,
  	        result.getString("nameStudent"),
  	        result.getString("firstNameStudent"),
  	        result.getString("emailStudent"),
  	        result.getString("password"),
  	        result.getString("loginID"),
  	        null);         
  	  } catch (SQLException e) {
  	    e.printStackTrace();
  	  }
  	  return student;
  	}

}