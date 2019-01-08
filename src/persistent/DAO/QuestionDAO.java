package persistent.DAO;


import application.classesApp.Question;

/**
 * 
 */
public class QuestionDAO {

    /**
     * Default constructor
     */
    public QuestionDAO() {
    }


    /**
     * @param q 
     * Creates a new Question
     */
    public void createQuestion(Question q) {
        // TODO implement here
    }

    /**
     * @param id 
     * @return Question
     * Return a Question that correspond to the id in param
     */
    public Question findById(int id) {
        // TODO implement here
        return null;
    }

    /**
     * @param q
     * Close a question (including all the answers corresponding to the Question)
     */
    public void close(Question q) {
        // TODO implement here
    }

}