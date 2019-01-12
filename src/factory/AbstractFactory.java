package factory;

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
    public StudentDAO getStudentDAO() {
        // TODO implement here
        return null;
    }

    /**
     * Create a Question DAO
     * @return question DAO
     */
    public QuestionDAO createQuestionDAO() {
        // TODO implement here
        return null;
    }

    /**
     * Create an Answer DAO
     * @return answer DAO
     */
    public AnswerDAO createAnswerDAO() {
        // TODO implement here
        return null;
    }

    /**
     * Create an Appointment DAO
     * @return appointment DAO
     */
    public AppointmentDAO createAppointmentDAO() {
        // TODO implement here
        return null;
    }

    /**
     * Create a SchoolClass DAO
     * @return schoolClass DAO
     */
    public SchoolClassDAO createSchoolClassDAO() {
        // TODO implement here
        return null;
    }

    /**
     * Create a Subject DAO
     * @return subject DAO
     */
    public SubjectDAO createSubjectDAO() {
        // TODO implement here
        return null;
    }

    /**
     * Create a Topic DAO
     * @return topic DAO
     */
    public TopicDAO createTopicDAO() {
        // TODO implement here
        return null;
    }
    

    /**
     * Create a Skill DAO
     * @return Skill DAO
     */
    public SkillDAO createSkillDAO() {
        // TODO implement here
        return null;
    }

    /**
     * Create a MediaFileDAO 
     * @return MediaFileDAO
     */
    public MediaFileDAO createMediaFileDAO() {
        // TODO implement here
        return null;
    }

	public SchoolClassDAO getSchoolClassDAO() {
		// TODO Auto-generated method stub
		return null;
	}
}
