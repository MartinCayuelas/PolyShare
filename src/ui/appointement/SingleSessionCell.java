package ui.appointement;

import java.sql.Date;

import application.classesApp.Student;
import application.classesApp.Subject;

public class SingleSessionCell {
	
	private int idRevisionSession;
	private Student teacher;
	private Subject subject;
	private Date dateRevisionSession;
	//private String placeRevisionSession;
	
	
	
	public SingleSessionCell(int idRevisionSession, Student teacher, Subject subject, Date dateRevisionSession/*, String placeRevisionSession*/) {
		this.idRevisionSession = idRevisionSession;
		this.teacher = teacher;
		this.subject = subject;
		this.dateRevisionSession = dateRevisionSession;
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



	public Date getDateRevisionSession() {
		return dateRevisionSession;
	}



	public void setDateRevisionSession(Date dateRevisionSession) {
		this.dateRevisionSession = dateRevisionSession;
	}



	/*public String getPlaceRevisionSession() {
		return placeRevisionSession;
	}



	public void setPlaceRevisionSession(String placeRevisionSession) {
		this.placeRevisionSession = placeRevisionSession;
	}*/

}
