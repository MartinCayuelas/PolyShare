package ui.appointement;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import application.classesApp.MyDate;
import application.classesApp.RevisionSession;
import application.classesApp.SchoolClass;
import application.classesApp.SingleSession;
import application.classesApp.Subject;
import facades.AppointmentsFacade;
import facades.exceptions.DisconnectedStudentException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import ui.Router;

/**
 * 
 */
public class AppointmentController {
	
	ObservableList<SingleSessionCell> singleSessionObservableList;
	
	ObservableList<RevisionSessionCell> revisionSessionObservableList;
	
	List<SingleSessionCell> listSingleSession;
	
	List<RevisionSessionCell> listRevisionSession;
	
	
	private AppointmentsFacade appointmentsFacade = new AppointmentsFacade();
	
	@FXML 
	private ListView<SingleSessionCell> singleSessionLView;
	
	@FXML
	private ListView<RevisionSessionCell> revisionSessionLView;
	
	@FXML
	private Button helpRequest;
	
	@FXML
	private Button helProposal;
	
	@FXML
	private Button addRevisionSession;
	
	//Help Proposal
	@FXML
	private Button validateNewHelpProposal;
	
	@FXML
	private ComboBox subjectsHelpProposal;
	
	@FXML
	private ComboBox topicsHelpProposal;
	
	@FXML
	private TextArea messageHelpProposal;
	
	@FXML
	private TextField placeHelpProposal;
	
	@FXML
	private TextField timeHelpProposal;
	
	@FXML
	private DatePicker dateHelpProposal;
	
	@FXML
	private Label errorText;

    /**
     * Default constructor
     */
    public AppointmentController() {
    }


    /**
     * @return
     * @throws IOException 
     */
    public void addSingleSession(ActionEvent e) throws IOException {
        // TODO implement here
    	Node  source = (Node)  e.getSource(); 
	    Stage stage  = (Stage) source.getScene().getWindow();
	    stage.close();
	                          
	    Stage nextStage = new Stage();
	    nextStage.setTitle("Add Help Proposal");
	    Pane myPane = null;
	    myPane = FXMLLoader.load(getClass().getResource("/ui/appointement/HelpProposal.fxml"));
	
	    Scene scene = new Scene(myPane);
	    nextStage.setScene(scene);
	    nextStage.show(); 
    }
    
    /**
     * @return
     */
    @FXML
    private void addHelpProposal() {
    	validateNewHelpProposal.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if(!subjectsHelpProposal.getValue().toString().isEmpty() && !topicsHelpProposal.getValue().toString().isEmpty() && !messageHelpProposal.getText().isEmpty() && !placeHelpProposal.getText().isEmpty() && !timeHelpProposal.getText().isEmpty() && !dateHelpProposal.getValue().toString().isEmpty()){
					Subject subject = new Subject(0, subjectsHelpProposal.getValue().toString());
					try {
						MyDate date = new MyDate("dateHelpProposal.getValue().getDayOfMonth()", "dateHelpProposal.getValue().getMonthValue()", "dateHelpProposal.getValue().getYear()");
						appointmentsFacade.addSingleSession(date,subject,null);
					} catch (DisconnectedStudentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			    } else {
			    	errorText.setText("Erreur : tous les champs ne sont pas remplis !");
			    }
			}
    	});
    }

    /**
     * @return
     */
    public void updateSingleSession() {
        // TODO implement here
    }

    /**
     * @return
     */
    public void deleteSingleSession() {
        // TODO implement here
    }

    /**
     * @param subject 
     * @return
     */
    public void searchSingleSession(String subject) {
        // TODO implement here
    }

    /**
     * @return
     */
    public void addRevisionSession() {
        // TODO implement here
    }

    /**
     * @return
     */
    public void updateRevisionSession() {
        // TODO implement here
    }

    /**
     * @return
     */
    public void deleteRevisionSession() {
        // TODO implement here
    }
    
    /**
     * @param to initialize this ui, Router.getInstance() i should have : 
     * case 0 : SchoolClass-appointments of this class will be display
     */
    @FXML
    public void initialize() {
    	//ArrayList<Skill> request = new ArrayList<>();
    	ArrayList<SingleSession> proposal = new ArrayList<>();
    	ArrayList<RevisionSession> revisionSession = new ArrayList<>();
    	    	
    	//SchoolClass sc = (SchoolClass)Router.getInstance().getParams()[0];
    	
    	SchoolClass sc = new SchoolClass(1, "IG3");
    	
    	proposal = appointmentsFacade.getSingleSessionByClass(sc.getIdSchoolClass());
    	revisionSession = appointmentsFacade.getAppointmentByClass(sc.getIdSchoolClass());
    	listSingleSession = new ArrayList<>();
    	listRevisionSession = new ArrayList<>();
    	
    	for (SingleSession ss : proposal) {
    		SingleSessionCell singleSessionCell = new SingleSessionCell(ss.getIdAppointment(), ss.getTeacher(), ss.getSubject(), ss.getDateAppointment());
    		listSingleSession.add(singleSessionCell);
    	}
    	
    	for (RevisionSession rs : revisionSession) {
    		RevisionSessionCell revisionSessionCell = new RevisionSessionCell(rs.getIdAppointment(), rs.getTeacher(), rs.getStudent(), rs.getSubject(), rs.getDateAppointment());
    		listRevisionSession.add(revisionSessionCell);
    	}
    	
    	singleSessionObservableList = FXCollections.observableArrayList();
    	singleSessionObservableList.addAll(listSingleSession);
    	
    	this.singleSessionLView.setItems(singleSessionObservableList);
    	this.singleSessionLView.setCellFactory(studentListView -> new SingleSessionListViewCell(this));
    	
    	revisionSessionObservableList = FXCollections.observableArrayList();
    	revisionSessionObservableList.addAll(listRevisionSession);
    	
    	this.revisionSessionLView.setItems(revisionSessionObservableList);
    	this.revisionSessionLView.setCellFactory(studentListView -> new RevisionSessionListViewCell(this));
    	
    }

}