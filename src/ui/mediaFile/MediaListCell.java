package ui.mediaFile;

import java.io.IOException;

import application.classesApp.Appointment;
import application.classesApp.MediaFile;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.BorderPane;
import ui.myAppointement.MyAppointmentsController;

public class MediaListCell extends ListCell<MediaFile> {

		private MediaFileController controller;
		// private SkillFacade skillFacade = new SkillFacade();

		@FXML
		private Label titreMedia;
		@FXML
		private Hyperlink linkMedia;
		

		@FXML
		private Button buttonDelete;
		@FXML
		private Button buttonUpdate;

		@FXML
		private BorderPane cellLayout;
		FXMLLoader mLLoader;

		public MediaListCell(MediaFileController controller) {
			super();
			this.controller = controller;
		}
		@FXML
		private void delete() {
			
		}

		@Override
		protected void updateItem(MediaFile mf, boolean empty) {
			super.updateItem(mf, empty);

			if (empty || mf == null) {

				setText(null);
				setGraphic(null);

			} else {
				if (mLLoader == null) {
					mLLoader = new FXMLLoader(getClass().getResource("CellMedia.fxml"));
					mLLoader.setController(this);
					try {
						mLLoader.load();
					} catch (IOException e) {
						e.printStackTrace();
					}

				}
				
				this.titreMedia.setText(String.valueOf( mf.getNameMediaFile()));
				
				this.linkMedia.setText( String.valueOf(mf.getLien()));
				

				setText(null);
				setGraphic(cellLayout);
			}
			
			
		

	}

}
