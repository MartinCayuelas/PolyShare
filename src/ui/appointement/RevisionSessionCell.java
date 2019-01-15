package ui.appointement;

import java.sql.Date;
import java.util.ArrayList;

import application.classesApp.Student;
import application.classesApp.Subject;

public class RevisionSessionCell {
	
	private int idRevisionSession;
	private Student teacher;
	private ArrayList<Student> students;
	private Subject subject;
	private Date dateRevisionSession;
	private String placeRevisionSession;
	
	
	
	public RevisionSessionCell(int idRevisionSession, Student teacher, ArrayList<Student> students, Subject subject, Date dateRevisionSession/*, String placeRevisionSession*/) {
		this.idRevisionSession = idRevisionSession;
		this.teacher = teacher;
		this.students = students;
		this.subject = subject;
		this.dateRevisionSession = dateRevisionSession;
		/*this.placeRevisionSession = placeRevisionSession;*/
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



	public Date getDateRevisionSession() {
		return dateRevisionSession;
	}



	public void setDateRevisionSession(Date dateRevisionSession) {
		this.dateRevisionSession = dateRevisionSession;
	}



	public String getPlaceRevisionSession() {
		return placeRevisionSession;
	}



	public void setPlaceRevisionSession(String placeRevisionSession) {
		this.placeRevisionSession = placeRevisionSession;
	}

	


}
