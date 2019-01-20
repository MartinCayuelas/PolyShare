package ui.appointement;

import java.io.IOException;

import application.classesApp.SingleSession;
import facades.AppointmentsFacade;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.HBox;

public class HelpRequestListViewCell extends ListCell<HelpRequestCell> {

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
	private Button buttonAccept;
	
	@FXML 
	private  HBox cellLayout;
	
	FXMLLoader mLLoader;
	
	public HelpRequestListViewCell(AppointmentController controller) {
		super();
		this.controller = controller;
	}
	
	@Override
	protected void updateItem(HelpRequestCell hrc, boolean empty) {
        super.updateItem(hrc, empty);
        
        if(empty || hrc == null) {

            setText(null);
            setGraphic(null);

        } else {
            if (mLLoader == null) {
                mLLoader = new FXMLLoader(getClass().getResource("SingleSessionListViewCell.fxml"));
                mLLoader.setController(this);
                try {
                    mLLoader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            
            this.cellLabelnameTeacher.setText(String.valueOf(hrc.getStudent().getNameStudent() + " " + hrc.getStudent().getFirstNameStudent()));
            this.cellLabelnameSubject.setText(String.valueOf(hrc.getSubject().getNameSubject()));
            this.cellLabelExplication.setText(String.valueOf(hrc.getMessage()));
            this.cellLabelDateAppointment.setText(String.valueOf(hrc.getDateRevisionSession().getShowingDate()));
           
            this.buttonAccept.setOnAction(new EventHandler<ActionEvent>() {
            	@Override
            	public void handle(ActionEvent event) {
            		SingleSession ss = appointmentsFacade.getSingleSessionById(hrc.getIdSingleSession());
            		controller.updateSingleSession(ss);
            	}                            
            });
            
            setText(null);
            setGraphic(cellLayout);
        }

    }
	
}
