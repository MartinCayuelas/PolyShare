package ui.appointement.addJoin;

import java.io.IOException;
import java.util.ArrayList;

import application.classesApp.MyDate;
import application.classesApp.RevisionSession;
import application.classesApp.SchoolClass;
import application.classesApp.Student;
import application.classesApp.Subject;
import application.classesApp.Topic;
import facades.AppointmentsFacade;
import facades.LoginFacade;
import facades.SchoolClassFacade;
import facades.exceptions.DisconnectedStudentException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import ui.Router;

public class AddNewRevisionSessionController {
	
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
	private Spinner<Integer> timeRevisionSessionHour;
	
	@FXML
	private Spinner<Integer> timeRevisionSessionMin;
			
	@FXML
	private DatePicker dateRevisionSession;
			
	@FXML
	private Label errorTextRevisionSession;

	private Student sConnected;
	
	
	/**
     * @return
	 * @throws DisconnectedStudentException 
     */
    @FXML
    private void addRevisionSession(ActionEvent event) throws IOException, DisconnectedStudentException {
    	if(!choiceBoxSubject.getValue().toString().isEmpty() && !choiceBoxTopic.getValue().toString().isEmpty() && !messageRevisionSession.getText().isEmpty() && !placeRevisionSession.getText().isEmpty() && !dateRevisionSession.getValue().toString().isEmpty() && !timeRevisionSessionHour.getValue().toString().isEmpty() && !timeRevisionSessionMin.getValue().toString().isEmpty()){
    		Subject subject = schoolClassFacade.findSubjectByName(choiceBoxSubject.getValue().toString());
    		ArrayList<Topic> listTopic = schoolClassFacade.getTopics(subject.getId());
    		Topic topic = null;
    		for(Topic t : listTopic) {
    			if (t.getNameTopic().equals(choiceBoxTopic.getValue().toString())) {
    				topic = t;
    			}
    		}
    		ArrayList<Topic> listTopic2 = new ArrayList<>();
    		listTopic2.add(topic);
    		String dateString = dateRevisionSession.getValue().toString();
    		MyDate date = new MyDate(dateString);
    		String timeRevisionSession = timeRevisionSessionHour.getValue().toString() + ":" + timeRevisionSessionMin.getValue().toString() + ":00";
			//Student teacher = new Student(1, "Ponthieu");
    		Student teacher = LoginFacade.getInstance().getConnectedStudent();
    		SchoolClass sc = (SchoolClass)Router.getInstance().getParams()[0];
			RevisionSession revisionSession = new RevisionSession(0, sc.getIdSchoolClass(), teacher, null, subject, listTopic2, date, messageRevisionSession.getText(), timeRevisionSession, placeRevisionSession.getText()); 
			appointmentsFacade.addRevisionSession(revisionSession);

		} else {
			errorTextRevisionSession.setText("Erreur : tous les champs ne sont pas remplis !");
		}
    	
    	SchoolClass sc = (SchoolClass)Router.getInstance().getParams()[0];
    	SchoolClass[] params  = {sc};
    	Router.getInstance().activate("Appointements", params);
	}
    
    @FXML
    private void goBack() {
    	SchoolClass sc = (SchoolClass)Router.getInstance().getParams()[0];
    	SchoolClass[] params  = {sc};
    	Router.getInstance().activate("Appointements", params);
    }
    
    @FXML
    private void chooseTopic() {
    	String nameSubject = this.choiceBoxSubject.getValue();
    	Subject subject = schoolClassFacade.findSubjectByName(nameSubject);
    	ArrayList<Topic> topics = schoolClassFacade.getTopics(subject.getId());
    	TopicObservableList = FXCollections.observableArrayList();
    	for (Topic t : topics) {
    		TopicObservableList.add(t.getNameTopic());
		}
		this.choiceBoxTopic.setItems(TopicObservableList);
    }
    
    private void initSpinner() {
    	timeRevisionSessionHour.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(00, 24));
    	timeRevisionSessionMin.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(00, 60));
	}
    
    
    @FXML
    public void initialize() {
		// TODO Auto-generated method stub
    	
    	try {
			this.sConnected = LoginFacade.getInstance().getConnectedStudent();
		} catch (DisconnectedStudentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	
    	initSpinner();
    	
    	ArrayList<Subject> subjects = new ArrayList<>();
    	SchoolClass sc = (SchoolClass)Router.getInstance().getParams()[0];
    	//SchoolClass sc = new SchoolClass(1, "IG3");
    	
    	subjects = schoolClassFacade.getSubjects(sc.getIdSchoolClass());
    	
    	SubjectObservableList = FXCollections.observableArrayList();
		for (Subject s : subjects) {
			SubjectObservableList.add(s.getNameSubject());
			this.choiceBoxSubject.setValue(s.getNameSubject());
			ArrayList<Topic> topics = schoolClassFacade.getTopics(s.getId());
	    	TopicObservableList = FXCollections.observableArrayList();
	    	for (Topic t : topics) {
	    		TopicObservableList.add(t.getNameTopic());
			}
			this.choiceBoxTopic.setItems(TopicObservableList);
		}
		this.choiceBoxSubject.setItems(SubjectObservableList);
	
	}
    

}
