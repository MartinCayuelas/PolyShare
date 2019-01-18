package ui;

import java.io.IOException;
import java.util.HashMap;
import application.Main;
import javafx.fxml.FXMLLoader;

/**
 * 
 * @author ponthieu
 * 
 *         Cette class gère le routing de l'application Elle est initialisée au
 *         lancement de lapplication.
 * 
 *
 */
public class Router {

	private HashMap<String, String> screenMap = new HashMap<>();
	private Object[] params;
	
	// Instance unique (singleton)
	private static Router INSTANCE = null;

	public static Router getInstance() {

		if (INSTANCE == null) {
			INSTANCE = new Router();
		}

		return INSTANCE;
	}

	private Router() {
	}

	/**
	 * 
	 * @param name
	 * @param pane
	 */
	public void add(String name, String pane) {
		screenMap.put(name, pane);
	}

	/**
	 * @param name - Name of the scene that should be load
	 */
	public void activate(String name) {
		this.params = new String[0];
		try {
			
			Main.primaryStage.getScene().setRoot(FXMLLoader.load(getClass().getResource(INSTANCE.getScreenMap().get(name))));
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		
	}

	/**
	 * @param name   - Name of the scene that should be load
	 * @param params - Given params for the new view displayed
	 */
	public void activate(String name, Object[] params) {
		this.params = params;
		try {
			Main.primaryStage.getScene()
							.setRoot(FXMLLoader.load(getClass().getResource(INSTANCE.getScreenMap().get(name))));
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		
	}
	
	/**
	 * 
	 * @return give the params to the new loaded view
	 */
	public Object[] getParams() {
		return this.params;
	}

	public String toString() {
		return INSTANCE.screenMap.toString();
	}

	public HashMap<String, String> getScreenMap() {
		return screenMap;
	}

}
