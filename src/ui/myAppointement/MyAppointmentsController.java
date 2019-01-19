package ui.myAppointement;


import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import application.classesApp.Appointment;
import application.classesApp.MyDate;
import application.classesApp.Student;
import facades.AppointmentsFacade;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import ui.Router;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import ui.Router;
import ui.skill.SkillCell;
import ui.skill.SkillListViewCell;


/**
 * @author julienroumagnac
 */
public class MyAppointmentsController  {
	
	private AppointmentsFacade myAppFac = new AppointmentsFacade();

	private ArrayList<Appointment> myAppsPast;
	private ArrayList<Appointment> myAppsFutur;
	ObservableList<Appointment> pastObservableList;
	ObservableList<Appointment> futurObservableList;

	
	@FXML
	private ListView<Appointment> myPastLView;
	private ListView<Appointment> myFuturLView;

	
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
    
    public ArrayList<Appointment> getPastAppointment( ArrayList<Appointment> appts) {
    	ArrayList<Appointment>  pastApps = new ArrayList<Appointment>   ();
    	Date aujourdhui = new Date();
    	SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
    	MyDate today = new MyDate(formater.format(aujourdhui));
    	int a1,a2,m1,m2,j1,j2;
    	a1 = Integer.parseInt(today.getannee());
    	m1 =Integer.parseInt(today.getMois());
    	j1 = Integer.parseInt(today.getJour());
    	for (int i = 0;i<appts.size();i++) {
    		a2 = Integer.parseInt(appts.get(i).getDateAppointment().getannee());
        	m2 =Integer.parseInt(appts.get(i).getDateAppointment().getMois());
        	j2 = Integer.parseInt(appts.get(i).getDateAppointment().getJour());
    		
   		if(!((a1<a2) || (a1==a2 && m1<m2) || (a1==a2 && m1==m2 && j1<j2))) {
   			pastApps.add(appts.get(i));
    	}
   		}
    	return pastApps;
    }
    public ArrayList<Appointment> getFutureAppointment( ArrayList<Appointment> appts) {
    	ArrayList<Appointment>  futureApps = new ArrayList<Appointment>   ();
    	Date aujourdhui = new Date();
    	SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
    	MyDate today = new MyDate(formater.format(aujourdhui));
    	int a1,a2,m1,m2,j1,j2;
    	a1 = Integer.parseInt(today.getannee());
    	m1 =Integer.parseInt(today.getMois());
    	j1 = Integer.parseInt(today.getJour());
    	for (int i = 0;i<appts.size();i++) {
    		a2 = Integer.parseInt(appts.get(i).getDateAppointment().getannee());
        	m2 =Integer.parseInt(appts.get(i).getDateAppointment().getMois());
        	j2 = Integer.parseInt(appts.get(i).getDateAppointment().getJour());
    		
   		if(((a1<a2) || (a1==a2 && m1<m2) || (a1==a2 && m1==m2 && j1<j2))) {
   			futureApps.add(appts.get(i));
    	}
   		}
    	return futureApps;
    }

    @FXML
	private void backHome() {
		Router.getInstance().activate("HomePage");
	}


	@FXML
	public void initialize() {
		// TODO Auto-generated method stub
		Student s = new Student(2);
		myAppsPast = this.getPastAppointment(this.getMyAppointments(s));
		myAppsFutur = this.getFutureAppointment(this.getMyAppointments(s));
		
//		futurObservableList = FXCollections.observableArrayList();
//		futurObservableList.addAll(myAppsFutur);
		pastObservableList = FXCollections.observableArrayList();
		pastObservableList.addAll(myAppsPast);
		this.myPastLView.setItems(pastObservableList);
		this.myPastLView.setCellFactory(studentListView -> new PastListCell(this));
//		this.myFuturLView.setItems(pastObservableList);
//		this.myFuturLView.setCellFactory(studentListView -> new FuturListCell(this));
	}


    
    

   




}