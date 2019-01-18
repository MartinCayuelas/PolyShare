package ui.appointement;


import java.util.ArrayList;

import application.classesApp.MyDate;
import application.classesApp.Student;
import application.classesApp.Subject;

public class RevisionSessionCell {
	
	private int idRevisionSession;
	private int idClass;
	private Student teacher;
	private ArrayList<Student> students;
	private Subject subject;
	private MyDate dateRevisionSession;
	private MyDate meetingTime;
	private String place;
	
	
	public RevisionSessionCell(int idRevisionSession, int idClass, Student teacher, ArrayList<Student> students, Subject subject, MyDate myDate, MyDate meetingTime, String place) {
		this.idRevisionSession = idRevisionSession;
		this.idClass = idClass;
		this.teacher = teacher;
		this.students = students;
		this.subject = subject;
		this.dateRevisionSession = myDate;
		this.meetingTime = meetingTime;
		this.place = place;
	}

	public int getIdClass() {
		return idClass;
	}

	public void setIdClass(int idClass) {
		this.idClass = idClass;
	}

	public MyDate getMeetingTime() {
		return meetingTime;
	}

	public void setMeetingTime(MyDate meetingTime) {
		this.meetingTime = meetingTime;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getIdRevisionSession() {
		return idRevisionSession;
	}



	public void setIdRevisionSession(int idRevisionSession) {
		this.idRevisionSession = idRevisionSession;
	}



	public Student getTeacher() {
		return teacher;
	}



	public void setTeacher(Student teacher) {
		this.teacher = teacher;
	}



	public ArrayList<Student> getStudents() {
		return students;
	}



	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}



	public Subject getSubject() {
		return this.subject;
	}



	public void setSubject(Subject subject) {
		this.subject = subject;
	}



	public MyDate getDateRevisionSession() {
		return dateRevisionSession;
	}



	public void setDateRevisionSession(MyDate dateRevisionSession) {
		this.dateRevisionSession = dateRevisionSession;
	}

	


}
