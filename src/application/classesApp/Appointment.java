package application.classesApp;

import java.sql.Date;

/**
 * @author lucadebeir
 */

/**
 * <b>Appointment</b> is a<b>Single Session</b>or a <b>Revision Session</b>
 */
public class Appointment {

    /**
     * Default constructor
     */
	public Appointment(int idAppointment, Student teacher) {
    	this.idAppointment = idAppointment;
    	this.teacher = teacher;
    }
	
	public Appointment(int idAppointment, Student teacher, int idSubject, Date dateAppointment) {
    	this.idAppointment = idAppointment;
    	this.teacher = teacher;
    	this.idSubject = idSubject;
    	this.dateAppointment = dateAppointment;
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
    public int idSubject;
    
    /**
     * 
     */
    public Date dateAppointment;


    /**
     * Get the id of the appointment
     * @return the id of the appointment
     */
    public int getIdAppointment() {
		return idAppointment;
	}

    /**
     * Modify the id of the appointment
     * @param idAppointment the id added to the appointment
     */
	public void setIdAppointment(int idAppointment) {
		this.idAppointment = idAppointment;
	}

	/**
     * Get the id of the subject of the appointment
     * @return the id of the subject who is teached for the appointment
     */
	public int getIdSubject() {
		return idSubject;
	}

	/**
     * Modify the id of the subject of the appointment
     * @param idSubject the id added to the subject of the appointment
     */
	public void setIdSubject(int idSubject) {
		this.idSubject = idSubject;
	}

	/**
     * Get the date of the appointment
     * @return the date of the appointment
     */
	public Date getDateAppointment() {
		return dateAppointment;
	}

	/**
     * Modify the date of the appointment
     * @param dateAppointment the date added of the appointment
     */
	public void setDateAppointment(Date dateAppointment) {
		this.dateAppointment = dateAppointment;
	}

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

}