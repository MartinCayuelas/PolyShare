package persistent.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import application.classesApp.Appointment;
import application.classesApp.RevisionSession;
import application.classesApp.SingleSession;
import application.classesApp.Student;
import application.classesApp.Subject;
import ui.appointement.SingleSessionCell;

/**
 * @author julienroumagnac ponthieu lucadebeir
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
     * @param s 
     * Creates a new HelpRequest
     */
    public abstract void createHelpRequest(SingleSession s);

    /**
     * @param id 
     * @return Appointment
     * Return an Appointment
     */
    public abstract Appointment getAppointmentById(int id);
    
    /**
     * @param id 
     * @return Appointment
     * Return an SingleSession
     */
    public abstract Appointment getSingleSessionById(int id);

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
    
    /**
     * @param idClass
     * @return list of SingleSession of the class who corresponds to idClass
     */
    public abstract ArrayList<SingleSession> getSingleSessionByClass(int idClass);
    
    /**
     * @param idClass
     * @return list of RevisionSession of the class who corresponds to idClass
     */
    public abstract ArrayList<RevisionSession> getAppointmentByClass(int idClass);


	public abstract ArrayList<Appointment> getAppointmentByStudent(int i);


	public abstract Subject getSubjectOfOneAppointmentById(int idSubject) throws SQLException;
	
	public abstract ArrayList<Student> getListStudentOfOneAppointment(RevisionSession rs) throws SQLException;
	
	public abstract Student getStudentOfOneAppointment(int idStudent) throws SQLException;


	public abstract ArrayList<SingleSession> getHelpRequestByClass(int idClass);
	
	public abstract void updateSingleSession(SingleSession ss);
	
	public abstract void updateRevisionSession(RevisionSession rs, int idStudent);

}