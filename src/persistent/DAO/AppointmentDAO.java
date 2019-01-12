package persistent.DAO;

import java.sql.Connection;

import application.classesApp.Appointment;
import application.classesApp.RevisionSession;
import application.classesApp.SingleSession;
import application.classesApp.Student;

/**
 * 
 */
public abstract class AppointmentDAO {

	 private Connection con;
    
    public AppointmentDAO(Connection con) {
    	this.con = con;
    }


    /**
     * @param s 
     * Creates a new SingleSession
     */
    public void createSingleSession(SingleSession s) {
        // TODO implement here
    }

    /**
     * @param id 
     * @return Appointment
     * Return an Appointment
     */
    public Appointment getAppointmentById(int id) {
        // TODO implement here
        return null;
    }

    /**
     * Return a Student corresponding to the Id
     * @param id 
     * @return Student
     */
    public Student getTeacherStudentById(int id) {
        // TODO implement here
        return null;
    }

    /**
     * @param subject 
     * @return SingleSession
     * Return an SingleSession corresponding to the subject in param
     */
    public SingleSession getSingleSessionBySubject(String subject) {
        // TODO implement here
        return null;
    }

    /**
     * @param r 
     * Creates a RevisionSession
     */
    public void createRevisionSession(RevisionSession r) {
        // TODO implement here
    }

}