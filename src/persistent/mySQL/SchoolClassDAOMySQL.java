package persistent.mySQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import application.classesApp.SchoolClass;
import application.classesApp.Student;
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
			ResultSet result = this.connect.createStatement().executeQuery("SELECT * FROM class");
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

}