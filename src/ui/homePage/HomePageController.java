package ui.homePage;

import java.util.ArrayList;
import java.util.List;

import application.classesApp.SchoolClass;
import facades.SchoolClassFacade;
import facades.exceptions.DisconnectedStudentException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import ui.Router;

/**
 * 
 */
public class HomePageController {
	
	@FXML private ListView<SchoolClass> myClassesLV;
	@FXML private TextField inputClassName;
	@FXML private ListView<SchoolClass> classSearchedList;
	
	SchoolClassFacade scFac = null;
	
	List<SchoolClass> searchedClasses;
	List<SchoolClass> myClass;
	
	ObservableList<SchoolClass> myClassObservableList;
	ObservableList<SchoolClass> searchedClassObservableList;
	
	
	String searchedString;

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
    	Router.getInstance().activate("MyAppointements");
    }
    
    @FXML 
    public void goClass() {
    	Router.getInstance().activate("SchoolClass");
    }
    
    @FXML 
    public void goAddClass() {
    	Router.getInstance().activate("AddSchoolClass");
    }
    
    @FXML
    private Button exitButton;
    
    @FXML 
    public void exit() {
    	Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }
    
    @FXML 
    public void goSubject() {
    	SchoolClass selected = this.myClassesLV.getSelectionModel().getSelectedItem();
    	
    	if (selected != null) {
    		System.out.println(selected.getNameSchoolClass());
    		SchoolClass[] params  = {selected};
        	Router.getInstance().activate("SchoolClass", params);
    	}
    	
    }
    
    @FXML 
    public void goSubjectSearched() {
    	SchoolClass selected = this.classSearchedList.getSelectionModel().getSelectedItem();
    	
    	if (selected != null) {

    		SchoolClass[] params  = {selected};
        	Router.getInstance().activate("SchoolClass", params); 
    	}
    	
    }
    
    @FXML
    public void initialize() throws DisconnectedStudentException {
    	
    	// get Class and fill ClassView
    	scFac = new SchoolClassFacade();
    	
    	myClass = scFac.getAllSchoolClassConnectedStudent();
    	
    	myClassObservableList = FXCollections.observableArrayList();
    	myClassObservableList.addAll(myClass);
    	
    	this.myClassesLV.setItems(myClassObservableList);
    	this.myClassesLV.setCellFactory(studentListView -> new SchoolClassListViewCell(this, false));
    	this.searchedString = "";
    	
    	// init searchList
    	this.inputClassName.setText("");
    	searchedString = "";
    	
    	searchedClasses = new ArrayList<SchoolClass>();
    	
    	searchedClassObservableList = FXCollections.observableArrayList();
    	searchedClassObservableList.addAll(searchedClasses);
    	
    	this.classSearchedList.setItems(searchedClassObservableList);
    	this.classSearchedList.setCellFactory(studentListView -> new SchoolClassListViewCell(this, true));
    }
    
    @FXML
    private void searchClass() {
    	searchedString = this.inputClassName.getText();
    	this.inputClassName.setText("");
    	
    	searchedClasses = scFac.findUnlikedMatchedSchoolClass(searchedString);
    	searchedClassObservableList.clear();
		searchedClassObservableList.addAll(searchedClasses);
		this.classSearchedList.setItems(searchedClassObservableList);
    }
    
    
    public void fetchList() {
    	try {
    		searchedClasses = scFac.findUnlikedMatchedSchoolClass(searchedString);
			myClass = scFac.getAllSchoolClassConnectedStudent();
			
			
		} catch (DisconnectedStudentException e) {
			e.printStackTrace();
		}
	}
    
	public void updateListView () {
		searchedClassObservableList.clear();
		searchedClassObservableList.addAll(searchedClasses);
		this.classSearchedList.setItems(searchedClassObservableList);
		
		
		myClassObservableList.clear();
		myClassObservableList.addAll(myClass);
		this.myClassesLV.setItems(myClassObservableList);
//		System.out.println("My class : ");
//		System.out.println(myClass);
//		System.out.println("SearchedClasses : ");
//		System.out.println(searchedClasses);
//		System.out.println("end");
	}
    
    
	
	

}