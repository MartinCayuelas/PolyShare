package ui.appointement;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainAppointments extends Application {
	
	private Stage stage;
	private VBox loginLayout;

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		this.stage = primaryStage;
		initSkillLayout();
	}
	
	private void initSkillLayout() throws IOException {

		try {
			FXMLLoader root = new FXMLLoader(getClass().getResource("Appointement.fxml"));
			//root.setController(new AppointmentController());
		    Parent skillLayout = root.load();
	        Scene scene = new Scene(skillLayout, 700, 600);
	        
	        stage.setTitle("Appointments");
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
