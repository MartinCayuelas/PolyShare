package ui.classes;

import javafx.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.util.*;

import application.classesApp.SchoolClass;
import application.classesApp.Skill;
import application.classesApp.Student;
import application.classesApp.Subject;
import application.classesApp.Topic;
import facades.LoginFacade;
import facades.SchoolClassFacade;
import facades.SkillFacade;
import facades.exceptions.DisconnectedStudentException;
import javafx.application.Application;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import ui.Router;

/**
 * @author guillaud
 */
public class SchoolClassController implements Initializable {
	
	protected List<String> listSubjects = new ArrayList<>();
	protected List<Integer> listSubjectsId = new ArrayList<>();
	protected List<String> listTopics = new ArrayList<>();
	protected List<Integer> listTopicsId = new ArrayList<>();

	protected ListProperty<String> listPropertySubjects = new SimpleListProperty<>();
	protected ListProperty<String> listPropertyTopics = new SimpleListProperty<>();
	
	private LoginFacade loginFacade = new LoginFacade();
	private SchoolClassFacade schoolClassFacade = new SchoolClassFacade();
	private Router r = Router.getInstance();
	private int subjectSelectedId = -1;
	private int topicSelectedId = -1;

	//Partie du controller
    /**
     * Default constructor
     */
    public SchoolClassController() {
    }
    
    /**
     * Add a subject to the current SchoolClass
     * @param name Name of the new subject
     */
    public void addSubject(String name) {
    	schoolClassFacade.CreateSubject(name);
    }
    
    /**
     * Delete a subject to the current SchoolClass
     * @param name Name of the new subject
     */
    public void deleteSubject(int idSubject) {
    	schoolClassFacade.deleteSubject(idSubject);
    }
    
    /**
     * Delete a subject to the current SchoolClass
     * @param name Name of the new subject
     */
    public void updateSubject(int idSubject, String nameSubject) {
    	schoolClassFacade.updateSubject(idSubject, nameSubject);
    }


    /**
     * @return
     */
    public void Create() {
        // TODO implement here
    }

    /**
     * @param s 
     * @return
     */
    public void find(String s) {
        // TODO implement here
    }

    /**
     * @return
     */
    public void join() {
        // TODO implement here
    }
    
    @FXML
	private ListView subjectsListView;
    
    @FXML
    private ListView topicsListView;
    
    @FXML
    private Button updateSubjectButton;

    @FXML
    private Button deleteSubjectButton;
    
    @FXML
    private Button updateTopicButton;
    
    @FXML
    private Button deleteTopicButton;
    

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		ArrayList<Subject> subs = new ArrayList<>();
		//int idSchoolClass = ((SchoolClass)r.getParams()[0]).getIdSchoolClass();
		//Test avec la classe 2 (IG4), il faudra ensuite mettre idSchoolClass
		subs = schoolClassFacade.getSubjects(2);
		 for(Subject s : subs) {
			 SchoolClass clas = schoolClassFacade.findSchoolClassId(2);
			 listSubjects.add(s.getNameSubject());
			 listSubjectsId.add(s.getId());
			 
		    }

		 subjectsListView.itemsProperty().bind(listPropertySubjects);
		 listPropertySubjects.set(FXCollections.observableArrayList(listSubjects));
		 
		 //Disabled buttons delete and update
		 updateSubjectButton.setDisable(true);
		 deleteSubjectButton.setDisable(true);
		 updateTopicButton.setDisable(true);
		deleteTopicButton.setDisable(true);
		 
		 //To know the selected Subject
		 ChangeListener listenerSubject = new ChangeListener<Object>() {  
				@Override
				public void changed(ObservableValue arg0, Object arg1, Object arg2) {
					// TODO Auto-generated method stub
					//Clear the Topics List
					listTopics.clear();
					
					//Get the ID of the selected Subject in the ListView
					try {
						subjectSelectedId = listSubjectsId.get(subjectsListView.getSelectionModel().getSelectedIndex());
						//Get update and delete buttons visible
						 updateSubjectButton.setDisable(false);
						 deleteSubjectButton.setDisable(false);
					}catch (Exception e) {
						// TODO: handle exception
						//After a deletion
						updateSubjectButton.setDisable(true);
						deleteSubjectButton.setDisable(true);
					}
					
					//Get the topics of the selected Subject in the ListView
					for(Topic t : schoolClassFacade.getTopics(subjectSelectedId)) {
						 listTopics.add(t.getNameTopic());
						 listTopicsId.add(t.getId());
					 }
					
					//Add topics to the Topics ListView
					 topicsListView.itemsProperty().bind(listPropertyTopics);
					 listPropertyTopics.set(FXCollections.observableArrayList(listTopics));	
				}  
			}; 
			
			//Listener for selecting a Subject in the ListView
			subjectsListView.getSelectionModel().selectedIndexProperty().addListener(
					 listenerSubject
					 );
			
