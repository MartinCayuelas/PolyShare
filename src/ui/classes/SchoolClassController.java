package ui.classes;

import java.io.IOException;
import java.util.*;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * 
 */
public class SchoolClassController extends Application {
	
	//Partie du lancement de la fenêtre
	private Stage primaryStage;
    private AnchorPane classLayout;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
        this.primaryStage.setTitle("ClassApp");

        initClassLayout();
	}
	
	public void initClassLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader(SchoolClassController.class.getResource("SchoolClass.fxml"));
            classLayout = (AnchorPane) loader.load();
            
            // Show the scene containing the class layout.
            Scene scene = new Scene(classLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	/**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }

	public static void main(String[] args) {
		launch(args);
	}

	//Partie du controller
    /**
     * Default constructor
     */
    public SchoolClassController() {
    }


    /**
     * @return
     */
    public void Create() {
        // TODO implement here
    }

    /**
     * @param s 
     * @return
     */
    public void find(String s) {
        // TODO implement here
    }

    /**
     * @return
     */
    public void join() {
        // TODO implement here
    }

}