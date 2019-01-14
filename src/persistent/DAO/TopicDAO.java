package persistent.DAO;

import java.sql.Connection;
import java.util.ArrayList;

import application.classesApp.Question;
import application.classesApp.Subject;
import application.classesApp.Topic;

/**
 * @author guillaud
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
    public abstract void createTopic(String topicname);

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
    
    /**
     * Search Topics with a Subject Id
     * @param idSubject 
     * @return list of topics
     */
    public abstract ArrayList<Topic> findTopicsByIdSubject(int idSubject);
    
    /**
     * Remove a Topic to the Subject
     * @param idTopic the ID of the future deleted topic
     */
    public abstract void deleteTopic(int idTopic);
    

    /**
     * Update a Topic
     * @param idTopic the ID of the updated topic
     *  @param nameTopic the new name of the topic
     */
    public abstract void updateTopic(int idTopic, String nameTopic);
    
    /**
     * Find a Topic
     * @param idTopic 
     * @return topic found
     */
    public abstract Topic findTopicById(int idTopic);

}