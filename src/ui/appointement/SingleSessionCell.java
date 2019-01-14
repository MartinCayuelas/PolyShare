package ui.appointement;

import java.sql.Date;

import application.classesApp.Student;

public class SingleSessionCell {
	
	private int idRevisionSession;
	private Student teacher;
	private int idSubject;
	private Date dateRevisionSession;
	//private String placeRevisionSession;
	
	
	
	public SingleSessionCell(int idRevisionSession, Student teacher, int idSubject, Date dateRevisionSession/*, String placeRevisionSession*/) {
		super();
		this.idRevisionSession = idRevisionSession;
		this.teacher = teacher;
		this.idSubject = idSubject;
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



	public int getIdSubject() {
		return idSubject;
	}



	public void setIdSubject(int idSubject) {
		this.idSubject = idSubject;
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
