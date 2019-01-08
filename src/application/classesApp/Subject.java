package application.classesApp;

import java.util.Set;

/**
 * <b>Subject</b> is in a school class and contains topics
 */
public class Subject {

    /**
     * Default constructor
     */
    public Subject() {
    }

    /**
     * 
     */
    public String nameSubject;




    /**
     * 
     */
    public Set<Topic> listofTopics;


    /**
     * Get all the topics for a subject
     * @return list of topics for a subject
     */
    public Set<Topic> getTopics() {
        // TODO implement here
        return null;
    }

    /**
     * Add a topic for a subject
     * @param top topic added
     */
    public void addTopic(Topic top) {
        // TODO implement here
    }

    /**
     * Delete a topic for a subject
     * @param top topic deleted
     */
    public void deleteTopic(Topic top) {
        // TODO implement here
    }

    /**
     * Get the name of the subject
     * @return name of the subject
     */
    public String getNameSubject() {
        // TODO implement here
        return "";
    }

    /**
     * Change the name of the subject
     * @param value new name of the subject
     */
    public void setNameSubject(String value) {
        // TODO implement here
    }

}