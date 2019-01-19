package ui.mediaFile;

import java.io.IOException;

import application.classesApp.MediaFile;
import application.classesApp.Student;
import facades.RessourceFacade;
import facades.exceptions.DisconnectedStudentException;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import ui.Router;
import ui.myAppointement.PastListCell;

public class AddMediaFileController {
	RessourceFacade rssFac ;
	@FXML
	private TextField titleMedia;
	@FXML
	private TextField linkMedia;

	public AddMediaFileController() {
		super();
	}
	@FXML
	public void createMedia(ActionEvent event) throws DisconnectedStudentException, IOException {
		MediaFile media = new MediaFile(titleMedia.getText(),linkMedia.getText(),1);
		rssFac = new RessourceFacade();
		rssFac.addMedia(media);
		
		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.close();

		Router.getInstance().activate("Topic");
		
	}
	@FXML
	private void backHome(ActionEvent event) throws DisconnectedStudentException, IOException{
		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.close();
		Router.getInstance().activate("Topic");
	}


	@FXML
	public void initialize() {
	
		

	}

}
