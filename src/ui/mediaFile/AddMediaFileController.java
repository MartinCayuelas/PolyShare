package ui.mediaFile;

import java.io.IOException;

import application.classesApp.MediaFile;
import application.classesApp.Topic;
import facades.RessourceFacade;
import facades.exceptions.DisconnectedStudentException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import ui.Router;

public class AddMediaFileController {
	private Topic topic;
	RessourceFacade rssFac ;
	@FXML
	private TextField titleMedia;
	@FXML
	private TextField linkMedia;
	
	@FXML
	private Button addNewMedia;
	@FXML
	private Button backbutton;

	public AddMediaFileController() {
		super();
	}
	@FXML
	public void createMedia(ActionEvent event) throws DisconnectedStudentException, IOException {
		MediaFile media = new MediaFile(0,titleMedia.getText(),this.topic.getId(),linkMedia.getText());
		rssFac = new RessourceFacade();
		rssFac.addMedia(media);
		
		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.close();

		//Router.getInstance().activate("Topic");
		
	}
	@FXML
	private void backHome(ActionEvent event) throws DisconnectedStudentException, IOException{
		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.close();
		Router.getInstance().activate("Topic");
	}

	
	public void init(Topic t) {
		this.topic = t;
	}

	@FXML
	public void initialize() {
	
		

	}

}
