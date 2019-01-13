package ui.classes;

import java.io.IOException;
import java.net.URL;
import java.util.*;

import javafx.application.Application;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * 
 */
public class SchoolClassController extends Application implements Initializable {
	
	//Partie du lancement de la fenêtre
	private Stage primaryStage;
    private AnchorPane classLayout;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
        this.primaryStage.setTitle("ClassApp");

        initClassLayout();
	}
	
	public void initClassLayout() {
        try {
        	// Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader(SchoolClassController.class.getResource("SchoolClass.fxml"));
            classLayout = (AnchorPane) loader.load();
            
            // Show the scene containing the class layout.
    	    Scene scene = new Scene(classLayout);
           	primaryStage.setScene(scene);
           primaryStage.show();
            
        
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
	
	/**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }

	public static void main(String[] args) {
		launch(args);
	}

	//Partie du controller
    /**
     * Default constructor
     */
    public SchoolClassController() {
    }


    /**
     * @return
     */
    public void Create() {
        // TODO implement here
    }

    /**
     * @param s 
     * @return
     */
    public void find(String s) {
        // TODO implement here
    }

    /**
     * @return
     */
    public void join() {
        // TODO implement here
    }
    
    @FXML
	private ListView subjects;
    
    @FXML
    private ListView topics;

	protected List<String> listSubjects = new ArrayList<>();
	protected List<String> listTopics = new ArrayList<>();

	protected ListProperty<String> listProperty = new SimpleListProperty<>();

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		listSubjects.add("MathsFi");
		listSubjects.add("Bilan et CR");
		listSubjects.add("Marchés financiers");

		subjects.itemsProperty().bind(listProperty);

		// This does not work, you can not directly add to a ListProperty
		// listProperty.addAll( asianCurrencyList );
		listProperty.set(FXCollections.observableArrayList(listSubjects));
	}
}