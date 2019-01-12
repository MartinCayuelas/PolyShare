package persistent.Factories;

import java.sql.Connection;

import database.BdConnection;
import factory.AbstractFactory;
import persistent.DAO.AnswerDAO;
import persistent.DAO.AppointmentDAO;
import persistent.DAO.MediaFileDAO;
import persistent.DAO.QuestionDAO;
import persistent.DAO.SchoolClassDAO;
import persistent.DAO.SkillDAO;
import persistent.DAO.StudentDAO;
import persistent.DAO.SubjectDAO;
import persistent.DAO.TopicDAO;
import persistent.mySQL.AnswerDAOMySQL;
import persistent.mySQL.AppointmentDAOMySQL;
import persistent.mySQL.MediaFileDAOMySQL;
import persistent.mySQL.QuestionDAOMySQL;
import persistent.mySQL.SchoolClassDAOMySQL;
import persistent.mySQL.SkillDAOMySQL;
import persistent.mySQL.StudentDAOMySQL;
import persistent.mySQL.SubjectDAOMySQL;
import persistent.mySQL.TopicDAOMySQL;

/**
 * 
 * @author ponthieu
 *
 */
public class DAOFactoryMySql extends AbstractFactory {

	protected static final Connection conn = BdConnection.getInstance();

	/**
	 * Retourne un objet Classe interagissant avec la BDD
	 * 
	 * @return DAO
	 */
	public StudentDAO getStudentDAO() {
		return new StudentDAOMySQL(conn);
	}

	
	public SkillDAO createSkillDAO(){
		return new SkillDAOMySQL(conn);
	}

	public SchoolClassDAO getSchoolClassDAO() {
		return new SchoolClassDAOMySQL(conn);
	}

	@Override
	public SchoolClassDAO createSchoolClassDAO() {
		return new SchoolClassDAOMySQL(conn);
	}

	@Override
	public QuestionDAO createQuestionDAO() {
		return new QuestionDAOMySQL(conn);
	}

	@Override
	public AnswerDAO createAnswerDAO() {
		return new AnswerDAOMySQL(conn);
	}

	@Override
	public AppointmentDAO createAppointmentDAO() {
		return new AppointmentDAOMySQL(conn);
	}

	@Override
	public SubjectDAO createSubjectDAO() {
		return new SubjectDAOMySQL(conn);
	}

	@Override
	public TopicDAO createTopicDAO() {
		return new TopicDAOMySQL(conn);
	}

	@Override
	public MediaFileDAO createMediaFileDAO() {
		return new MediaFileDAOMySQL(conn);
	}

}