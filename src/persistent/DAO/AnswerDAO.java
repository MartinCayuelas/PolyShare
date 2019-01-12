package persistent.DAO;

import java.sql.Connection;

import application.classesApp.Answer;

/**
 * @author ponthieu
 */
public abstract class AnswerDAO {

    private Connection con;
    
    public AnswerDAO(Connection con) {
    	this.con = con;
    }


    /**
     * @param a Answer
     * 
     * Creates a new Answer
     */
    public abstract void createAnswer(Answer a);

    /**
     * @param a
     * Add a like to the Answer
     */
    public abstract void addLike(Answer a);

}