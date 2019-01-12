package persistent.mySQL;

import java.sql.Connection;
import java.util.*;

import persistent.DAO.AppointmentDAO;

/**
 * <b>Appointment</b> is a<b>Single Session</b>or a <b>Revision Session</b>
 */
public class AppointmentDAOMySQL extends AppointmentDAO {
    
	public AppointmentDAOMySQL(Connection con) {
		super(con);
    }

}