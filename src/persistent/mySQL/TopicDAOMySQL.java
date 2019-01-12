package persistent.mySQL;

import java.sql.Connection;

import application.classesApp.Question;
import application.classesApp.Topic;
import persistent.DAO.TopicDAO;

/**
 * <b>Topic</b> corresponds to a subject
 */
public class TopicDAOMySQL extends TopicDAO {

    
    public TopicDAOMySQL(Connection con) {
    	super(con);
    }

	@Override
	public void CreateTopic(String topicname) {
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

}