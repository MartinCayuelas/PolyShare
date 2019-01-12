package persistent.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import application.classesApp.SchoolClass;
import application.classesApp.Student;
import application.classesApp.Subject;
import database.BdConnection;

/**
 * 
 */
public class SchoolClassDAO {
	
	protected Connection con = null;

    /**
     * Default constructor
     */
    public SchoolClassDAO(Connection conn) {
    	this.con = conn;
    }



    /**
     * @param sc the created schoolClass 
     * Save a school with a Student in admin
     */
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

    /**
     * @param c
     * @param s 
     * Remove the student from the class corresponding to the Student
     */
    public void quitSchoolClass(SchoolClass c, Student s) {
    	BdConnection.request(
    			"DELETE FROM Study where idClass =" +
    	c.getIdSchoolClass() +
    	" and idStudent=" +
    	s.getId());
    }
    /**
     * 
     * @param c
     * @param s
     * add a student's demand to the class
     */
    
    public void addDemandStudent(SchoolClass c, Student s) {
		BdConnection.request("INSERT INTO Study VALUES (" + s.getId() + ", " + c.getIdSchoolClass() + "," + "\'waiting\'" + ")");
    }

	/**
	 * @param c
	 * @param s Add a Student to the corresponding SchoolClass
	 */
	public void addStudent(SchoolClass c, Student s) {
		BdConnection.request("UPDATE Study set nameStatus= \'member\' where idClass =" + c.getIdSchoolClass() + " and idStudent=" + s.getId());
	}

    /**
     * @param s
     * @param class
     *  Add a Subject to the corresponding SchoolClass
     */
    public void addSubject(Subject s, SchoolClass sc) {
        // TODO implement here
    }

    /**
     * @param c
     * Close the SchoolClass and also remove all Students, Subjects, Topics, Questions and Answers
     */
    public void close(SchoolClass c) {
        // TODO implement here
    }

    /**
     * @param s 
     * @return SchoolClass
     *  Return a SchoolClass
     */
    public SchoolClass getSchoolClassByName(String s) {
        // TODO implement here
        return null;
    }
    
    /**
     * @param s 
     * @return SchoolClass
     *  Return a SchoolClass
     */
    public SchoolClass findById(int id) {
        // TODO implement here
        return null;
    }



	public ArrayList<SchoolClass> getAllSchoolClassesNames() {
		// TODO Auto-generated method stub
		return null;
	}

}