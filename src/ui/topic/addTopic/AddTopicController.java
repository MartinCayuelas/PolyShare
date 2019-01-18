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
	
	private int idSubject;
	
	private SchoolClassFacade schoolClassFacade = new SchoolClassFacade();
	
	@FXML private TextField nameTopic;

    /**
     * Default constructor
     */
    public AddTopicController() {
    }
    
    public void addTopic(ActionEvent event) throws DisconnectedStudentException, IOException {
    	/////////////////////////////////////////////////////////////////////////////////////////////////////
    	//R�cup�rer l'ID du Subject courant gr�ce � la fonction getParams() de l'instance du router//
    	/////////////////////////////////////////////////////////////////////////////////////////////////////
    	//Pour l'instant, test avec le Subject 2 (AnaFi)
    	//int idS = (Subject)Router.getInstance().getParams()[0];
		Topic newTopic = new Topic(0, nameTopic.getText(), this.idSubject);
		schoolClassFacade.addTopic(newTopic);
		
		//Quand on appuie sur Add �a doit renvoyer vers la page SchoolClass.fxml (avec la liste des subjects et topics)
		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.close();

		Router.getInstance().activate("SchoolClass", Router.getInstance().getParams());

	}
    
    public void init(int idS) {
    	this.idSubject = idS;
    }

}