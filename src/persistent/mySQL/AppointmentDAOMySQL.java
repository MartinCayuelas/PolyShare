package persistent.mySQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import application.classesApp.Appointment;
import persistent.DAO.AppointmentDAO;

/**
 * <b>Appointment</b> is a<b>Single Session</b>or a <b>Revision Session</b>
 */
public class AppointmentDAOMySQL extends AppointmentDAO {
    
	public AppointmentDAOMySQL(Connection con) {
		super(con);
    }
	
	public Appointment find(int id) {
		  Appointment appointment;      
		    
		  try {
			  ResultSet result = this.con.createStatement(
					  ResultSet.TYPE_SCROLL_INSENSITIVE,
					  ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Student WHERE idStudent = " + id);
			  if(result.first())
				  appointment = new Appointment(
						  id,
						  result.getString("nameStudent"),
						  result.getString("firstNameStudent"));         
		  } catch (SQLException e) {
			  e.printStackTrace();
		  }
		  return appointment;
	}

}