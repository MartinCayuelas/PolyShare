package persistent.DAO;


import java.sql.Connection;

import application.classesApp.Question;

/**
 * 
 */
public abstract class QuestionDAO {

	protected Connection connect = null;

    /**
     * Default constructor
     */
    public QuestionDAO(Connection conn) {
    	this.connect = conn;
    }


    /**
     * @param q 
     * Creates a new Question
     */
    public abstract void createQuestion(Question q);

    /**
     * @param id 
     * @return Question
     * Return a Question that correspond to the id in param
     */
    public abstract Question findById(int id);

    /**
     * @param q
     * Close a question (including all the answers corresponding to the Question)
     */
    public abstract void close(Question q);

}