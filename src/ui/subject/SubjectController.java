package ui.subject;

import application.classesApp.SchoolClass;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import ui.Router;

/**
 * 
 */
public class SubjectController {
	
	@FXML private Label subjectName;

    /**
     * Default constructor
     */
    public SubjectController() {
    }
    
    
    /**
     * params need a SchoolClass to show his subjects
     */
    @FXML
    public void initialize() {
    	Object[] params = Router.getInstance().getParams();
    	
    	if (params[0] instanceof SchoolClass) {
    		SchoolClass selectSchoolClass = (SchoolClass)params[0];
    		
    		//TODO afficher la liste des subjects de la class
    		this.subjectName.setText(selectSchoolClass.getNameSchoolClass());
    	}
    	else {
    		//TODO do a custom message error
    		System.out.println("PASSER UN SUBJECT SVP");
    	}
    }
    

   

}