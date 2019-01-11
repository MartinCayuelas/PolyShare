package persistent.Factories;

import java.sql.Connection;

import database.BdConnection;
import factory.AbstractFactory;
import persistent.DAO.StudentDAO;
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





}