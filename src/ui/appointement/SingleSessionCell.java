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


	public SingleSessionCell(int idSingleSession, int idClass, Student teacher, Student student, Subject subject,
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



	public int getIdClassCell() {
		return this.idClass;
	}



	public void setIdClassCell(int idClass) {
		this.idClass = idClass;
	}



	public String getPlaceCell() {
		return this.place;
	}



	public void setPlaceCell(String place) {
		this.place = place;
	}



	public MyDate getMeetingTimeCell() {
		return this.meetingTime;
	}



	public void setMeetingTimeCell(MyDate meetingTime) {
		this.meetingTime = meetingTime;
	}



	public int getIdSingleSessionCell() {
		return this.idSingleSession;
	}



	public void setIdSingleSessionCell(int idSingleSession) {
		this.idSingleSession = idSingleSession;
	}



	public Student getTeacherCell() {
		return this.teacher;
	}



	public void setTeacherCell(Student teacher) {
		this.teacher = teacher;
	}



	public Subject getSubjectCell() {
		return this.subject;
	}



	public void setSubjectCell(Subject subject) {
		this.subject = subject;
	}



	public MyDate getDateRevisionSessionCell() {
		return this.dateRevisionSession;
	}



	public void setDateRevisionSessionCell(MyDate dateRevisionSession) {
		this.dateRevisionSession = dateRevisionSession;
	}



	public Student getStudentCell() {
		return this.student;
	}



	public void setStudentCell(Student student) {
		this.student = student;
	}

}
