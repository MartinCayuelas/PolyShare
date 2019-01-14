package ui.appointement;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import application.classesApp.RevisionSession;
import application.classesApp.SchoolClass;
import application.classesApp.SingleSession;
import application.classesApp.Skill;
import facades.AppointmentsFacade;
import facades.exceptions.DisconnectedStudentException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import ui.Router;

/**
 * 
 */
public class AppointmentController {
	
	ObservableList<SingleSessionCell> singleSessionObservableList;
	
	List<SingleSessionCell> listSingleSession;
	
	
	private AppointmentsFacade appointmentsFacade = new AppointmentsFacade();
	
	@FXML 
	private ListView<SingleSessionCell> singleSessionLView;
	
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
    public void initialize(URL url, ResourceBundle rb) throws DisconnectedStudentException {
    	ArrayList<Skill> request = new ArrayList<>();
    	ArrayList<SingleSession> proposal = new ArrayList<>();
    	ArrayList<RevisionSession> revisionSession = new ArrayList<>();
    	
    	//Student student = LoginFacade.getInstance().getConnectedStudent();
    	
    	SchoolClass sc = (SchoolClass)Router.getInstance().getParams()[0];
    	
    	proposal = appointmentsFacade.getSingleSessionByClass(sc.getIdSchoolClass());
    	revisionSession = appointmentsFacade.getAppointmentByClass(sc.getIdSchoolClass());
    	
    	List<SingleSessionCell> listSingleSession = new ArrayList<SingleSessionCell>();
    	
    	for (SingleSession ss : proposal) {
    		//Subject subject = SubjectDAO.findSubjectById(ss.getIdSubject());
    		//String nameSubject = Subject.getNameSubject(ss.getIdSubject());
    		SingleSessionCell singleSessionCell = new SingleSessionCell(ss.getIdAppointment(), ss.getTeacher(), ss.getIdSubject(), ss.getDateAppointment());
    		listSingleSession.add(singleSessionCell);
    	}
    	
    	ObservableList<SingleSessionCell> singleSessionObservableList = FXCollections.observableArrayList();
    	singleSessionObservableList.addAll(listSingleSession);
    	
    	this.singleSessionLView.setItems(singleSessionObservableList);
    	this.singleSessionLView.setCellFactory(studentListView -> new SingleSessionListViewCell());
    	
    	
    	
    	
    }

}