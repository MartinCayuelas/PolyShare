package application.classesApp;

import java.util.ArrayList;

/**
 * @author lucadebeir
 */

/**
 * <b>Single Session</b> is 1 of the 2 types of Appointments, with a teacher and only one student
 */
public class SingleSession extends Appointment {
	
	/**
	 * 
	 */
	private Student student;


    /**
     * Default constructor
     */
	
    public SingleSession(int idAppointment, Student teacher, Student student) {
    	super(idAppointment, teacher);
    	this.student = student;
    }
    
    public SingleSession(int idAppointment, int idClass, Student teacher, Student student, Subject subject, ArrayList<Topic> topic,
			MyDate dateAppointment, String message, MyDate meetingTime, String place) {
		super(idAppointment, idClass, teacher, subject, topic, dateAppointment, message, meetingTime, place);
		// TODO Auto-generated constructor stub
		this.student = student;
	}

	public SingleSession(int idAppointment, Student teacher, Student student, MyDate localDate, int idSubject) {
    	super(idAppointment, teacher, idSubject, localDate);
    	this.student = student;
    }
    
    public SingleSession(int idAppointment, Student teacher, Student student, MyDate dateA, Subject subject) {
    	super(idAppointment, teacher, subject, dateA);
    	this.student = student;
    }
    
    /**
     *Get the student who is teached for the appointment
     * @return student who is teached for the appointment
     */
    public Student getStudent() {
        // TODO implement here
    	return this.student;
    }

    /**
     * Modify the list of student who is teached for the appointment
     * @param s new student teached
     */
    public void setStudent(Student s) {
        // TODO implement here
    	this.student = s;
    }

    /**
     * 
     */
    public void createSingleSession() {
        // TODO implement here
    }

}