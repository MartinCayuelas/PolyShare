package ui.topic.addTopic;

import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

import application.classesApp.SchoolClass;
import application.classesApp.Skill;
import application.classesApp.Subject;
import application.classesApp.Topic;
import facades.LoginFacade;
import facades.SchoolClassFacade;
import facades.exceptions.DisconnectedStudentException;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
    
    public void addTopic() throws DisconnectedStudentException {
    	/////////////////////////////////////////////////////////////////////////////////////////////////////
    	//Récupérer l'ID du Subject courant grâce à la fonction getParams() de l'instance du router//
    	/////////////////////////////////////////////////////////////////////////////////////////////////////
    	//Pour l'instant, test avec le Subject 2 (AnaFi)
		Topic newTopic = new Topic(0, nameTopic.getText(), 2);
		schoolClassFacade.addTopic(newTopic);
		
		//Quand on appuie sur Add ça doit renvoyer vers la page SchoolClass.fxml (avec la liste des subjects et topics)

	}

}