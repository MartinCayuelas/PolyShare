package ui.subject.addSubject;

import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.classesApp.SchoolClass;
import application.classesApp.Skill;
import application.classesApp.Subject;
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
public class AddSubjectController implements Initializable {
	
	private SchoolClassFacade schoolClassFacade = new SchoolClassFacade();
	
	@FXML private TextField nameSubject;

    /**
     * Default constructor
     */
    public AddSubjectController() {
    }
    
    public void addSubject(ActionEvent event) throws DisconnectedStudentException, IOException {
    	/////////////////////////////////////////////////////////////////////////////////////////////////////
    	//R�cup�rer l'ID de la SchoolClass courante gr�ce � la fonction getParams() de l'instance du router//
    	/////////////////////////////////////////////////////////////////////////////////////////////////////
    	//Pour l'instant, test avec la SchoolClass 2 (IG4)
    	SchoolClass sc = (SchoolClass)Router.getInstance().getParams()[0];
		Subject newSubject = new Subject(0, nameSubject.getText(), sc.getIdSchoolClass());
		schoolClassFacade.addSubject(newSubject);
		
		//Quand on appuie sur Add �a doit renvoyer vers la page SchoolClass.fxml (avec la liste des subject et topics)
		
		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.close();

		Router.getInstance().activate("SchoolClass", Router.getInstance().getParams());
	}
    
    
    /**
     * params need a SchoolClass to show his subjects
     */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	}

}