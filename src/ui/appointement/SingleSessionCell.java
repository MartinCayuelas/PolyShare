package ui.appointement;

import java.time.LocalDate;

import application.classesApp.MyDate;
import application.classesApp.Student;
import application.classesApp.Subject;

public class SingleSessionCell {
	
	private int idRevisionSession;
	private Student teacher;
	private Subject subject;
	private MyDate dateRevisionSession;
	//private String placeRevisionSession;
	
	
	
	public SingleSessionCell(int idRevisionSession, Student teacher, Subject subject, MyDate myDate) {
		this.idRevisionSession = idRevisionSession;
		this.teacher = teacher;
		this.subject = subject;
		this.dateRevisionSession = myDate;
		//this.placeRevisionSession = placeRevisionSession;
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



	public Subject getSubject() {
		return subject;
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



	/*public String getPlaceRevisionSession() {
		return placeRevisionSession;
	}



	public void setPlaceRevisionSession(String placeRevisionSession) {
		this.placeRevisionSession = placeRevisionSession;
	}*/

}
