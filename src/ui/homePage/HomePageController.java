package ui.homePage;

import java.util.List;

import application.classesApp.SchoolClass;
import facades.SchoolClassFacade;
import facades.exceptions.DisconnectedStudentException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import ui.Router;

/**
 * 
 */
public class HomePageController {
	
	@FXML private ListView<SchoolClass> myClassesLV;
	@FXML private TextField inputClassName;
	@FXML private ListView<SchoolClass> classSearchedList;
	

    /**
     * Default constructor
     */
    public HomePageController() {
    }

    @FXML 
    public void goProfil() {
    	Router.getInstance().activate("Profil");
    }
    
    @FXML 
    public void goAppointement() {
    	Router.getInstance().activate("Appointement");
    }
    
    @FXML 
    public void goClass() {
    	Router.getInstance().activate("Class");
    }
    
    @FXML 
    public void exit() {
    	Router.getInstance().activate("Exit");
    }
    
    @FXML 
    public void goSubject() {
    	SchoolClass selected = this.myClassesLV.getSelectionModel().getSelectedItem();
    	
    	if (selected != null) {
    		System.out.println(selected.getNameSchoolClass());
    		SchoolClass[] params  = {selected};
        	Router.getInstance().activate("Subject", params);
    	}
    	
    }
    
    @FXML 
    public void goSubjectSearched() {
    	SchoolClass selected = this.classSearchedList.getSelectionModel().getSelectedItem();
    	
    	if (selected != null) {
    		System.out.println(selected.getNameSchoolClass());
    		SchoolClass[] params  = {selected};
        	Router.getInstance().activate("Subject", params); 
    	}
    	
    }
    
    @FXML
    public void initialize() throws DisconnectedStudentException {
    	// get Class and fill ClassView
    	SchoolClassFacade scFac = new SchoolClassFacade();
    	
    	List<SchoolClass> scList = scFac.getAllSchoolClassConnectedStudent();
    	
    	ObservableList<SchoolClass> schoolClassObservableList = FXCollections.observableArrayList();
    	schoolClassObservableList.addAll(scList);
    	
    	this.myClassesLV.setItems(schoolClassObservableList);
    	this.myClassesLV.setCellFactory(studentListView -> new SchoolClassListViewCell());
    	
    }
    /**
     * Show in a listView all matched classes with a name in argument of a input text
     */
    @FXML
    public void searchClass() {
    	String schoolSearchedName = this.inputClassName.getText();
    	this.inputClassName.setText("");
    	
    	SchoolClassFacade scFac = new SchoolClassFacade();
    	List<SchoolClass> scList = scFac.findMatchedSchoolClass(schoolSearchedName);
    	ObservableList<SchoolClass> schoolClassObservableList = FXCollections.observableArrayList();
    	schoolClassObservableList.addAll(scList);
    	
    	this.classSearchedList.setItems(schoolClassObservableList);
    	this.classSearchedList.setCellFactory(studentListView -> new SchoolClassListViewCell());
    	
    }

}