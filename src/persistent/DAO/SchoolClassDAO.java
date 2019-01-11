package persistent.DAO;

import java.sql.Connection;
import java.util.ArrayList;

import application.classesApp.SchoolClass;
import application.classesApp.Student;
import application.classesApp.Subject;

/**
 * 
 */
public class SchoolClassDAO {
	
	protected Connection connect = null;

    /**
     * Default constructor
     */
    public SchoolClassDAO(Connection conn) {
    	this.connect = conn;
    }



    /**
     * @param sc the created schoolClass 
     * Save a school with a Student in admin
     */
    public void createSchoolClass(SchoolClass sc, Student admin) {
        // TODO implement here
    }

    /**
     * @param c
     * @param s 
     * Remove the student from the class corresponding to the Student
     */
    public void quitSchoolClass(SchoolClass c, Student s) {
        // TODO implement here
    }

    /**
     * @param c
     * @param s 
     * Add a Student to the corresponding SchoolClass
     */
    public void addStudent(SchoolClass c, Student s) {
        // TODO implement here
    }

    /**
     * @param s 
     *  Add a Subject to the corresponding SchoolClass
     */
    public void addSubject(Subject s) {
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



	public ArrayList<SchoolClass> getAllSchoolClassesNames() {
		// TODO Auto-generated method stub
		return null;
	}

}