package factory;

import database.BdConnection;
import persistent.DAO.*;
import persistent.Factories.DAOFactoryMySql;

/**
 * <b>AbstractFactory</b> is used to create all the DAO objects
 */
public abstract class AbstractFactory {

    /**
     * Default constructor
     */
    public AbstractFactory() {
    }

    /**
     * Get the MySQL Factory
     * @return factory MySQL
     */
    public static AbstractFactory getFactoryMySql() {
        // TODO implement here
    	return new DAOFactoryMySql();
    }

    /**
     * Create a Student DAO
     * @return student DAO
     */
    public abstract StudentDAO getStudentDAO();

    /**
     * Create a Question DAO
     * @return question DAO
     */
    public abstract QuestionDAO createQuestionDAO();

    /**
     * Create an Answer DAO
     * @return answer DAO
     */
    public abstract AnswerDAO createAnswerDAO();

    /**
     * Create an Appointment DAO
     * @return appointment DAO
     */
    public abstract AppointmentDAO createAppointmentDAO();

    /**
     * Create a SchoolClass DAO
     * @return schoolClass DAO
     */
    public abstract SchoolClassDAO createSchoolClassDAO();
    /**
     * Create a Subject DAO
     * @return subject DAO
     */
    public abstract SubjectDAO createSubjectDAO();

    /**
     * Create a Topic DAO
     * @return topic DAO
     */
    public abstract TopicDAO createTopicDAO();

    /**
     * Create a MediaFileDAO 
     * @return MediaFileDAO
     */
    public abstract MediaFileDAO createMediaFileDAO();

    /**
     * Create a SchoolClassDAO
     * @return SchoolClassDAO
     */
    
	public abstract SchoolClassDAO getSchoolClassDAO();
}
