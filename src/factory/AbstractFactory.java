package factory;

import persistent.DAO.AnswerDAO;
import persistent.DAO.AppointmentDAO;
import persistent.DAO.SchoolClassDAO;
import persistent.DAO.QuestionDAO;
import persistent.DAO.StudentDAO;
import persistent.DAO.SubjectDAO;
import persistent.DAO.TopicDAO;



/**
 * 
 */
public abstract class AbstractFactory {

    /**
     * Default constructor
     */
    public AbstractFactory() {
    }

    /**
     * @return
     */
    public AbstractFactory getFactoryMySql() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public StudentDAO createStudentDAO() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public QuestionDAO createQuestionDAO() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public AnswerDAO createAnswerDAO() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public AppointmentDAO createAppointmentDAO() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public SchoolClassDAO createSchoolClass() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public SubjectDAO createSubject() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public TopicDAO createTopic() {
        // TODO implement here
        return null;
    }

}