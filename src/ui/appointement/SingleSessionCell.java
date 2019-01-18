package ui.appointement;

import application.classesApp.MyDate;
import application.classesApp.Student;
import application.classesApp.Subject;

public class SingleSessionCell {
	
	private int idSingleSession;
	private int idClass;
	private Student teacher;
	private Student student;
	private Subject subject;
	private MyDate dateRevisionSession;
	private String place;
	private MyDate meetingTime;
	
	
	
	public SingleSessionCell(int idSingleSession, Student teacher, Subject subject, MyDate myDate) {
		this.idSingleSession = idSingleSession;
		this.teacher = teacher;
		this.subject = subject;
		this.dateRevisionSession = myDate;
	}



	public SingleSessionCell(int idSingleSession, int idClass, Student teacher, Student student, Subject subject,
			MyDate dateRevisionSession, String place, MyDate meetingTime) {
		this.idSingleSession = idSingleSession;
		this.idClass = idClass;
		this.teacher = teacher;
		this.setStudent(student);
		this.subject = subject;
		this.dateRevisionSession = dateRevisionSession;
		this.place = place;
		this.meetingTime = meetingTime;
	}



	public int getIdClass() {
		return this.idClass;
	}



	public void setIdClass(int idClass) {
		this.idClass = idClass;
	}



	public String getPlace() {
		return this.place;
	}



	public void setPlace(String place) {
		this.place = place;
	}



	public MyDate getMeetingTime() {
		return this.meetingTime;
	}



	public void setMeetingTime(MyDate meetingTime) {
		this.meetingTime = meetingTime;
	}



	public int getIdSingleSession() {
		return this.idSingleSession;
	}



	public void setIdSingleSession(int idSingleSession) {
		this.idSingleSession = idSingleSession;
	}



	public Student getTeacher() {
		return this.teacher;
	}



	public void setTeacher(Student teacher) {
		this.teacher = teacher;
	}



	public Subject getSubject() {
		return this.subject;
	}



	public void setSubject(Subject subject) {
		this.subject = subject;
	}



	public MyDate getDateRevisionSession() {
		return this.dateRevisionSession;
	}



	public void setDateRevisionSession(MyDate dateRevisionSession) {
		this.dateRevisionSession = dateRevisionSession;
	}



	public Student getStudent() {
		return this.student;
	}



	public void setStudent(Student student) {
		this.student = student;
	}

}
