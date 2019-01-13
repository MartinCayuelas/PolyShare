package ui.topic;

import java.io.IOException;
import java.net.URL;
import java.util.*;

import javafx.application.Application;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import ui.classes.SchoolClassController;

/**
 * 
 */
public class TopicController extends Application implements Initializable {
	
	//Partie du lancement de la fenêtre
	private Stage primaryStage;
    private AnchorPane topicLayout;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
        this.primaryStage.setTitle("TopicApp");

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

	@FXML
	private ListView questions;

	protected List<String> listQuestions = new ArrayList<>();

	protected ListProperty<String> listProperty = new SimpleListProperty<>();

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		listQuestions.add("What should I use to implements an Observable ?");
		listQuestions.add("What is Facade pattern ?");
		listQuestions.add("How to reduce coupling ?");

		questions.itemsProperty().bind(listProperty);

		// This does not work, you can not directly add to a ListProperty
		// listProperty.addAll( asianCurrencyList );
		listProperty.set(FXCollections.observableArrayList(listQuestions));
	}

}