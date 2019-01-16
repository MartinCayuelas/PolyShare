package application.classesApp;

import java.time.LocalDate;

/**
 * @author julienroumagnac lucadebeir  
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
	
	public Appointment(int idAppointment, Student teacher, int idSubject, MyDate date) {
    	this.idAppointment = idAppointment;
    	this.teacher = teacher;
    	this.idSubject = idSubject;
    	this.dateAppointment = date;
    }
	
	public Appointment(int idAppointment, Student teacher, Subject subject, MyDate date) {
    	this.idAppointment = idAppointment;
    	this.teacher = teacher;
    	this.subject = subject;
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
    public Subject subject;
    
    /**
     * 
     */
    public int idSubject;
    
    /**
     * 
     */
    public MyDate dateAppointment;


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
     * Get the subject of the appointment
     * @return the subject who is teached for the appointment
     */
	public Subject getSubject() {
		return subject;
	}

	/**
     * Modify the subject of the appointment
     * @param subject the subject added to the subject of the appointment
     */
	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	/**
     * Get the date of the appointment
     * @return the date of the appointment
     */
	public MyDate getDateAppointment() {
		return dateAppointment;
	}

	/**
     * Modify the date of the appointment
     * @param dateAppointment the date added of the appointment
     */
	public void setDateAppointment(MyDate dateAppointment) {
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