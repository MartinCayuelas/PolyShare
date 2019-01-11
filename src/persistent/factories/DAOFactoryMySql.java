package persistent.factories;

import java.sql.Connection;

import database.BdConnection;
import factory.AbstractFactory;
import persistent.DAO.SchoolClassDAO;
import persistent.DAO.StudentDAO;
import persistent.mySQL.SchoolClassDAOMySQL;
import persistent.mySQL.StudentDAOMySQL;

/**
 * 
 */
public class DAOFactoryMySql extends AbstractFactory {

	protected static final Connection conn = BdConnection.getInstance();   
	   
	  /**
	  * Retourne un objet Classe interagissant avec la BDD
	  * @return DAO
	  */
	  public StudentDAO getStudentDAO(){
	    return new StudentDAOMySQL(conn);
	  }
	  
	  public SchoolClassDAO getSchoolClassDAO(){
		    return new SchoolClassDAOMySQL(conn);
		  }



}