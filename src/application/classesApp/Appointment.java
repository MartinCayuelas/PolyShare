package application.classesApp;

import java.util.Set;

/**
 * <b>Appointment</b> is a<b>Single Session</b>or a <b>Revision Session</b>
 */
public class Appointment {

    /**
     * Default constructor
     */
	public Appointment(int idAppointment, Student teacher, Set<Student> student) {
    	this.idAppointment = idAppointment;
    	this.teacher = teacher;
    	this.student = student;
    }

	/**
     * 
     */
	public int idAppointment;
	
    /**
     * 
     */
    public Student teacher;

    /**
     * 
     */
    public Set<Student> student;



    /**
     * Add the subject of the appointment
     * @param s the subject added to the appointment
     */
    public void addSubject(Subject s) {
        // TODO implement here
    }

    /**
     * Modify the teacher for an appointment
     * @param s student who teach the appointment
     */
    public void setTeacher(Student s) {
        // TODO implement here
    	this.teacher = s;
    }

    /**
     * Get the teacher of the appointment
     * @return the student who teach the appointment
     */
    public Student getTeacher() {
        // TODO implement here
        return teacher;
    }

    /**
     * Get the student who is teached for the appointment
     * @return student who is teached for the appointment
     */
    public Set<Student> getStudent() {
        // TODO implement here
        return student;
    }

    /**
     * Modify the student who is teached for the appointment
     * @param s new student teached
     */
    public void setStudent(Set<Student> s) {
        // TODO implement here
    	this.student = s;
    }

}