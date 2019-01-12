package ui.topic;

import java.io.IOException;
import java.util.*;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import ui.classes.SchoolClassController;

/**
 * 
 */
public class TopicController extends Application {
	
	//Partie du lancement de la fenêtre
	private Stage primaryStage;
    private AnchorPane topicLayout;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
        this.primaryStage.setTitle("ClassApp");

        initClassLayout();
	}
	
	public void initClassLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader(TopicController.class.getResource("Topic.fxml"));
            topicLayout = (AnchorPane) loader.load();
            
            // Show the scene containing the class layout.
            Scene scene = new Scene(topicLayout);
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
    public TopicController() {
    }


    /**
     * @return
     */
    public void create() {
        // TODO implement here
    }

}