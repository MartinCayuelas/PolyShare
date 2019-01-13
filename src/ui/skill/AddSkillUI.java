package ui.skill;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AddSkillUI extends Application {

	private Stage stage;
	private AnchorPane loginLayout;
	//private AnchorPane anchorPane;

	@Override
	public void start(Stage primaryStage) throws IOException {
		this.stage = primaryStage;
		initLoginLayout();
	}

	private void initLoginLayout() throws IOException {

		try {
			FXMLLoader root = new FXMLLoader(getClass().getResource("addNewSkill.fxml"));
		    Parent skillLayout = root.load();
	        Scene scene = new Scene(skillLayout, 700, 600);
	        
	        stage.setTitle("FXML Welcome");
	        stage.setScene(scene);
	        stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

	public static void main(String[] args) {
		launch(args);
	}
}
