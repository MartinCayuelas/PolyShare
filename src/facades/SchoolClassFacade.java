package facades;

import java.util.ArrayList;

import application.classesApp.SchoolClass;
import application.classesApp.Skill;
import application.classesApp.Student;
import application.classesApp.Subject;
import application.classesApp.Topic;
import facades.exceptions.DisconnectedStudentException;
import factory.AbstractFactory;
import persistent.DAO.SchoolClassDAO;
import persistent.DAO.SubjectDAO;
import persistent.Factories.DAOFactoryMySql;

/**
 * @author guillaud, ponthieu
 */
public class SchoolClassFacade {
	AbstractFactory factory = new DAOFactoryMySql(); 

	/**
	 * Default constructor
	 */
	public SchoolClassFacade(AbstractFactory factory) {
		this.factory = factory;
	}

	public SchoolClassFacade() {
		// TODO Auto-generated constructor stub
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
	 * @param id the id of the researched schoolClass
	 * @return SchollClass return the matched schoolClass
	 */
	public SchoolClass findSchoolClassId(int id) {
		// TODO implement here
		
		SchoolClassDAO scDAO = factory.createSchoolClassDAO();
		SchoolClass sc = scDAO.findById(id);
		return sc;
	}

	/**
	 * @param SchoolClass Make a demand to the admin of the class. The admin can
	 *                    accept the demand.
	 * 
	 */
	public void joinSchoolClass(SchoolClass schoolClass) {
		// TODO implement here
	}
	
	/**
	 * Get all the subjects for a SchoolClass
	 * @param idSchoolClass SchoolClass to analize
	 * @return list of subject's for the schoolclass
	 */
	public ArrayList<Subject> getSubjects(int idSchoolClass) {
		SubjectDAO sDAO = factory.createSubjectDAO();
		ArrayList<Subject> listSubjects = sDAO.findSubjectsByIdSchoolClass(idSchoolClass);
		return listSubjects;
	}
	
	/**
	 * Get all the topics for a Subject in a SchoolClass
	 * @param schoolClass SchoolClass to analize
	 * @param subject Subject to analize
	 * @return list of topic's for the subject in the schoolclass
	 */
	public ArrayList<Topic> getTopics(SchoolClass schoolClass, Subject subject) {
		// TODO implement here
		return null;
	}
	
	/**
	 * find a Subject with an ID
	 * @param id the id of the researched subject
	 * @return Subject return the matched schoolClass
	 */
	public Subject findSubjectById(int id) {
		SubjectDAO sDAO = factory.createSubjectDAO();
		Subject s = sDAO.findSubjectById(id);
		return s;
	}
	
	/**
	 * Delete a Subject with an ID
	 * @param id the id of the researched subject
	 */
	public void deleteSubject(int id) {
		SubjectDAO sDAO = factory.createSubjectDAO();
		sDAO.deleteSubject(id);
	}
	
	/**
	 * Update a Subject with an ID
	 * @param id the id of the researched subject
	 * @param name the new name for the subject
	 */
	public void deleteSubject(int id, String name) {
		SubjectDAO sDAO = factory.createSubjectDAO();
		sDAO.updateSubject(id, name);
	}

}