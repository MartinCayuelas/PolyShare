package database;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * <b>BdConnection</b> is used to connect into the database
 */
public class BdConnection {

	// Objet Connection
	private static Connection connect;

	// Méthode qui va nous retourner notre instance et la créer si elle n'existe pas
	public static Connection getInstance(){
	    if(connect == null){
	    	try {
	    		
	    		JSONObject jsonObject;
	    			    			
	    		FileReader fr = new FileReader("configDb.txt");
	    		BufferedReader br = new BufferedReader(fr);
	    		String sCurrentLine;
	    		String txt = "";
	    		while ((sCurrentLine = br.readLine()) != null) {
	    			txt += sCurrentLine;
	   			}
	  			br.close();
	   			jsonObject = new JSONObject(txt);
    			String url = (String) jsonObject.get("url");
	   			String user = (String) jsonObject.get("user");
	   			String password = (String) jsonObject.get("password");
	    		    		
	    		
		    	Properties props = new Properties();
				props.setProperty("ssl","true");
		        connect = DriverManager.getConnection(url, user, password);
		    } catch (SQLException | IOException | JSONException e) {
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