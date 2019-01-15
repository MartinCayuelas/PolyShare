package persistent.DAO;

import java.sql.Connection;
import java.util.List;

import application.classesApp.Answer;
import application.classesApp.Question;

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
    public abstract boolean addLike(Answer a);
    
    /**
     * 
     * @param idAnswer
     * @return all the answer attached to this question
     */
	public abstract List<Answer> getAllAnswerByQuestion(int idAnswer);

	/**
	 * 
	 * @param answer
	 * @param idQuestion
	 * add a new answer
	 */
	public abstract void  addAnswer(Answer answer, int idQuestion);

}