package persistent.DAO;

import java.sql.Connection;

import application.classesApp.Student;

/**
 * 
 * @author ponthieu
 *
 */
public abstract class StudentDAO {
	
	protected Connection connect = null;

    /**
     * Default constructor
     */
	public StudentDAO(Connection conn) {
		  this.connect = conn;
		}


    /**
     * Log in the user on the app, if it's true.
     * @param id 
     * @param password 
     * @return boolean
     */
    public Student login(String id, String password) {
        // TODO implement here
        return null;
    }

    /**
     * Verify the login and the password during the Log in op�ration
     * @param login 
     * @param password 
     * @return boolean
     */
    public abstract boolean verifyCredentials(String login, String password);

    /**
     * Find a Student by his id.
     * @param id 
     * @return Student
     */
    public abstract Student findById(int id);

    /** 
     * Find a Student by his name.
     * @param name 
     * @return Student
     */
    public abstract Student findByName(String name);

    /**
     * Creates a new Student
     * @param s 
     * 
     */
    public abstract void createStudent(Student s);

    /**
     * Recommand a Student
     * @param s 
     * 
     */
    public abstract void recommandStudent(Student s);

    /**
     * Signalize a Student
     * @param s 
     * 
     */
    public abstract void signalizeStudent(Student s);

}