package ui.appointement;

import application.classesApp.MyDate;
import application.classesApp.Student;
import application.classesApp.Subject;

public class HelpRequestCell {
	
	private int idSingleSession;
	private int idClass;
	private Student teacher;
	private Student student;
	private Subject subject;
	private MyDate dateRevisionSession;
	private String place;
	private MyDate meetingTime;


	public HelpRequestCell(int idSingleSession, int idClass, Student teacher, Student student, Subject subject,
			MyDate dateRevisionSession, String place, MyDate meetingTime) {
		this.idSingleSession = idSingleSession;
		this.idClass = idClass;
		this.teacher = teacher;
		this.student = student;
		this.subject = subject;
		this.dateRevisionSession = dateRevisionSession;
		this.place = place;
		this.meetingTime = meetingTime;
	}


	/**
	 * @return the idSingleSession
	 */
	public int getIdSingleSession() {
		return idSingleSession;
	}


	/**
	 * @param idSingleSession the idSingleSession to set
	 */
	public void setIdSingleSession(int idSingleSession) {
		this.idSingleSession = idSingleSession;
	}


	/**
	 * @return the idClass
	 */
	public int getIdClass() {
		return idClass;
	}


	/**
	 * @param idClass the idClass to set
	 */
	public void setIdClass(int idClass) {
		this.idClass = idClass;
	}


	/**
	 * @return the teacher
	 */
	public Student getTeacher() {
		return teacher;
	}


	/**
	 * @param teacher the teacher to set
	 */
	public void setTeacher(Student teacher) {
		this.teacher = teacher;
	}


	/**
	 * @return the student
	 */
	public Student getStudent() {
		return student;
	}


	/**
	 * @param student the student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
	}


	/**
	 * @return the subject
	 */
	public Subject getSubject() {
		return subject;
	}


	/**
	 * @param subject the subject to set
	 */
	public void setSubject(Subject subject) {
		this.subject = subject;
	}


	/**
	 * @return the dateRevisionSession
	 */
	public MyDate getDateRevisionSession() {
		return dateRevisionSession;
	}


	/**
	 * @param dateRevisionSession the dateRevisionSession to set
	 */
	public void setDateRevisionSession(MyDate dateRevisionSession) {
		this.dateRevisionSession = dateRevisionSession;
	}


	/**
	 * @return the place
	 */
	public String getPlace() {
		return place;
	}


	/**
	 * @param place the place to set
	 */
	public void setPlace(String place) {
		this.place = place;
	}


	/**
	 * @return the meetingTime
	 */
	public MyDate getMeetingTime() {
		return meetingTime;
	}


	/**
	 * @param meetingTime the meetingTime to set
	 */
	public void setMeetingTime(MyDate meetingTime) {
		this.meetingTime = meetingTime;
	}
	
	

}
