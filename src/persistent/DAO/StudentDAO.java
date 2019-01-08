package persistent.DAO;

import application.classesApp.Student;

/**
 * AO
 */
public abstract class StudentDAO {

    /**
     * Default constructor
     */
    public StudentDAO() {
    }


    /**
     * @param id 
     * @param password 
     * @return
     */
    public boolean login(String id, String password) {
        // TODO implement here
        return false;
    }

    /**
     * @param login 
     * @param password 
     * @return
     */
    public boolean verifyCredentials(String login, String password) {
        // TODO implement here
        return false;
    }

    /**
     * @param id 
     * @return
     */
    public Student findById(int id) {
        // TODO implement here
        return null;
    }

    /**
     * @param name 
     * @return
     */
    public Student findByName(String name) {
        // TODO implement here
        return null;
    }

    /**
     * @param s 
     * @return
     */
    public void createStudent(Student s) {
        // TODO implement here
    }

    /**
     * @param s 
     * @return
     */
    public void recommendStudent(Student s) {
        // TODO implement here
    }

    /**
     * @param s 
     * @return
     */
    public void signalizeStudent(Student s) {
        // TODO implement here
    }

}