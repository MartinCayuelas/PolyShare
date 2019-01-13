package ui.homePage;

import java.util.List;

import application.classesApp.SchoolClass;
import facades.SchoolClassFacade;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.util.Callback;
import ui.Router;

/**
 * 
 */
public class HomePageController {
	
	@FXML ListView<SchoolClass> myClassesLV;
	

    /**
     * Default constructor
     */
    public HomePageController() {
    }

    @FXML 
    public void goProfil() {
    	Router.getInstance().activate("profil");
    }
    
    @FXML 
    public void goAppointement() {
    	Router.getInstance().activate("appointement");
    }
    
    @FXML 
    public void goClass() {
    	Router.getInstance().activate("class");
    }
    
    @FXML 
    public void exit() {
    	Router.getInstance().activate("exit");
    }
    
    /**
     * Get all classes and display it in the listView 
     */
    @FXML 
    public void searchClass() {
    	
    }
    
    @FXML 
    public void goSubject() {
    	System.out.println(this.myClassesLV.getSelectionModel().getSelectedItem().getNameSchoolClass());
    	//Router.getInstance().activate("subject", new String[0]);
    }
    
    @FXML
    public void initialize() {
    	// get Class and fill ClassView
    	SchoolClassFacade scFac = new SchoolClassFacade();
    	
    	List<SchoolClass> scList = scFac.getAllSchoolClassConnectedStudent();
    	
    	ObservableList<SchoolClass> schoolClassObservableList = FXCollections.observableArrayList();
    	schoolClassObservableList.addAll(scList);
    	
    	this.myClassesLV.setItems(schoolClassObservableList);
    	this.myClassesLV.setCellFactory(studentListView -> new SchoolClassListViewCell());
        
    	
    }

}