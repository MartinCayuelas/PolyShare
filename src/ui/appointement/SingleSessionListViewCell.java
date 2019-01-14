package ui.appointement;

import java.io.IOException;

import facades.AppointmentsFacade;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;

public class SingleSessionListViewCell extends ListCell<SingleSessionCell> {
	
	private AppointmentController controller;
	
	private AppointmentsFacade appointmentsFacade = new AppointmentsFacade();
	
	@FXML 
	private Label cellLabelnameTeacher;
	
	@FXML 
	private Label cellLabelnameSubject;
	
	@FXML 
	private TextArea cellLabelExplication;
	
	@FXML 
	private Label cellLabelDateAppointment;
	
	@FXML 
	private Button buttonAccept;
	
	@FXML 
	private  HBox cellLayout;
	
	FXMLLoader mLLoader;
	
	public SingleSessionListViewCell(AppointmentController controller) {
		super();
		this.controller = controller;
	}
	
	protected void updateItem(SingleSessionCell ssc, boolean empty) {
        super.updateItem(ssc, empty);
        
        if(empty || ssc == null) {

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
            
            
            
            this.cellLabelnameTeacher.setText(String.valueOf(ssc.getTeacher().getNameStudent()));
            //this.cellLabelnameSubject.setText(String.valueOf(ssc.getIdSubject()));
            this.cellLabelExplication.setText(String.valueOf(ssc.getTeacher().getNameStudent()));
            this.cellLabelDateAppointment.setText(String.valueOf(ssc.getDateRevisionSession()));
           
           /* this.buttonAccept.setOnAction(new EventHandler<ActionEvent>() {
               @Override
               public void handle(ActionEvent event) {
                   
               }                            
           });*/
           
           
           
           
          // this.buttonUpdate.setOnAction();
            //this.buttonUpdate.add
            
            setText(null);
            setGraphic(cellLayout);
        }

    }

}
