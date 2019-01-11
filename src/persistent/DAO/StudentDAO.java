package persistent.DAO;

import java.sql.Connection;

import application.classesApp.Student;

/**
 * AO
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
    public boolean verifyCredentials(String login, String password) {
        // TODO implement here
        return false;
    }

    /**
     * Find a Student by his id.
     * @param id 
     * @return Student
     */
    public Student findById(int id) {
        // TODO implement here
        return null;
    }

    /** 
     * Find a Student by his name.
     * @param name 
     * @return Student
     */
    public Student findByName(String name) {
        // TODO implement here
        return null;
    }

    /**
     * Creates a new Student
     * @param s 
     * 
     */
    public void createStudent(Student s) {
        // TODO implement here
    }

    /**
     * Recommand a Student
     * @param s 
     * 
     */
    public void recommandStudent(Student s) {
        // TODO implement here
    }

    /**
     * Signalize a Student
     * @param s 
     * 
     */
    public void signalizeStudent(Student s) {
        // TODO implement here
    }

}