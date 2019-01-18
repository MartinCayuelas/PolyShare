package ui.myAppointement;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
//import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainMyApp extends Application {

	private Stage stage;
	private AnchorPane loginLayout;
	// private AnchorPane anchorPane;

	@Override
	public void start(Stage primaryStage) throws IOException {
		this.stage = primaryStage;
		initApptLayout();
	}

	private void initApptLayout() throws IOException {

		try {
			FXMLLoader root = new FXMLLoader(getClass().getResource("MyAppointements.fxml"));
			Parent homeLayout = root.load();
			Scene scene = new Scene(homeLayout, 1000, 800);

			stage.setTitle("MyAppointments");
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