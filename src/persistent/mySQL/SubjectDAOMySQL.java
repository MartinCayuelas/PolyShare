package persistent.mySQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;
import java.util.*;

import application.classesApp.SchoolClass;
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

	@Override
	public ArrayList<Subject> findSubjectsByIdSchoolClass(int idSchoolClass) {
		Subject subject = new Subject(0, null, null);
    	ArrayList<Subject> subjects = new ArrayList<Subject>();
		try {
			ResultSet result = this.con.createStatement().executeQuery("SELECT * FROM subject WHERE idClass = " + idSchoolClass);
			while(result.next()){ 
				//Récupération des topics du subject
				ResultSet resultTopics = this.con.createStatement().executeQuery("SELECT * FROM topic WHERE idSubject = " + result.getInt("idSubject"));
				ArrayList<Topic> topics = new ArrayList<Topic>();
				while(resultTopics.next()){
					Topic t = new Topic(
							resultTopics.getInt("idTopic"),
							resultTopics.getString("nameTopic")
				  	    );
					topics.add(t);
				}
				
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
		
	}

	@Override
	public void updateSubject(int idSubject, String nameSubject) {
		// TODO Auto-generated method stub
		
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
		Subject subject = new Subject(0, null);      
	    
	  	  try {
	  	    ResultSet result = this.con.createStatement(
	  	    ResultSet.TYPE_SCROLL_INSENSITIVE,
	  	    ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM subject WHERE nameSubject = " + nameSubject);
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

}