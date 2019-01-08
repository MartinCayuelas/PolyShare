package application.classesApp;

import java.util.Set;

/**
 * <b>Appointment</b> is a<b>Single Session</b>or a <b>Revision Session</b>
 */
public class Appointment {

    /**
     * Default constructor
     */
    public Appointment() {
    }

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
    }

    /**
     * Get the teacher of the appointment
     * @return the student who teach the appointment
     */
    public Student getTeacher() {
        // TODO implement here
        return null;
    }

    /**
     * Get the student who is teached for the appointment
     * @return student who is teached for the appointment
     */
    public Student getStudent() {
        // TODO implement here
        return null;
    }

    /**
     * Modify the student who is teached for the appointment
     * @param s new student teached
     */
    public void setStudent(Student s) {
        // TODO implement here
    }

}