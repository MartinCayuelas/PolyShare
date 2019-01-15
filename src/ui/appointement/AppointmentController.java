package ui.appointement;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import application.classesApp.RevisionSession;
import application.classesApp.SchoolClass;
import application.classesApp.SingleSession;
import facades.AppointmentsFacade;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import ui.Router;

/**
 * 
 */
public class AppointmentController implements Initializable {
	
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

    /**
     * Default constructor
     */
    public AppointmentController() {
    }


    /**
     * @return
     */
    public void addSingleSession() {
        // TODO implement here
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
    public void initialize(URL url, ResourceBundle rb) {
    	System.out.println("Salut!");
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