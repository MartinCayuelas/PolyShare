package persistent.mySQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;
import java.util.*;

import application.classesApp.RevisionSession;
import application.classesApp.SchoolClass;
import application.classesApp.Student;
import application.classesApp.Subject;
import application.classesApp.Topic;
import persistent.DAO.SubjectDAO;
import persistent.DAO.TopicDAO;
import database.BdConnection;

/**
 * <b>Subject</b> is in a school class and contains topics
 * @author guillaud
 */
public class SubjectDAOMySQL extends SubjectDAO {

    
    public SubjectDAOMySQL(Connection conn) {
    	super(conn); 
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
	
	public Topic getTopicOfOneSubject(int idSubject) throws SQLException {
		Topic topic = null;
		ResultSet resultTopic = this.con.createStatement(
				ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Topic WHERE idSubject = " + idSubject);
		if(resultTopic.first()) {
			topic = new Topic(
					resultTopic.getInt("idTopic"),
					resultTopic.getString("nameTopic"));
		}
		return topic;
	}

	@Override
	public ArrayList<Subject> findSubjectsByIdSchoolClass(int idSchoolClass) {
		Subject subject;
		Topic topic;
    	ArrayList<Subject> subjects = new ArrayList<Subject>();
    	ArrayList<Topic> topics = new ArrayList<Topic>();
		try {
			ResultSet result = this.con.createStatement().executeQuery("SELECT * FROM Subject WHERE idClass = " + idSchoolClass);
			while(result.next()){ 
				topic = getTopicOfOneSubject(result.getInt("idSubject"));
				topics.add(topic);
				subject = new Subject(
						result.getInt("idSubject"),
				  	    result.getString("nameSubject"),
				  	    topics
				);
				subjects.add(subject);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return subjects;
	}

	@Override
	public void deleteSubject(int idSubject) {
		// TODO Auto-generated method stub
		try {
			this.con.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeUpdate("DELETE FROM subject WHERE idSubject = " + idSubject);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateSubject(int idSubject, String nameSubject) {
		// TODO Auto-generated method stub
		try {
			this.con.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeUpdate("UPDATE subject SET nameSubject = '" + nameSubject + "' WHERE idSubject = " + idSubject);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Subject findSubjectById(int idSubject) {
		Subject subject = new Subject(0, null);      
	    
  	  try {
  	    ResultSet result = this.con.createStatement(
  	    ResultSet.TYPE_SCROLL_INSENSITIVE,
  	    ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM subject WHERE idSubject = " + idSubject);
  	    if(result.first())
  	    	subject = new Subject(
  	    			idSubject,
  	        result.getString("nameSubject")
  	        );         
  	  } catch (SQLException e) {
  	    e.printStackTrace();
  	  }
  	  return subject;
	}
	
	@Override
	public Subject findSubjectByName(String nameSubject) {
		Subject subject = new Subject(0, nameSubject);      
	    
  	  try {
  	    ResultSet result = this.con.createStatement(
  	    ResultSet.TYPE_SCROLL_INSENSITIVE,
  	    ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Subject WHERE nameSubject = " + nameSubject);
  	    if(result.first())
  	    	subject = new Subject(
  	    			result.getInt("idSubject"),
  	    			nameSubject
  	        );         
  	  } catch (SQLException e) {
  	    e.printStackTrace();
  	  }
  	  return subject;
	}

	@Override
	public void addSubject(Subject subject) {
		// TODO Auto-generated method stub
		int maxId = 0;
		try {
			ResultSet result = this.con.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT MAX(idSubject) AS max FROM subject");
			if(result.first())
	  	    	maxId = result.getInt("max") + 1; 
			
			this.con.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeUpdate("INSERT INTO subject VALUES (" + maxId + ",'" + subject.getNameSubject() + "',"+subject.getIdSchoolClass()+")");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}