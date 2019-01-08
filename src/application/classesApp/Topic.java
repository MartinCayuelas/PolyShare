package application.classesApp;

import java.util.*;

/**
 * <b>Topic</b> corresponds to a subject
 */
public class Topic {

    /**
     * Default constructor
     */
    public Topic() {
    }

    /**
     * 
     */
    public String nameTopic;


    /**
     * 
     */
    public Set<Question> listOfQuestions;



    /**
     * Get all the media files for a topic
     * @return list of media files for a topic
     */
    public Set<MediaFile> getMediaFiles() {
        // TODO implement here
        return null;
    }

    /**
     * Add a media file to a topic
     * @param media media file added
     */
    public void addMediaFile(MediaFile media) {
        // TODO implement here
    }

    /**
     * Add a question to a topic
     * @param quest question added
     */
    public void addQuestion(Question quest) {
        // TODO implement here
    }

    /**
     * Delete a question to a topic
     * @param quest question deleted
     */
    public void deleteQuestion(Question quest) {
        // TODO implement here
    }

    /**
     * Get all the questions for a topic
     * @return list of questions for a topic
     */
    public Set<Question> getQuestions() {
        // TODO implement here
        return null;
    }

    /**
     * Delete a media file for a topic
     * @param media media file deleted
     */
    public void deleteMediaFile(MediaFile media) {
        // TODO implement here
    }

    /**
     * Get the name of the topic
     * @return name of the topic
     */
    public String getNameTopic() {
        // TODO implement here
        return "";
    }

    /**
     * Change the name of the topic
     * @param value new name of the topic
     */
    public void setNameTopic(String value) {
        // TODO implement here
    }

}