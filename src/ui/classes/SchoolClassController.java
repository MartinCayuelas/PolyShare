package ui.classes;

import java.awt.event.ActionEvent;
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
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import ui.Router;

/**
 * @author guillaud
 */
public class SchoolClassController implements Initializable {
	
	protected List<String> listSubjects = new ArrayList<>();
	protected List<Integer> listSubjectsId = new ArrayList<>();
	protected List<String> listTopics = new ArrayList<>();

	protected ListProperty<String> listPropertySubjects = new SimpleListProperty<>();
	protected ListProperty<String> listPropertyTopics = new SimpleListProperty<>();
	
	private LoginFacade loginFacade = new LoginFacade();
	private SchoolClassFacade schoolClassFacade = new SchoolClassFacade();
	private Router r = Router.getInstance();

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
		 
		
		 
		 
		 
		 ChangeListener listener = new ChangeListener() {  
					

				@Override
				public void changed(ObservableValue arg0, Object arg1, Object arg2) {
					// TODO Auto-generated method stub
					//Clear the Topics ListView
					topicsListView.getItems().clear();
					
					//Get the ID of the selected Subject in the ListView
					int subjectSelectedId = listSubjectsId.get(subjectsListView.getSelectionModel().getSelectedIndex());
					
					//Get the topics of the selected Subject in the ListView
					for(Topic t : schoolClassFacade.getTopics(subjectSelectedId)) {
						 listTopics.add(t.getNameTopic());
					 }
					
					//Add topics to the Topics ListView
					 topicsListView.itemsProperty().bind(listPropertyTopics);
					 listPropertyTopics.set(FXCollections.observableArrayList(listTopics));
				}  
			}; 
			
			//Listener for selecting a Subject in the ListView
			subjectsListView.getSelectionModel().selectedIndexProperty().addListener(
					 listener
					 );
	}
}