			//To know the selected Topic
			 ChangeListener listenerTopic = new ChangeListener() {  
					@Override
					public void changed(ObservableValue arg0, Object arg1, Object arg2) {
						// TODO Auto-generated method stub
						
						//Get the ID of the selected Topic in the ListView
						try {
							topicSelectedId = listTopicsId.get(topicsListView.getSelectionModel().getSelectedIndex());
							//Get update and delete buttons visible
							 updateTopicButton.setDisable(false);
							 deleteTopicButton.setDisable(false);
						}catch (Exception e) {
							// TODO: handle exception
							//After a deletion
							updateTopicButton.setDisable(true);
							deleteTopicButton.setDisable(true);
						}
					}  
				}; 
				
				//Listener for selecting a Subject in the ListView
				topicsListView.getSelectionModel().selectedIndexProperty().addListener(
						listenerTopic
						 );
			
	}
	
	///////////////////
	//Subject buttons//
	///////////////////
	@FXML
	public void addSubject(ActionEvent event) throws IOException, DisconnectedStudentException {
    	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	//Ajouter l'ID de la SchoolClass courante dans le router pour pouvoir la récupérer dans la nouvelle fenêtre pour ajouter un subject//
    	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.close();

		Stage nextStage = new Stage();
		nextStage.setTitle("");
		Pane myPane = null;
		myPane = FXMLLoader.load(getClass().getResource("/ui/subject/addSubject/AddSubject.fxml"));

		Scene scene = new Scene(myPane);
		nextStage.setScene(scene);
		nextStage.show();
		
		//Ouvrir la fenêtre "AddSubject.fxml"

	}
	
	public void updateSubject() throws DisconnectedStudentException {
    	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	//Ajouter le subject courant dans le router pour pouvoir la récupérer dans la nouvelle fenêtre pour modifier un subject//
    	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//Ouvrir la fenêtre "UpdateSubject.fxml"

	}
	
	public void deleteSubject() throws DisconnectedStudentException {
		//Get the name of the deleted Subject
    	String deletedSubjectName = schoolClassFacade.findSubjectById(subjectSelectedId).getNameSubject();
    	
    	//Get the index of the deleted Subject in lists
    	int index = listSubjects.indexOf(deletedSubjectName);
    	
    	//Remove the deleted Subject to lists
    	listSubjects.remove(deletedSubjectName);
    	listSubjectsId.remove(index);
    	
    	//Delete the Subject from the database
    	schoolClassFacade.deleteSubject(subjectSelectedId);
    	
    	//Update the Subjects ListView
    	subjectsListView.itemsProperty().bind(listPropertySubjects);
        listPropertySubjects.set(FXCollections.observableArrayList(listSubjects));
	}
	
	/////////////////
	//Topic buttons//
	/////////////////
	@FXML
	public void addTopic(ActionEvent event) throws DisconnectedStudentException, IOException {
    	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	//Ajouter l'ID du Subject courant dans le router pour pouvoir le récupérer dans la nouvelle fenêtre pour ajouter un topic//
    	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.close();

		Stage nextStage = new Stage();
		nextStage.setTitle("");
		Pane myPane = null;
		myPane = FXMLLoader.load(getClass().getResource("/ui/topic/addTopic/AddTopic.fxml"));

		Scene scene = new Scene(myPane);
		nextStage.setScene(scene);
		nextStage.show();
		//Ouvrir la fenêtre "AddTopic.fxml"

	}
	
	public void updateTopic() throws DisconnectedStudentException {
    	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	//Ajouter le topic courant dans le router pour pouvoir la récupérer dans la nouvelle fenêtre pour modifier un topic//
    	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//Ouvrir la fenêtre "UpdateTopic.fxml"

	}
	
	public void deleteTopic() throws DisconnectedStudentException {
		//Get the name of the deleted Subject
    	String deletedTopicName = schoolClassFacade.findTopicById(topicSelectedId).getNameTopic();
    	
    	//Get the index of the deleted Subject in lists
    	int index = listTopics.indexOf(deletedTopicName);
    	
    	//Remove the deleted Subject to lists
    	listTopics.remove(deletedTopicName);
    	listTopicsId.remove(index);
    	
    	//Delete the Topic from the database
    	schoolClassFacade.deleteTopic(topicSelectedId);
    	
    	//Update the Subjects ListView
    	topicsListView.itemsProperty().bind(listPropertyTopics);
    	listPropertyTopics.set(FXCollections.observableArrayList(listTopics));

	}
	
	@FXML
	private void backHome(ActionEvent event) throws IOException {
		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.close();

		Stage nextStage = new Stage();
		nextStage.setTitle("");
		Pane myPane = null;
		myPane = FXMLLoader.load(getClass().getResource("/ui/homePage/HomePage.fxml"));

		Scene scene = new Scene(myPane);
		nextStage.setScene(scene);
		nextStage.show();

	}
	
}