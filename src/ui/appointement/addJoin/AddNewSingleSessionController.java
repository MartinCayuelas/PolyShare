package ui.appointement.addJoin;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import application.classesApp.MyDate;
import application.classesApp.SchoolClass;
import application.classesApp.SingleSession;
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
import javafx.fxml.Initializable;
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

public class AddNewSingleSessionController implements Initializable {
	
	private AppointmentsFacade appointmentsFacade = new AppointmentsFacade();
	
	private SchoolClassFacade schoolClassFacade = new SchoolClassFacade();
	
	ObservableList<String> SubjectObservableList;
	
	ObservableList<String> TopicObservableList;
	
	//Help Proposal
	@FXML
	private Button validateNewHelpProposal;
	
	@FXML
	private Button goBack;
		
	@FXML
	private ChoiceBox<String> choiceBoxSubject;
		
	@FXML
	private ChoiceBox<String> choiceBoxTopic;
		
	@FXML
	private TextArea messageHelpProposal;
		
	@FXML
	private TextField placeHelpProposal;
		
	@FXML
	private Spinner<Integer> timeSingleSessionHour;
	
	@FXML
	private Spinner<Integer> timeSingleSessionMin;
		
	@FXML
	private DatePicker dateHelpProposal;
		
	@FXML
	private Label errorTextHelpProposal;
		
		
	
	/**
     * @return
	 * @throws IOException 
     */
    @FXML
    private void addHelpProposal(ActionEvent event) throws IOException {
    	if(!choiceBoxSubject.getValue().toString().isEmpty() && !choiceBoxTopic.getValue().toString().isEmpty() && !messageHelpProposal.getText().isEmpty() && !placeHelpProposal.getText().isEmpty() && !timeSingleSessionHour.getValue().toString().isEmpty() && !dateHelpProposal.getValue().toString().isEmpty() && !timeSingleSessionMin.getValue().toString().isEmpty()){
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
    		String dateString = dateHelpProposal.getValue().toString();
    		MyDate date = new MyDate(dateString);
    		Student teacher = new Student(1, "Ponthieu");
    		//Student teacher = LoginFacade.getInstance().getConnectedStudent();
    		String timeHelpRequest = timeSingleSessionHour.getValue().toString() + ":" + timeSingleSessionMin.getValue().toString() + ":00";
    		SingleSession helpProposal = new SingleSession(0, 1, teacher, null, subject, listTopic, date, messageHelpProposal.getText(), timeHelpRequest, placeHelpProposal.getText());
    		appointmentsFacade.addSingleSession(helpProposal);
		} else {
			errorTextHelpProposal.setText("Erreur : tous les champs ne sont pas remplis !");
		}
    	
    	Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.close();

		Stage nextStage = new Stage();
		nextStage.setTitle("Add Help Proposal");
		Pane myPane = null;
		myPane = FXMLLoader.load(getClass().getResource("/ui/appointement/Appointement.fxml"));

		Scene scene = new Scene(myPane);
		nextStage.setScene(scene);
		nextStage.show();
		
	}
    
    @FXML
    private void addHelpRequest(ActionEvent event) throws IOException {
    	if(!choiceBoxSubject.getValue().toString().isEmpty() && !choiceBoxTopic.getValue().toString().isEmpty() && !messageHelpProposal.getText().isEmpty() && !placeHelpProposal.getText().isEmpty() && !timeSingleSessionHour.getValue().toString().isEmpty() && !dateHelpProposal.getValue().toString().isEmpty() && !timeSingleSessionMin.getValue().toString().isEmpty()){
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
    		String dateString = dateHelpProposal.getValue().toString();
    		MyDate date = new MyDate(dateString);
    		Student student = new Student(1, "Ponthieu");
    		//Student student = LoginFacade.getInstance().getConnectedStudent();
    		String timeHelpRequest = timeSingleSessionHour.getValue().toString() + ":" + timeSingleSessionMin.getValue().toString() + ":00";
    		SingleSession helpRequest = new SingleSession(0, 1, null, student, subject, listTopic, date, messageHelpProposal.getText(), timeHelpRequest, placeHelpProposal.getText());
    		appointmentsFacade.addHelpRequest(helpRequest);
		} else {
			errorTextHelpProposal.setText("Erreur : tous les champs ne sont pas remplis !");
		}
    	
    	Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.close();

		Stage nextStage = new Stage();
		nextStage.setTitle("Add Help Proposal");
		Pane myPane = null;
		myPane = FXMLLoader.load(getClass().getResource("/ui/appointement/Appointement.fxml"));

		Scene scene = new Scene(myPane);
		nextStage.setScene(scene);
		nextStage.show();
		
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
    	timeSingleSessionHour.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(00, 24));
    	timeSingleSessionMin.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(00, 60));
	}
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
    	
    	initSpinner();
    	
    	ArrayList<Subject> subjects = new ArrayList<>();
    	//SchoolClass sc = (SchoolClass)Router.getInstance().getParams()[0];
    	SchoolClass sc = new SchoolClass(1, "IG3");
    	
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
