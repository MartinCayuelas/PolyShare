package ui.subject.updateSubject;

import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

import application.classesApp.SchoolClass;
import application.classesApp.Skill;
import application.classesApp.Subject;
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
public class UpdateSubjectController implements Initializable {
	
	private SchoolClassFacade schoolClassFacade = new SchoolClassFacade();
	
	@FXML private TextField nameSubject;

    /**
     * Default constructor
     */
    public UpdateSubjectController() {
    }
    
    public void updateSubject() throws DisconnectedStudentException {
    	/////////////////////////////////////////////////////////////////////////////////////////
    	//Récupérer le Subject courant grâce à la fonction getParams() de l'instance du router//
    	////////////////////////////////////////////////////////////////////////////////////////
    	//Pour l'instant, test avec le subject 5 (Panorama)
    	
		Subject currentSubject = schoolClassFacade.findSubjectById(5);
		schoolClassFacade.updateSubject(5, nameSubject.getText());
		
		//Quand on appuie sur Save ça doit renvoyer vers la page SchoolClass.fxml (avec la liste des subject et topics)

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
		
		//Remplissage du TextField avec le nom du subject à modifier
		nameSubject.setText(schoolClassFacade.findSubjectById(5).getNameSubject());
	}

}