package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

/**
 * <b>BdConnection</b> is used to connect into the database
 */
public class BdConnection {
	
	//Objet Connection
	private static Connection connect;
		 
	//Méthode qui va nous retourner notre instance et la créer si elle n'existe pas
	public static Connection getInstance(){
	    if(connect == null){
	    	try {
		    	Properties props = new Properties();
				props.setProperty("ssl","true");
		        connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:8889/polysharebase","root","root");
		    } catch (SQLException e) {
		    	e.printStackTrace();
		    }
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

}