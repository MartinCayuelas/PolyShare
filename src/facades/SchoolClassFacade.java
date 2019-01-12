package facades;

import application.classesApp.SchoolClass;
import application.classesApp.Student;
import application.classesApp.Subject;
import facades.exceptions.DisconnectedStudentException;
import factory.AbstractFactory;
import persistent.DAO.SchoolClassDAO;
import persistent.Factories.DAOFactoryMySql;

/**
 * 
 */
public class SchoolClassFacade {
	AbstractFactory factory = new DAOFactoryMySql(); 

	/**
	 * Default constructor
	 */
	public SchoolClassFacade(AbstractFactory factory) {
		this.factory = factory;
	}

	/**
	 * @param className Create a new SchoolClass and save it
	 * 
	 */
	public void CreateSchoolClass(String className) {
		try {
			Student coStudent = LoginFacade.getInstance().getConnectedStudent();
			SchoolClass sc = new SchoolClass(className);
			SchoolClassDAO scDAO = factory.createSchoolClassDAO();
			scDAO.createSchoolClass(sc, coStudent);
		} catch (DisconnectedStudentException e) {
			e.printStackTrace();
		}


	}

	/**
	 * @param subjectName Create a new subject and save it
	 */
	public void CreateSubject(String subjectName) {
		// TODO implement here
	}

	/**
	 * @param topicName
	 * @param subject   Create a topic linked to a subject and save it
	 */
	public void CreateTopic(String topicName, Subject subject) {
		// TODO implement here
	}

	/**
	 * @param s the name of the researched schoolClass
	 * @return SchollClass return the matched schoolClass
	 */
	public SchoolClass findSchoolClass(String s) {
		// TODO implement here
		return null;
	}

	/**
	 * @param SchoolClass Make a demand to the admin of the class. The admin can
	 *                    accept the demand.
	 * 
	 */
	public void joinSchoolClass(SchoolClass schoolClass) {
		// TODO implement here
	}

}