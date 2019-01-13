package persistent.mySQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import application.classesApp.SchoolClass;
import application.classesApp.Subject;
import application.classesApp.Topic;
import persistent.DAO.SubjectDAO;
/**
 * <b>Subject</b> is in a school class and contains topics
 * @author guillaud
 */
public class SubjectDAOMySQL extends SubjectDAO {

    
    public SubjectDAOMySQL(Connection con) {
    	super(con); 
    }

	@Override
	public void createSubject(String namesubject, SchoolClass classsub) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addTopic(Subject s, Topic t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close(Subject s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Subject> findSubjectsByIdSchoolClass(int idSchoolClass) {
		return null;
	}

	@Override
	public void deleteSubject(int idSchoolClass, Subject subject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateSubject(int idSchoolClass, Subject subject) {
		// TODO Auto-generated method stub
		
	}

}