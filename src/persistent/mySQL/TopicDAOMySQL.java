package persistent.mySQL;

import java.sql.Connection;
import java.util.ArrayList;

import application.classesApp.Question;
import application.classesApp.Topic;
import persistent.DAO.TopicDAO;

/**
 * <b>Topic</b> corresponds to a subject
 * @author guillaud
 */
public class TopicDAOMySQL extends TopicDAO {

    
    public TopicDAOMySQL(Connection con) {
    	super(con);
    }

	@Override
	public void createTopic(String topicname) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addQuestion(Topic t, Question q) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close(Topic t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Topic> findTopicsByIdSubject(int idSubject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteTopic(int idTopic) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTopic(int idTopic, String nameTopic) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Topic findTopicById(int idTopic) {
		// TODO Auto-generated method stub
		return null;
	}

}