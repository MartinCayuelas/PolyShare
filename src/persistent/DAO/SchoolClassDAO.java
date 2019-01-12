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
 * @author ponthieu
 */
public abstract class SchoolClassDAO {
	
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
    public abstract void createSchoolClass(SchoolClass sc, Student admin);

    /**
     * @param c
     * @param s 
     * Remove the student from the class corresponding to the Student
     */
    public abstract void quitSchoolClass(SchoolClass c, Student s);
    /**
     * 
     * @param c
     * @param s
     * add a student's demand to the class
     */
    
    public abstract void addDemandStudent(SchoolClass c, Student s);

	/**
	 * @param c
	 * @param s Add a Student to the corresponding SchoolClass
	 */
	public abstract void addStudent(SchoolClass c, Student s);

    /**
     * @param s
     * @param class
     *  Add a Subject to the corresponding SchoolClass
     */
    public abstract void addSubject(Subject s, SchoolClass sc);

    /**
     * @param c
     * Close the SchoolClass and also remove all Students, Subjects, Topics, Questions and Answers
     */
    public abstract void close(SchoolClass c);

    /**
     * @param s 
     * @return SchoolClass
     *  Return a SchoolClass
     */
    public abstract SchoolClass getSchoolClassByName(String s);
    
    /**
     * @param s 
     * @return SchoolClass
     *  Return a SchoolClass
     */
    public abstract SchoolClass findById(int id);


    /**
     * 
     * @return  all the school class in the bd
     */
	public abstract ArrayList<SchoolClass> getAllSchoolClasses();

}