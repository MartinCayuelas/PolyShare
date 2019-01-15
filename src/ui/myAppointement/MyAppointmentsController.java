package ui.myAppointement;

import java.net.URL;
import java.util.*;

import application.classesApp.Appointment;
import application.classesApp.Student;
import facades.AppointmentsFacade;
import javafx.fxml.Initializable;

/**
 * @author julienroumagnac
 */
public class MyAppointmentsController implements Initializable {
	
	private AppointmentsFacade myAppFac = new AppointmentsFacade();

    /**
     * Default constructor
     */
    public MyAppointmentsController() {
    }


    /**
     * @return
     */
    public void recommendStudent() {
        // TODO implement here
    }

    /**
     * @return
     */
    public void signalizeStudent() {
        // TODO implement here
    }
    /**
     * @return
     */
    public ArrayList<Appointment> getMyAppointments(Student s) {
    	ArrayList<Appointment>  myApps = new ArrayList<Appointment>   ();
    	myApps = myAppFac.getAppointmentByStudent( s);
    	return myApps;
    }


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}