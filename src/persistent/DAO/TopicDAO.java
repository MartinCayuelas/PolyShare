package persistent.DAO;

import java.sql.Connection;

import application.classesApp.Question;
import application.classesApp.Topic;

/**
 * 
 */
public abstract class TopicDAO {
	private Connection con;

    public TopicDAO(Connection con) {
		this.con = con;
    }

    /**
     * Creates a new Topic
     * @param topicname 
     * @return
     */
    public abstract void CreateTopic(String topicname);

    /**
     * Add a Question to the Topic
     * @param t
     * @param q 
     * @return
     */
    public abstract void addQuestion(Topic t, Question q);

    /**
     * Close a topic
     * @param t
     */
    public abstract void close(Topic t);

}