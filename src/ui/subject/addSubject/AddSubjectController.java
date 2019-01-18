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
    	//Récupérer l'ID de la SchoolClass courante grâce à la fonction getParams() de l'instance du router//
    	/////////////////////////////////////////////////////////////////////////////////////////////////////
    	//Pour l'instant, test avec la SchoolClass 2 (IG4)
		Subject newSubject = new Subject(0, nameSubject.getText(), 2);
		schoolClassFacade.addSubject(newSubject);
		
		//Quand on appuie sur Add ça doit renvoyer vers la page SchoolClass.fxml (avec la liste des subject et topics)
		
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
    
    
    /**
     * params need a SchoolClass to show his subjects
     */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		/*Object[] params = Router.getInstance().getParams();
    	
    	if (params[0] instanceof SchoolClass) {
    		SchoolClass selectSchoolClass = (SchoolClass)params[0];
    		
    		//TODO afficher la liste des subjects de la class
    		this.nameSubject.setText(selectSchoolClass.getNameSchoolClass());
    	}
    	else {
    		//TODO do a custom message error
    		System.out.println("PASSER UN SUBJECT SVP");
    	}*/
	}

}