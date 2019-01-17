package ui.topic.updateTopic;

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
public class UpdateTopicController implements Initializable {
	
	private SchoolClassFacade schoolClassFacade = new SchoolClassFacade();
	
	@FXML private TextField nameTopic;

    /**
     * Default constructor
     */
    public UpdateTopicController() {
    }
    
    public void updateTopic() throws DisconnectedStudentException {
    	/////////////////////////////////////////////////////////////////////////////////////////
    	//R�cup�rer le Topic courant gr�ce � la fonction getParams() de l'instance du router//
    	////////////////////////////////////////////////////////////////////////////////////////
    	//Pour l'instant, test avec le topic 1 (Math�matiques financi�res)
    	
		Topic currentTopic = schoolClassFacade.findTopicById(1);
		schoolClassFacade.updateTopic(1, nameTopic.getText());
		
		//Quand on appuie sur Save �a doit renvoyer vers la page SchoolClass.fxml (avec la liste des subjects et topics)

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		//Remplissage du TextField avec le nom du topic � modifier
		nameTopic.setText(schoolClassFacade.findTopicById(1).getNameTopic());
	}

}