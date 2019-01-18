package ui.myAppointement;

import java.io.IOException;

import application.classesApp.Appointment;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

/**
 * @author julienroumagnac
 */

public class PastListCell extends ListCell<Appointment> {

	private MyAppointmentsController controller;
	// private SkillFacade skillFacade = new SkillFacade();

	@FXML
	private Label cellLabelTeacher;
	@FXML
	private Label cellLabelSchoolClass;
	@FXML
	private Label cellLabelSubject;
	@FXML
	private Label cellLabelDate;

	@FXML
	private Button buttonDelete;
	@FXML
	private Button buttonUpdate;

	@FXML
	private BorderPane cellLayout;
	FXMLLoader mLLoader;

	public PastListCell(MyAppointmentsController controller) {
		super();
		this.controller = controller;
	}

	@Override
	protected void updateItem(Appointment ap, boolean empty) {
		super.updateItem(ap, empty);

		if (empty || ap == null) {

			setText(null);
			setGraphic(null);

		} else {
			if (mLLoader == null) {
				mLLoader = new FXMLLoader(getClass().getResource("pastApptCell.fxml"));
				mLLoader.setController(this);
				try {
					mLLoader.load();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
			System.out.println((ap.getTeacher().getNameStudent()));
			this.cellLabelTeacher.setText(String.valueOf("teacher : " + ap.getTeacher().getNameStudent()));
			//this.cellLabelSchoolClass.setText("info rdv : "+ String.valueOf(ap.getIdClass()+ String.valueOf(ap.getSubject().getNameSubject())+ ""));
			this.cellLabelSubject.setText("info rdv : "+ String.valueOf(ap.getIdClass()+" "+ String.valueOf(ap.getSubject().getNameSubject())+ " topic"));
			this.cellLabelDate.setText(String.valueOf(ap.getDateAppointment().getShowingDate()));

			setText(null);
			setGraphic(cellLayout);
//		}

		}
	}

}