package facades;

import java.sql.SQLException;
import java.util.ArrayList;
import application.classesApp.Appointment;
import application.classesApp.MyDate;
import application.classesApp.RevisionSession;
import application.classesApp.SingleSession;
import application.classesApp.Student;
import application.classesApp.Subject;
import facades.exceptions.DisconnectedStudentException;
import factory.AbstractFactory;
import persistent.DAO.AppointmentDAO;

/**
 * @author lucadebeir julienroumagnac
 * *
 */

public class AppointmentsFacade {

	private AbstractFactory abstractFactory = AbstractFactory.getFactoryMySql();
	private AppointmentDAO appointmentDAO = abstractFactory.createAppointmentDAO();
    
    /** Holder */
    private static class SingletonHolder
    {       
        /** Instance unique non préinitialisée */
        private final static AppointmentsFacade instance = new AppointmentsFacade();
    }
    
    /** Point d'accès pour l'instance unique du singleton */
    public static AppointmentsFacade getInstance()
    {
        return SingletonHolder.instance;
    }


    /**
     * @param student
     * 
     * Add a single session between the student in param
     * and the connected student
     * @throws DisconnectedStudentException 
     */
    public void addSingleSession(MyDate date, Subject subject, Student student) throws DisconnectedStudentException {
        // TODO implement here
    	Student teacher = LoginFacade.getInstance().getConnectedStudent();
    	SingleSession singleSession = new SingleSession(0, teacher, student, date, subject.getId());
    	appointmentDAO.createSingleSession(singleSession);
    }
    
    /**
     * @param idClass
     * @return list of SingleSession of the class who corresponds to idClass
     */
    public ArrayList<SingleSession> getSingleSessionByClass(int idClass) {
    	return appointmentDAO.getSingleSessionByClass(idClass);
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
    	return appointmentDAO.getSingleSessionBySubject(subject);
    }

    /**
     * @param create a new revision session
     */
    public void addRevisionSession(RevisionSession revisionSession) {
        // TODO implement here
    	appointmentDAO.createRevisionSession(revisionSession);
    }
    
    /**
     * @param idClass
     * @return list of RevisionSession of the class who corresponds to idClass
     */
    public ArrayList<RevisionSession> getAppointmentByClass(int idClass) {
    	return appointmentDAO.getAppointmentByClass(idClass);
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


	public ArrayList<Appointment> getAppointmentByStudent(Student s) {
		// TODO Auto-generated method stub
		ArrayList<Appointment> res = new ArrayList<Appointment>();
		res = appointmentDAO.getAppointmentByStudent(s.getId());
		
		return res;
		
	}
	
	public Subject getSubjectOfOneAppointmentById(int idSubject) throws SQLException {
		Subject subject = appointmentDAO.getSubjectOfOneAppointmentById(idSubject);
		return subject;
	}
	
	public Student getStudentOfOneAppointment(int idStudent) throws SQLException {
		Student student = appointmentDAO.getStudentOfOneAppointment(idStudent);
		return student;
	}
	
	public ArrayList<Student> getListStudentOfOneAppointment(RevisionSession rs) throws SQLException {
		ArrayList<Student> listStudent = appointmentDAO.getListStudentOfOneAppointment(rs);
		return listStudent;
	}

}