package ui.appointement;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import application.classesApp.MyDate;
import application.classesApp.RevisionSession;
import application.classesApp.SchoolClass;
import application.classesApp.SingleSession;
import application.classesApp.Student;
import application.classesApp.Subject;
import facades.AppointmentsFacade;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * 
 */
public class AppointmentController implements Initializable {
	
	ObservableList<SingleSessionCell> singleSessionObservableList;
	
	ObservableList<RevisionSessionCell> revisionSessionObservableList;
	
	ObservableList<SingleSessionCell> helpRequestObservableList;
	
	List<SingleSessionCell> listSingleSession;
	
	List<RevisionSessionCell> listRevisionSession;
	
	List<SingleSessionCell> listHelpRequest;
	
	
	private AppointmentsFacade appointmentsFacade = new AppointmentsFacade();
	
	@FXML 
	private ListView<SingleSessionCell> singleSessionLView;
	
	@FXML
	private ListView<RevisionSessionCell> revisionSessionLView;
	
	@FXML
	private ListView<SingleSessionCell> helpRequestLView;
	
	@FXML
	private Button helpRequest;
	
	@FXML
	private Button helProposal;
	
	@FXML
	private Button addRevisionSession;
	
	

    /**
     * Default constructor
     */
    public AppointmentController() {
    }

    
    @FXML
	private void backHome(ActionEvent event) throws IOException {
		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.close();

		Stage nextStage = new Stage();
		nextStage.setTitle("Student Account");
		Pane myPane = null;
		myPane = FXMLLoader.load(getClass().getResource("/ui/homePage/HomePage.fxml"));

		Scene scene = new Scene(myPane);
		nextStage.setScene(scene);
		nextStage.show();

	}

    /**
     * @return
     * @throws IOException 
     */
    @FXML
    public void handleAddSingleSession(ActionEvent e) throws IOException {
    	Node  source = (Node)  e.getSource(); 
	    Stage stage  = (Stage) source.getScene().getWindow();
	    stage.close();
	                          
	    Stage nextStage = new Stage();
	    nextStage.setTitle("Add Help Proposal");
	    Pane myPane = null;
	    myPane = FXMLLoader.load(getClass().getResource("/ui/appointement/addJoin/addSingleSession.fxml"));
	
	    Scene scene = new Scene(myPane);
	    nextStage.setScene(scene);
	    nextStage.show(); 
    }

    /**
     * @return
     */
    public void updateSingleSession(SingleSessionCell ssc) {
        // TODO implement here
    	appointmentsFacade.updateSingleSession(ssc);
    	listSingleSession.remove(ssc);
    	singleSessionObservableList.clear();
    	singleSessionObservableList.addAll(listSingleSession);
    	singleSessionLView.setItems(singleSessionObservableList);
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
     * @throws IOException 
     */
    @FXML
    public void addAppointment(ActionEvent e) throws IOException {
    	Node  source = (Node)  e.getSource(); 
	    Stage stage  = (Stage) source.getScene().getWindow();
	    stage.close();
	                          
	    Stage nextStage = new Stage();
	    nextStage.setTitle("Add Revision Session");
	    Pane myPane = null;
	    myPane = FXMLLoader.load(getClass().getResource("/ui/appointement/addJoin/addRevisionSession.fxml"));
	
	    Scene scene = new Scene(myPane);
	    nextStage.setScene(scene);
	    nextStage.show(); 
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
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    	ArrayList<SingleSession> request = new ArrayList<>();
    	ArrayList<SingleSession> proposal = new ArrayList<>();
    	ArrayList<RevisionSession> revisionSession = new ArrayList<>();
    	    	
    	//SchoolClass sc = (SchoolClass)Router.getInstance().getParams()[0];
    	
    	SchoolClass sc = new SchoolClass(1, "IG3");
    	
    	request = appointmentsFacade.getHelpRequestByClass(sc.getIdSchoolClass());
    	System.out.println(request);
    	proposal = appointmentsFacade.getSingleSessionByClass(sc.getIdSchoolClass());
    	System.out.println(proposal);
    	revisionSession = appointmentsFacade.getAppointmentByClass(sc.getIdSchoolClass());
    	System.out.println(revisionSession);
    	listSingleSession = new ArrayList<>();
    	listHelpRequest = new ArrayList<>();
    	listRevisionSession = new ArrayList<>();
    	
    	/*for (SingleSession r : request) {
    		Student student;
			try {
				student = appointmentsFacade.getStudentOfOneAppointment(r.getStudent().getId());
				Subject subject = appointmentsFacade.getSubjectOfOneAppointmentById(r.getSubject().getId());
	        	SingleSessionCell helpRequestCell = new SingleSessionCell(r.getIdAppointment(), r.getIdClass(), null, student, subject, r.getDateAppointment(), r.getPlace(), r.getMeetingTime());
	        	listHelpRequest.add(helpRequestCell);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}*/
    	
    	for (SingleSession ss : proposal) {
    		Student teacher;
			try {
				teacher = appointmentsFacade.getStudentOfOneAppointment(ss.getTeacher().getId());
				Subject subject = appointmentsFacade.getSubjectOfOneAppointmentById(ss.getSubject().getId());
	        	SingleSessionCell singleSessionCell = new SingleSessionCell(ss.getIdAppointment(), ss.getIdClass(), teacher, null, subject, ss.getDateAppointment(), ss.getPlace(), ss.getMeetingTime());
	       		listSingleSession.add(singleSessionCell);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	
    	for (RevisionSession rs : revisionSession) {
    		Student teacher;
			try {
				teacher = appointmentsFacade.getStudentOfOneAppointment(rs.getTeacher().getId());
				ArrayList<Student> listStudent = appointmentsFacade.getListStudentOfOneAppointment(rs);
	    		Subject subject = appointmentsFacade.getSubjectOfOneAppointmentById(rs.getSubject().getId());
	    		RevisionSessionCell revisionSessionCell = new RevisionSessionCell(rs.getIdAppointment(), rs.getIdClass(), teacher, listStudent, subject, rs.getDateAppointment(), rs.getMeetingTime(), rs.getPlace());
	    		listRevisionSession.add(revisionSessionCell);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	
    	helpRequestObservableList = FXCollections.observableArrayList();
    	helpRequestObservableList.addAll(listHelpRequest);
    	
    	this.helpRequestLView.setItems(helpRequestObservableList);
    	this.helpRequestLView.setCellFactory(studentListView -> new SingleSessionListViewCell(this));
    	
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