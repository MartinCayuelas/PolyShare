package facades;

import java.util.ArrayList;
import java.util.List;

import application.classesApp.Answer;
import application.classesApp.Question;
import application.classesApp.SchoolClass;
import application.classesApp.Skill;
import application.classesApp.Student;
import application.classesApp.Subject;
import application.classesApp.Topic;
import facades.exceptions.DisconnectedStudentException;
import factory.AbstractFactory;
import persistent.DAO.AnswerDAO;
import persistent.DAO.QuestionDAO;
import persistent.DAO.SchoolClassDAO;
import persistent.DAO.SubjectDAO;
import persistent.DAO.TopicDAO;
import persistent.factories.DAOFactoryMySql;

/**
 * @author guillaud, ponthieu
 */
public class SchoolClassFacade {
	AbstractFactory factory = new DAOFactoryMySql(); 

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
		SchoolClassDAO scDAO = factory.createSchoolClassDAO();
		SchoolClass sc = scDAO.getSchoolClassByName(s);
		return sc;
	}
	
	/**
	 * @param s the name of the researched schoolClass
	 * @return SchollClass return matched schoolClass (all schoolClass begin with s, not case sensitive)
	 */
	public List<SchoolClass> findMatchedSchoolClass(String pattern) {
		SchoolClassDAO scDAO = factory.createSchoolClassDAO();
		return scDAO.getMatchedSchoolClasses(pattern);
	}
	
	/**
	 * @param id - the id of the researched schoolClass
	 * @return SchoolClass return the matched schoolClass
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
	 * @return 
	 */
	public List<SchoolClass> getAllSchoolClassConnectedStudent() {
		SchoolClassDAO scDAO = this.factory.createSchoolClassDAO();
		//Student co = LoginFacade.getInstance().getConnectedStudent();
		return scDAO.getAllSchoolClassByIdStudent(1);
	}
	
	public List<SchoolClass> getAllSchoolClass() {
		SchoolClassDAO scDAO = this.factory.createSchoolClassDAO();
		//Student co = LoginFacade.getInstance().getConnectedStudent();
		return scDAO.getAllSchoolClasses();
	}
	
	////////////
	//SUBJECTS//
	////////////
	
	/* Get all the subjects for a SchoolClass
	 * @param schoolClass SchoolClass to analize
	 * @return list of subject's for the schoolclass
	 */
	public ArrayList<Subject> getSubjects(int idSchoolClass) {
		SubjectDAO sDAO = factory.createSubjectDAO();
		ArrayList<Subject> listSubjects = sDAO.findSubjectsByIdSchoolClass(idSchoolClass);
		return listSubjects;
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
	public void updateSubject(int id, String name) {
		SubjectDAO sDAO = factory.createSubjectDAO();
		sDAO.updateSubject(id, name);
	}
	
	/**
     * Add the Subject in param
     * @param Subject the Subject to add 
     * 
     */
    public void addSubject(Subject subject) {
    	SubjectDAO sDAO = factory.createSubjectDAO();
		sDAO.addSubject(subject);
    }
	
	//////////
	//TOPICS//
	//////////
	
	/**
	 * Get all the topics for a Subject in a SchoolClass
	 * @param idSubject ID of the Subject to analize
	 * @return list of topic's for the subject in the schoolclass
	 */
	public ArrayList<Topic> getTopics(int idSubject) {
		TopicDAO tDAO = factory.createTopicDAO();
		ArrayList<Topic> listTopics = tDAO.findTopicsByIdSubject(idSubject);
		return listTopics;
	}
	
	/**
	 * find a Topic with an ID
	 * @param id the id of the researched Topic
	 * @return Subject return the matched schoolClass
	 */
	public Topic findTopicById(int id) {
		TopicDAO tDAO = factory.createTopicDAO();
		Topic s = tDAO.findTopicById(id);
		return s;
	}
	
	/**
	 * Delete a Topic with an ID
	 * @param id the id of the researched Topic
	 */
	public void deleteTopic(int id) {
		TopicDAO tDAO = factory.createTopicDAO();
		tDAO.deleteTopic(id);
	}
	
	/**
	 * Update a Topic with an ID
	 * @param id the id of the researched Topic
	 * @param name the new name for the Topic
	 */
	public void updateTopic(int id, String name) {
		TopicDAO tDAO = factory.createTopicDAO();
		tDAO.updateTopic(id, name);
	}
	
	/**
     * Add the Topic in param
     * @param Topic the Topic to add 
     * 
     */
    public void addTopic(Topic topic) {
    	TopicDAO tDAO = factory.createTopicDAO();
		tDAO.addTopic(topic);
    }
    
	/**
	 * 
	 * @param topic 
	 * @return all question of the topic
	 */
	public List<Question> getAllQuestionByTopic(Topic topic) {
		QuestionDAO qDAO = factory.createQuestionDAO();
		
		return qDAO.getAllQuestionByIdTopic(topic.getId());
	}
	
	/**
	 * 
	 * @param topic 
	 * @return all question of the topic
	 */
	public List<Answer> getAllAnswerByQuestion(Question question) {
		AnswerDAO aDAO = factory.createAnswerDAO();
		
		return aDAO.getAllAnswerByQuestion(question.getId());
	}
	
	/**
	 * 
	 * @param ans
	 * add a like or delete a like on this answer from connected student
	 * return true if the answer were already liked by this student
	 */
	public boolean likeAnswer(Answer ans) {
		AnswerDAO aDAO = factory.createAnswerDAO();
		return aDAO.addLike(ans);
	}
	
	/**
	 * 
	 * @param idQuestion - question attached to the answer
	 * @param content - the content of the answer
	 */
	public void addAnswer(int idQuestion, String content) {
		AnswerDAO aDAO = factory.createAnswerDAO();
		aDAO.addAnswer(new Answer(content), idQuestion);
	}
	
	/**
	 * 
	 * @param question
	 * like the given question
	 */
	public void likeQuestion(Question question) {
		QuestionDAO qDAO = factory.createQuestionDAO();
		qDAO.addLike(question);
	}

	/**
	 * Add a question
	 * @param content - content of the question
	 * @param id
	 */
	public void addQuestion(String content, int idTopic) {
		QuestionDAO qDAO = factory.createQuestionDAO();
		qDAO.addQuestion(new Question(content), idTopic);
	}

}