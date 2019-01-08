package application.classesApp;

import java.util.*;

/**
 * <b>Question</b> on the forum
 */
public class Question {

    /**
     * Default constructor
     */
    public Question() {
    }

    /**
     * 
     */
    public int nbLikesQuestion;



    /**
     * Add a like for a Question
     */
    public void addLike() {
        // TODO implement here
    }

    /**
     * Add an answer to the question
     * @param ans new answer for the question
     */
    public void addAnswer(Answer ans) {
        // TODO implement here
    }

    /**
     * Get all the answers for a question
     * @return list of answers for a question
     */
    public Set<Answer> getAnswers() {
        // TODO implement here
        return null;
    }

    /**
     * Modify the content of a question
     * @param text new content of a question
     */
    public void modifyQuestion(String text) {
        // TODO implement here
    }

    /**
     * Delete a like for a question
     */
    public void deleteLike() {
        // TODO implement here
    }

    /**
     * Get the total number of like for a question
     * @return total number of like for a question
     */
    public int getNbLikesQuestion() {
        // TODO implement here
        return 0;
    }

    /**
     * Change the total number of like for a question (+1 or -1)
     * @param value new number of like for a question
     */
    public void setNbLikesQuestion(int value) {
        // TODO implement here
    }

    /**
     * Close a post on the forum
     */
    public void closePost() {
        // TODO implement here
    }

}