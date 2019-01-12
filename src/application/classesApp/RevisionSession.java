package application.classesApp;

import java.sql.Date;
import java.util.ArrayList;

/**
 * @author lucadebeir
 */

/**
 * <b>Revision Session</b> is 1 of the 2 types of Appointments, with a teacher and many students
 */
public class RevisionSession extends Appointment {
	
	/**
	 * 
	 */ 
	public ArrayList<Student> students;

    /**
     * Default constructor
     */
    public RevisionSession(int idAppointment, Student teacher, ArrayList<Student> student) {
    	super(idAppointment, teacher);
    	this.students = student;
    }
    
    public RevisionSession(int idAppointment, Student teacher, ArrayList<Student> student, int idSubject, Date dateA) {
    	super(idAppointment, teacher, idSubject, dateA);
    	this.students = student;
    }


    /**
     * Add a student for a Revision Session
     * @param s new student who participate to the session
     */
    public void addStudent(Student s) {
        // TODO implement here
    	this.students.add(s);
    }

    /**
     * Delete a student for the revision session
     * @param s delete student
     */
    public void deleteStudent(Student s) {
        // TODO implement here
    	this.students.remove(s);
    }

    /**
     * Create a new Revision session
     */
    public void createRevisionSession() {
        // TODO implement here
    }
    
    /**
     * Get the student who is teached for the appointment
     * @return student who is teached for the appointment
     */
    public ArrayList<Student> getStudent() {
        // TODO implement here
        return students;
    }

    /**
     * Modify the list of student who is teached for the appointment
     * @param s new student teached
     */
    public void setStudent(ArrayList<Student> s) {
        // TODO implement here
    	this.students = s;
    }

}