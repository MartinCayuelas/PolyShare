package application.classesApp;

/**
 * <b>Answer</b> to a question on the forum
 */
public class Answer {

    /**
     * Default constructor
     */
    public Answer() {
    }

    /**
     * 
     */
    public int nbLikesAnswer;

    /**
     * 
     */
    public Question listOfAnswer;

    /**
     * Like an answer
     */
    public void addLike() {
        // TODO implement here
    }

    /**
     * Modify the content of an answer
     * @param text new content of the answer
     */
    public void modifyAnswer(String text) {
        // TODO implement here
    }

    /**
     * Delete a like on an asnwer
     */
    public void deleteLike() {
        // TODO implement here
    }

    /**
     * @return Total number of like for an answer
     */
    public int getNbLikesAnswer() {
        // TODO implement here
        return 0;
    }

    /**
     * Change the number of like for an answer (+1 or -1)
     * @param value new number of like for an answer
     */
    public void setNbLikesAnswer(int value) {
        // TODO implement here
    }

}