package persistent.DAO;

import java.sql.Connection;

import application.classesApp.Answer;

/**
 * 
 */
public class AnswerDAO {

    private Connection con;
    
    public AnswerDAO(Connection con) {
    	this.con = con;
    }


    /**
     * @param a Answer
     * 
     * Creates a new Answer
     */
    public void createAnswer(Answer a) {
        // TODO implement here
    }

    /**
     * @param a
     * Add a like to the Answer
     */
    public void addLike(Answer a) {
        // TODO implement here
    }

}