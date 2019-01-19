package ui.mediaFile;

import java.io.IOException;

import application.Main;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestAddFile extends Application {
	public static Stage primaryStage = null;
	
	public void start(Stage primaryStage) {
		Main.primaryStage = primaryStage;
		
		try {System.out.println(1);
			FXMLLoader root = new FXMLLoader(getClass().getResource("/ui/mediaFile/MediaFile.fxml"));
			System.out.println(2);
		    Parent skillLayout = root.load();
		    System.out.println(3);
	        Scene scene = new Scene(skillLayout, 1000, 800);
	        System.out.println(4);
	        
	        primaryStage.setTitle("FXML Welcome");
	        System.out.println(4);
	        primaryStage.setScene(scene);
	        System.out.println(4);
	        primaryStage.show();
	        System.out.println(5);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

	public static void main(String[] args) {

		
		launch(args);}

}
