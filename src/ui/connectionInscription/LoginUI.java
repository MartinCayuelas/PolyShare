package ui.connectionInscription;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
//import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginUI extends Application {

	private Stage primaryStage;
	private VBox loginLayout;
	//private AnchorPane anchorPane;

	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		initLoginLayout();
	}

	private void initLoginLayout() throws IOException {

		try {
			FXMLLoader root = new FXMLLoader(getClass().getResource("Login.fxml"));
			root.setController(new LoginController());
			loginLayout = (VBox) root.load();
			Scene scene = new Scene(loginLayout);
			primaryStage.setTitle("Login Interface");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

	public static void main(String[] args) {
		launch(args);
	}
}
