package ui.classes.addSchoolClass;

import facades.SchoolClassFacade;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import ui.Router;

/**
 * @author cayuelas
 */
public class AddSchoolClassController {
	private SchoolClassFacade schoolClassFacade = new SchoolClassFacade();	
	
	@FXML
	private TextField nameSchoolClass;
	
	//Partie du controller
    /**
     * Default constructor
     */
    public AddSchoolClassController() {
    }
    
    
    @FXML
    public void goBack() {
    	Router.getInstance().activate("HomePage");
    }

    
    @FXML
    public void createSchoolClass() {
    	
    	schoolClassFacade.addSchoolClass(this.nameSchoolClass.getText());
    	
    	Router.getInstance().activate("HomePage");
    }

}
