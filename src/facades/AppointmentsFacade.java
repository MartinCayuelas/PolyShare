package facades;

import application.classesApp.RevisionSession;
import application.classesApp.SingleSession;
import application.classesApp.Student;

/**
 * 
 */
public class AppointmentsFacade {

    /**
     * Default constructor
     */
    public AppointmentsFacade() {
    }


    /**
     * @param student
     * 
     * Add a single session between the student in param
     * and the connected student
     */
    public void addSingleSession(Student Student) {
        // TODO implement here
    }

    /**
     * @param student
     * The connected student recommend a student
     * 
     */
    public void recommendStudent(Student student) {
        // TODO implement here
    }

    /**
     * @param 
     * @return 
     */
    public void updateSingleSession() {
        // TODO implement here
    }

    /**
     * @param singleSession who is going to be deleted
     */
    public void deleteSingleSession(SingleSession singleSession) {
        // TODO implement here
    }

    /**
     * @param student
     * A signalized student is a bad student
     */
    public void signalizeStudent(Student student) {
        // TODO implement here
    }

    /**
     * @param subject 
     * @return the matching single session (about the name)
     */
    public SingleSession searchSingleSession(String subject) {
        // TODO implement here
    	return null;
    }

    /**
     * @param create a new revision session
     */
    public void addRevisionSession(RevisionSession revisionSession) {
        // TODO implement here
    }

    /**
     * @param revisionSession who is going to be updated
     */
    public void updateRevisionSession(RevisionSession revisionSession) {
        // TODO implement here
    }

    /**
     * @param revisionSession who is going to be deleted.
     */
    public void deleteRevisionSession(RevisionSession revisionSession) {
        // TODO implement here
    }

}