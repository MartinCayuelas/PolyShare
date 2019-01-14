package application.classesApp;

import java.util.*;

/**
 * @author ponthieu
 * <b>Topic</b> corresponds to a subject
 */
public class Topic {

    /**
     * Default constructor
     */
    public Topic(int idTopic, String nameTopic) {
    	this.idTopic = idTopic;
    	this.nameTopic = nameTopic;
    }
    
    
    
    
    public Topic(String nameTopic) {
		super();
		this.nameTopic = nameTopic;
	}
    
	public Topic(int idTopic, String nameTopic, Set<Question> listOfQuestions) {
		super();
		this.idTopic = idTopic;
		this.nameTopic = nameTopic;
		this.listOfQuestions = listOfQuestions;
	}

	private int idTopic;
    /**
     * 
     */
    private String nameTopic;


    /**
     * 
     */
    private Set<Question> listOfQuestions;
    
    private Set<MediaFile> listOfMediaFiles;



    /**
     * Get all the media files for a topic
     * @return list of media files for a topic
     */
    public Set<MediaFile> getMediaFiles() {
        return this.listOfMediaFiles;
    }

    /**
     * Add a media file to a topic
     * @param media media file added
     */
    public void addMediaFile(MediaFile media) {
        this.listOfMediaFiles.add(media);
    }

    /**
     * Add a question to a topic
     * @param quest question added
     */
    public void addQuestion(Question quest) {
        this.listOfQuestions.add(quest);
    }

    /**
     * Delete a question to a topic
     * @param quest question deleted
     */
    public void deleteQuestion(Question quest) {
        this.listOfQuestions.remove(quest);
    }

    /**
     * Get all the questions for a topic
     * @return list of questions for a topic
     */
    public Set<Question> getQuestions() {
        return this.listOfQuestions;
    }

    /**
     * Delete a media file for a topic
     * @param media media file deleted
     */
    public void deleteMediaFile(MediaFile media) {
        this.listOfMediaFiles.remove(media);
    }

    /**
     * Get the name of the topic
     * @return name of the topic
     */
    public String getNameTopic() {
        return this.nameTopic;
    }

    /**
     * Change the name of the topic
     * @param value new name of the topic
     */
    public void setNameTopic(String nameTopic) {
        this.nameTopic = nameTopic;
    }

    /**
     * getter id Topic
     * @return
     */

	public int getId() {
		return idTopic;
	}
	
	/**
	 * setter id topic
	 * @param idTopic
	 */
	public void setId(int idTopic) {
		this.idTopic = idTopic;
	}

}