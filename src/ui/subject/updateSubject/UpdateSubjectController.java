package ui.subject.updateSubject;

import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import ui.Router;

/**
 * @author guillaud
 */
public class UpdateSubjectController implements Initializable {
	
	private int idSubject;
	
	private SchoolClassFacade schoolClassFacade = new SchoolClassFacade();
	
	@FXML private TextField nameSubject;

    /**
     * Default constructor
     */
    public UpdateSubjectController() {
    }
    
    public void updateSubject(ActionEvent event) throws DisconnectedStudentException {
    	/////////////////////////////////////////////////////////////////////////////////////////
    	//R�cup�rer le Subject courant gr�ce � la fonction getParams() de l'instance du router//
    	////////////////////////////////////////////////////////////////////////////////////////
    	//Pour l'instant, test avec le subject 5 (Panorama)
    	
		Subject currentSubject = schoolClassFacade.findSubjectById(this.idSubject);
		schoolClassFacade.updateSubject(this.idSubject, nameSubject.getText());
		
		//Quand on appuie sur Save �a doit renvoyer vers la page SchoolClass.fxml (avec la liste des subject et topics)
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
		
		//Remplissage du TextField avec le nom du subject � modifier
		nameSubject.setText(schoolClassFacade.findSubjectById(this.idSubject).getNameSubject());
	}
	
	public void init(int idS) {
		this.idSubject = idS;
	}
	
}