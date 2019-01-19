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
			this.cellLabelTeacher.setText(String.valueOf(  ap.getTeacher().getNameStudent()));
			
			this.cellLabelSubject.setText( String.valueOf(ap.getSchoolClass().getNameSchoolClass()+"-->"+ String.valueOf(ap.getSubject().getNameSubject())));
			this.cellLabelDate.setText(String.valueOf("rdv le " + ap.getDateAppointment().getShowingDate() + " en " +ap.getPlace()));

			setText(null);
			setGraphic(cellLayout);
//		}

		}
	}

}