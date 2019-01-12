package persistent.mySQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import application.classesApp.SchoolClass;
import application.classesApp.Student;
import application.classesApp.Subject;
import database.BdConnection;
import persistent.DAO.SchoolClassDAO;
/**
 * <b>SchoolClass</b> is a class, with an administrator who is a student and other students
 */
public class SchoolClassDAOMySQL extends SchoolClassDAO {

    /**
     * Default constructor
     */
    public SchoolClassDAOMySQL(Connection conn) {
    	super(conn);
    }
    
    public ArrayList<SchoolClass> getAllSchoolClassesNames(){
    	SchoolClass schoolClass = new SchoolClass(null);
    	ArrayList<SchoolClass> schoolClasses = new ArrayList<SchoolClass>();
		try {
			ResultSet result = this.con.createStatement().executeQuery("SELECT * FROM class");
			while(result.next()){ 
				schoolClass = new SchoolClass(
					result.getInt("idClass"),
		  	        result.getString("nameClass")
		  	    );
				schoolClasses.add(schoolClass);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return schoolClasses;
    }

    
    public SchoolClass findById(int id) {
    	  SchoolClass classS = new SchoolClass(0, null);      
    	    
    	  try {
    	    ResultSet result = this.con.createStatement(
    	    ResultSet.TYPE_SCROLL_INSENSITIVE,
    	    ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Class WHERE idClass = " + id);
    	    if(result.first())
    	      classS = new SchoolClass(
    	    		id,
    	        result.getString("nameClass"));         
    	  } catch (SQLException e) {
    	    e.printStackTrace();
    	  }
    	  return classS;
    	}

	@Override
	public void createSchoolClass(SchoolClass sc, Student admin) {
    	Statement st;
		boolean res = false;
    	
		try {
			st = this.con.createStatement();
			// insert the class
			st.executeUpdate("INSERT INTO Class VALUES (null , \'" + sc.getNameSchoolClass() + "\')");
			
			// get the id in this class
			ResultSet rs = st.executeQuery("SELECT MAX(idClass) as maxIdClass from Class");
			rs.next();
			int idDerClass = rs.getInt("maxIdClass");
			
			// Create the link between admin and class
			st.executeUpdate("INSERT INTO Study VALUES (" + admin.getId() + ", " + idDerClass + "," + "\'admin\'" + ")");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
    }

	@Override
	public void quitSchoolClass(SchoolClass c, Student s) {
    	BdConnection.request(
    			"DELETE FROM Study where idClass =" +
    	c.getIdSchoolClass() +
    	" and idStudent=" +
    	s.getId());
    }

	@Override
	public void addDemandStudent(SchoolClass c, Student s) {
		BdConnection.request("INSERT INTO Study VALUES (" + s.getId() + ", " + c.getIdSchoolClass() + "," + "\'waiting\'" + ")");
    }

	@Override
	public void addStudent(SchoolClass c, Student s) {
		BdConnection.request("UPDATE Study set nameStatus= \'member\' where idClass =" + c.getIdSchoolClass() + " and idStudent=" + s.getId());
	}

	@Override
	public void addSubject(Subject s, SchoolClass sc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close(SchoolClass c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SchoolClass getSchoolClassByName(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<SchoolClass> getAllSchoolClasses() {
		// TODO Auto-generated method stub
		return null;
	}
}