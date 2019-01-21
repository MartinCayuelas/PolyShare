package ui.appointement;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import application.classesApp.RevisionSession;
import application.classesApp.SchoolClass;
import application.classesApp.SingleSession;
import application.classesApp.Student;
import application.classesApp.Subject;
import facades.AppointmentsFacade;
import facades.LoginFacade;
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
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import ui.Router;

/**
 * 
 */
public class AppointmentController {
	
	ObservableList<SingleSessionCell> singleSessionObservableList;
	
	ObservableList<RevisionSessionCell> revisionSessionObservableList;
	
	ObservableList<HelpRequestCell> helpRequestObservableList;
	
	List<SingleSessionCell> listSingleSession;
	
	List<RevisionSessionCell> listRevisionSession;
	
	List<HelpRequestCell> listHelpRequest;
	
	
	private AppointmentsFacade appointmentsFacade;
	
	@FXML 
	private ListView<SingleSessionCell> singleSessionLView;
	
	@FXML
	private ListView<RevisionSessionCell> revisionSessionLView;
	
	@FXML
	private ListView<HelpRequestCell> helpRequestLView;
	
	@FXML
	private Button helpRequest;
	
	@FXML
	private Button helProposal;
	
	@FXML
	private Button addRevisionSession;
	
	@FXML
	private Button backHome;

	private Student sConnected;
	
	

    /**
     * Default constructor
     */
    public AppointmentController() {
    } 

    
    @FXML
	private void backHome() {
    	Router.getInstance().activate("HomePage");
	}

    /**
     * @return
     * @throws IOException 
     */
    @FXML
    public void handleAddSingleSession() {
    	SchoolClass sc = (SchoolClass)Router.getInstance().getParams()[0];
    	SchoolClass[] params  = {sc};
        Router.getInstance().activate("AddHelpProposal", params);
    }
    
    
    @FXML
    public void handleAddHelpRequest() {
    	SchoolClass sc = (SchoolClass)Router.getInstance().getParams()[0];
    	SchoolClass[] params  = {sc};
        Router.getInstance().activate("AddHelpRequest", params); 
    }
    

    /**
     * @return
     */
    public void updateSingleSession(SingleSession ss) {
        // TODO implement here
    	appointmentsFacade.updateSingleSession(ss);
    	listSingleSession.remove(ss);
    	singleSessionObservableList.clear();
    	singleSessionObservableList.addAll(listSingleSession);
    	singleSessionLView.setItems(singleSessionObservableList);
    	Router.getInstance().activate("MyAppointements");
    }
    
    /**
     * @return
     */
    public void updateHelpRequest(SingleSession ss) {
        // TODO implement here
    	appointmentsFacade.updateHelpRequest(ss);
    	listHelpRequest.remove(ss);
    	helpRequestObservableList.clear();
    	helpRequestObservableList.addAll(listHelpRequest);
    	helpRequestLView.setItems(helpRequestObservableList);
    	Router.getInstance().activate("MyAppointements");
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
    public void addAppointment() {
    	SchoolClass sc = (SchoolClass)Router.getInstance().getParams()[0];
    	SchoolClass[] params  = {sc};
        Router.getInstance().activate("AddRevisionSession", params);
    }

    /**
     * @return
     */
    public void updateRevisionSession(RevisionSession rs, int idStudent) {
        // TODO implement here
    	appointmentsFacade.updateRevisionSession(rs, idStudent);
    	listRevisionSession.remove(rs);
    	revisionSessionObservableList.clear();
    	revisionSessionObservableList.addAll(listRevisionSession);
    	revisionSessionLView.setItems(revisionSessionObservableList);
    	Router.getInstance().activate("MyAppointements");
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
    	
    	try {
			this.sConnected = LoginFacade.getInstance().getConnectedStudent();
		} catch (DisconnectedStudentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	
    	this.appointmentsFacade = new AppointmentsFacade();
    	ArrayList<SingleSession> request = new ArrayList<>();
    	ArrayList<SingleSession> proposal = new ArrayList<>();
    	ArrayList<RevisionSession> revisionSession = new ArrayList<>();
    	    	
    	SchoolClass sc = (SchoolClass)Router.getInstance().getParams()[0];
    	
    	//SchoolClass sc = new SchoolClass(1, "IG3");
    	
    	request = appointmentsFacade.getHelpRequestByClass(sc.getIdSchoolClass());
    	proposal = appointmentsFacade.getSingleSessionByClass(sc.getIdSchoolClass());
    	revisionSession = appointmentsFacade.getAppointmentByClass(sc.getIdSchoolClass());
    	listSingleSession = new ArrayList<>();
    	listHelpRequest = new ArrayList<>();
    	listRevisionSession = new ArrayList<>();
    	
    	for (SingleSession r : request) {
    		Student student;
			try {
				student = appointmentsFacade.getStudentOfOneAppointment(r.getStudent().getId());
				Subject subject = appointmentsFacade.getSubjectOfOneAppointmentById(r.getSubject().getId());
	        	HelpRequestCell helpRequestCell = new HelpRequestCell(r.getIdAppointment(), r.getIdClass(), null, student, subject, r.getDateAppointment(), r.getPlace(), r.getMeetingTime(), r.getMessage());
	        	listHelpRequest.add(helpRequestCell);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	
    	for (SingleSession ss : proposal) {
    		Student teacher;
			try {
				teacher = appointmentsFacade.getStudentOfOneAppointment(ss.getTeacher().getId());
				Subject subject = appointmentsFacade.getSubjectOfOneAppointmentById(ss.getSubject().getId());
	        	SingleSessionCell singleSessionCell = new SingleSessionCell(ss.getIdAppointment(), ss.getIdClass(), teacher, null, subject, ss.getDateAppointment(), ss.getPlace(), ss.getMeetingTime(), ss.getMessage());
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
	    		RevisionSessionCell revisionSessionCell = new RevisionSessionCell(rs.getIdAppointment(), rs.getIdClass(), teacher, listStudent, subject, rs.getDateAppointment(), rs.getMeetingTime(), rs.getPlace(), rs.getMessage());
	    		listRevisionSession.add(revisionSessionCell);
	    		for (Student s : listStudent) {
	    			if (sConnected.getId() != s.getId()) {
	    	    		listRevisionSession.remove(revisionSessionCell);
	    	    		break;
	    			}
	    		}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	
    	helpRequestObservableList = FXCollections.observableArrayList();
    	helpRequestObservableList.addAll(listHelpRequest);
    	
    	this.helpRequestLView.setItems(helpRequestObservableList);
    	this.helpRequestLView.setCellFactory(studentListView -> new HelpRequestListViewCell(this));
    	
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