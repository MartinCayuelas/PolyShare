package ui.appointement;

import java.io.IOException;
import java.util.List;

import application.classesApp.RevisionSession;
import application.classesApp.Student;
import facades.AppointmentsFacade;
import facades.LoginFacade;
import facades.exceptions.DisconnectedStudentException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.HBox;

public class RevisionSessionListViewCell extends ListCell<RevisionSessionCell> {
	
	private AppointmentController controller;
	
	private AppointmentsFacade appointmentsFacade = new AppointmentsFacade();
	
	@FXML 
	private Label cellLabelnameTeacher;
	
	@FXML 
	private Label cellLabelnameSubject;
	
	@FXML 
	private Label cellLabelExplication;
	
	@FXML 
	private Label cellLabelDateAppointment;
	
	@FXML 
	private Button buttonJoin;
	
	@FXML
	private ComboBox<String> students;
	
	@FXML 
	private  HBox cellLayout;
	
	FXMLLoader mLLoader;
	
	public RevisionSessionListViewCell(AppointmentController controller) {
		super();
		this.controller = controller;
	}
	
	protected void updateItem(RevisionSessionCell rsc, boolean empty) {
        super.updateItem(rsc, empty);
        
        if(empty || rsc == null) {

            setText(null);
            setGraphic(null);

        } else {
            if (mLLoader == null) {
                mLLoader = new FXMLLoader(getClass().getResource("RevisionSessionListViewCell.fxml"));
                mLLoader.setController(this);
                try {
                    mLLoader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            
            
            
            this.cellLabelnameTeacher.setText(String.valueOf(rsc.getTeacher().getNameStudent() + " " + rsc.getTeacher().getFirstNameStudent()));
            this.cellLabelnameSubject.setText(String.valueOf(rsc.getSubject().getNameSubject()));
            this.cellLabelExplication.setText(String.valueOf(rsc.getTeacher().getNameStudent()));
            this.cellLabelDateAppointment.setText(String.valueOf(rsc.getDateRevisionSession().getShowingDate()));
            for(Student s : rsc.getStudents()) {
            	this.students.getItems().add(String.valueOf(s.getNameStudent() + " " + s.getFirstNameStudent()));
            	this.students.setPromptText(s.getNameStudent());
            }
            
           
           this.buttonJoin.setOnAction(new EventHandler<ActionEvent>() {
               @Override
               public void handle(ActionEvent event) {
            	   RevisionSession rs = appointmentsFacade.getRevisionSessionById(rsc.getIdRevisionSession());
            	   try {
					int idStudent = LoginFacade.getInstance().getConnectedStudent().getId();
					controller.updateRevisionSession(rs, idStudent);
				} catch (DisconnectedStudentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
               }                            
           });
            
            setText(null);
            setGraphic(cellLayout);
        }

    }

}
