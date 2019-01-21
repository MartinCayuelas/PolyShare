package database;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author ponthieu
 * 
 * <b>BdConnection</b> is used to connect into the database
 */
public class BdConnection {

	// Objet Connection
	private static Connection connect;

	// Méthode qui va nous retourner notre instance et la créer si elle n'existe pas
	public static synchronized Connection getInstance(){
	    if(connect == null){
	    
	    		
	    		
	    			    			
	    		
	    		    		
	    		
		    	Properties props = new Properties();
				props.setProperty("ssl","true");
				try {
					connect = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/polyshare?user=polyshare&password=polyshare");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        //connect = DriverManager.getConnection(url, user, password);
		   
		 }      
		 return connect;
	}

	/**
	 * Default constructor
	 */
	public BdConnection() {
	}

	/**
	 * Create a statement to connect to the database
	 */
	public void createStatement() {
		// TODO implement here
	}
	
	/**
	 * make a request with no response like update, insert or delete
	 * @param request
	 * @return number row affected by the request
	 */
	public static int request(String request) {
		Statement st;
		Connection co = BdConnection.getInstance();

		try {
			st = co.createStatement();
			// insert the class
			return st.executeUpdate(request);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return 0;
	}

	/**
	 * @param request
	 * @return a resulset of the result from de db
	 */
	public static ResultSet selectRequest(String request) {
		Statement st;
		ResultSet rs = null;
		Connection co = BdConnection.getInstance();
		
		try {
			st = co.createStatement();
			// insert the class
			rs = st.executeQuery(request);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return rs;
	}
	
	/**
	 * @param request
	 * @return the id of the last insered obj
	 */
	public static int insertRequest(String request) {
		Statement st;
		Connection co = BdConnection.getInstance();
		int idMax = -1;
		try {
			st = co.createStatement();
			// insert the class
			int nbRow = st.executeUpdate(request);
			if (nbRow > 0) {
				
				ResultSet rsId = st.getGeneratedKeys();
				
				if (rsId.next()) {
					idMax = rsId.getInt(1);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return idMax;
	}

}