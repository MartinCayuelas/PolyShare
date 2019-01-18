package ui.appointement.addJoin;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import application.classesApp.MyDate;
import application.classesApp.RevisionSession;
import application.classesApp.SchoolClass;
import application.classesApp.Subject;
import application.classesApp.Topic;
import facades.AppointmentsFacade;
import facades.SchoolClassFacade;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class AddNewRevisionSessionController implements Initializable {
	
	private AppointmentsFacade appointmentsFacade = new AppointmentsFacade();
	
	private SchoolClassFacade schoolClassFacade = new SchoolClassFacade();
	
	ObservableList<String> SubjectObservableList;
	
	ObservableList<String> TopicObservableList;
	
	//Revision Session
	@FXML
	private Button validateNewRevisionSession;
	
	@FXML
	private Button goBack;
			
	@FXML
	private ChoiceBox<String> choiceBoxSubject;
			
	@FXML
	private ChoiceBox<String> choiceBoxTopic;
			
	@FXML
	private TextArea messageRevisionSession;
			
	@FXML
	private TextField placeRevisionSession;
			
	@FXML
	private TextField timeRevisionSession;
			
	@FXML
	private DatePicker dateRevisionSession;
			
	@FXML
	private Label errorTextRevisionSession;
	
	
	/**
     * @return
     */
    @FXML
    private void addRevisionSession(ActionEvent event) {
    	if(!choiceBoxSubject.getValue().toString().isEmpty() && !choiceBoxTopic.getValue().toString().isEmpty() && !messageRevisionSession.getText().isEmpty() && !placeRevisionSession.getText().isEmpty() && !timeRevisionSession.getText().isEmpty() && !dateRevisionSession.getValue().toString().isEmpty()){
    		Subject subject = new Subject(0, choiceBoxSubject.getValue().toString());
    		Topic topic = new Topic(0, choiceBoxTopic.getValue().toString(), subject.getId());
    		ArrayList<Topic> listTopic = new ArrayList<>();
    		listTopic.add(topic);
			MyDate date = new MyDate("dateRevisionSession.getValue().getDayOfMonth()", "dateRevisionSession.getValue().getMonthValue()", "dateRevisionSession.getValue().getYear()");
			RevisionSession revisionSession = new RevisionSession(0, 0, null, null, subject, listTopic, date, messageRevisionSession.getText(), null, placeRevisionSession.getText()); 
			appointmentsFacade.addRevisionSession(revisionSession);
		} else {
			errorTextRevisionSession.setText("Erreur : tous les champs ne sont pas remplis !");
		}
	}
    
    @FXML
    private void goBack(ActionEvent e) throws IOException {
    	Node source = (Node) e.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.close();

		Stage nextStage = new Stage();
		nextStage.setTitle("Appointments");
		Pane myPane = null;
		myPane = FXMLLoader.load(getClass().getResource("/ui/appointement/Appointement.fxml"));

		Scene scene = new Scene(myPane);
		nextStage.setScene(scene);
		nextStage.show();
    }
    
    @FXML
    private void chooseTopic(ActionEvent e) throws IOException {
    	String nameSubject = this.choiceBoxSubject.getValue();
    	Subject subject = schoolClassFacade.findSubjectByName(nameSubject);
    	ArrayList<Topic> topics = schoolClassFacade.getTopics(subject.getId());
    	TopicObservableList = FXCollections.observableArrayList();
    	for (Topic t : topics) {
    		TopicObservableList.add(t.getNameTopic());
		}
		this.choiceBoxTopic.setItems(TopicObservableList);
    }
    
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
    	ArrayList<Subject> subjects = new ArrayList<>();
    	//SchoolClass sc = (SchoolClass)Router.getInstance().getParams()[0];
    	SchoolClass sc = new SchoolClass(1, "IG3");
    	
    	subjects = schoolClassFacade.getSubjects(sc.getIdSchoolClass());
    	
    	SubjectObservableList = FXCollections.observableArrayList();
		for (Subject s : subjects) {
			SubjectObservableList.add(s.getNameSubject());
			this.choiceBoxSubject.setValue(s.getNameSubject());
		}
		this.choiceBoxSubject.setItems(SubjectObservableList);
	
	}
    

}
