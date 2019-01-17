package persistent.mySQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import application.classesApp.Question;
import application.classesApp.Subject;
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
		Topic topic = new Topic(0, null);
    	ArrayList<Topic> topics = new ArrayList<Topic>();
		try {
			ResultSet result = this.con.createStatement().executeQuery("SELECT * FROM topic WHERE idSubject = " + idSubject);
			while(result.next()){ 
				topic = new Topic(
					result.getInt("idTopic"),
		  	        result.getString("nameTopic")
		  	    );
				topics.add(topic);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return topics;
	}

	@Override
	public void deleteTopic(int idTopic) {
		// TODO Auto-generated method stub
		try {
			this.con.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeUpdate("DELETE FROM topic WHERE idTopic = " + idTopic);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateTopic(int idTopic, String nameTopic) {
		// TODO Auto-generated method stub
		try {
			this.con.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeUpdate("UPDATE topic SET nameTopic = '" + nameTopic + "' WHERE idTopic = " + idTopic);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Topic findTopicById(int idTopic) {
		Topic topic = new Topic(0, null);      
	    
	  	  try {
	  	    ResultSet result = this.con.createStatement(
	  	    ResultSet.TYPE_SCROLL_INSENSITIVE,
	  	    ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM topic WHERE idTopic = " + idTopic);
	  	    if(result.first())
	  	    	topic = new Topic(
	  	    			idTopic,
	  	        result.getString("nameTopic")
	  	        );         
	  	  } catch (SQLException e) {
	  	    e.printStackTrace();
	  	  }
	  	  return topic;
		}

	@Override
	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		int maxId = 0;
		try {
			ResultSet result = this.con.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT MAX(idTopic) AS max FROM topic");
			if(result.first())
	  	    	maxId = result.getInt("max") + 1; 
			
			this.con.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeUpdate("INSERT INTO topic VALUES (" + maxId + "," + topic.getIdSubject() + ",'" + topic.getNameTopic() + "')");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}