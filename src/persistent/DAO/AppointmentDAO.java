package persistent.DAO;

import java.sql.Connection;
import application.classesApp.Appointment;
import application.classesApp.RevisionSession;
import application.classesApp.SingleSession;
import application.classesApp.Student;

/**
 * @author ponthieu
 */
public abstract class AppointmentDAO {

	protected Connection con;
    
    public AppointmentDAO(Connection con) {
    	this.con = con;
    }


    /**
     * @param s 
     * Creates a new SingleSession
     */
    public abstract void createSingleSession(SingleSession s);

    /**
     * @param id 
     * @return Appointment
     * Return an Appointment
     */
    public abstract Appointment getAppointmentById(int id);

    /**
     * Return a Student corresponding to the Id
     * @param id 
     * @return Student
     */
    public abstract Student getTeacherStudentById(int id);

    /**
     * @param subject 
     * @return SingleSession
     * Return an SingleSession corresponding to the subject in param
     */
    public abstract SingleSession getSingleSessionBySubject(String subject);

    /**
     * @param r 
     * Creates a RevisionSession
     */
    public abstract void createRevisionSession(RevisionSession r);

}