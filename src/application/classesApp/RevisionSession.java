package application.classesApp;

import java.util.ArrayList;

/** @author lucadebeir julienroumagnac
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
    
    public RevisionSession(int idAppointment, Student teacher, ArrayList<Student> student, Subject subject, MyDate localDate) {
    	super(idAppointment, teacher, subject, localDate);
    	this.students = student;
    }


    public RevisionSession(int idAppointment, MyDate date, Subject subject) {
		// TODO Auto-generated constructor stub
    	super(idAppointment, subject, date);
	}

	public RevisionSession(int idAppointment, int idClass, Student teacher, ArrayList<Student> students, Subject subject, ArrayList<Topic> topic,
			MyDate dateAppointment, String message, String meetingTime, String place) {
		super(idAppointment, idClass, teacher, subject, topic, dateAppointment, message, meetingTime, place);
		this.students = students;
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
    public ArrayList<Student> getStudents() {
        // TODO implement here
        return this.students;
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