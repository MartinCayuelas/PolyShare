package ui.topic.addTopic;

import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.classesApp.SchoolClass;
import application.classesApp.Skill;
import application.classesApp.Subject;
import application.classesApp.Topic;
import facades.LoginFacade;
import facades.SchoolClassFacade;
import facades.exceptions.DisconnectedStudentException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import ui.Router;

/**
 * @author guillaud
 */
public class AddTopicController {
	
	private SchoolClassFacade schoolClassFacade = new SchoolClassFacade();
	
	@FXML private TextField nameTopic;

    /**
     * Default constructor
     */
    public AddTopicController() {
    }
    
    public void addTopic(ActionEvent event) throws DisconnectedStudentException, IOException {
    	/////////////////////////////////////////////////////////////////////////////////////////////////////
    	//Récupérer l'ID du Subject courant grâce à la fonction getParams() de l'instance du router//
    	/////////////////////////////////////////////////////////////////////////////////////////////////////
    	//Pour l'instant, test avec le Subject 2 (AnaFi)
		Topic newTopic = new Topic(0, nameTopic.getText(), 2);
		schoolClassFacade.addTopic(newTopic);
		
		//Quand on appuie sur Add ça doit renvoyer vers la page SchoolClass.fxml (avec la liste des subjects et topics)
		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.close();

		Stage nextStage = new Stage();
		nextStage.setTitle("");
		Pane myPane = null;
		myPane = FXMLLoader.load(getClass().getResource("/ui/classes/SchoolClass.fxml"));

		Scene scene = new Scene(myPane);
		nextStage.setScene(scene);
		nextStage.show();

	}

}