package application.classesApp;

import java.time.LocalDate;

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
	public Student student;


    /**
     * Default constructor
     */
    public SingleSession(int idAppointment, Student teacher, Student student) {
    	super(idAppointment, teacher);
    	this.student = student;
    }
    
    public SingleSession(int idAppointment, Student teacher, Student student, LocalDate localDate, int idSubject) {
    	super(idAppointment, teacher, idSubject, localDate);
    	this.student = student;
    }
    
    public SingleSession(int idAppointment, Student teacher, Student student, LocalDate dateA, Subject subject) {
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