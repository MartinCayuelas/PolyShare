package persistent.DAO;

import java.sql.Connection;

import application.classesApp.Question;
import application.classesApp.Topic;

/**
 * 
 */
public class TopicDAO {
	private Connection con;

    public TopicDAO(Connection con) {
		this.con = con;
    }



    /**
     * Creates a new Topic
     * @param topicname 
     * @return
     */
    public void CreateTopic(String topicname) {
        // TODO implement here
    }

    /**
     * Add a Question to the Topic
     * @param t
     * @param q 
     * @return
     */
    public void addQuestion(Topic t, Question q) {
        // TODO implement here
    }

    /**
     * Close a topic
     * @param t
     */
    public void close(Topic t) {
        // TODO implement here
    }

}