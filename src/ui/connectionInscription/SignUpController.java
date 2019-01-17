package ui.connectionInscription;

import java.io.IOException;
import java.net.URL;
import java.util.*;

import facades.LoginFacade;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * 
 */
public class SignUpController {
	
	// Java FX Implementation
	@FXML
	private TextField nameField;
		
	@FXML
	private TextField firstNameField;
		
	@FXML
	private TextField emailField;
		
	@FXML
	private PasswordField passwordField;
		
	@FXML
	private PasswordField passwordConfirmField;
		
	@FXML
	private TextField loginIDField;
		
	@FXML
	private Button validateNewUserButton;
	
	@FXML
	private Label errorLabel;
	
	//Config
	LoginFacade loginFacade = new LoginFacade();
	

    /**
     * Default constructor
     */
    public SignUpController() {
    }

    /**
     * @return
     */
    @FXML
    private void welcome(ActionEvent event) {
    	if(!firstNameField.getText().isEmpty() && !nameField.getText().isEmpty() && !emailField.getText().isEmpty() && !passwordField.getText().isEmpty() && !passwordConfirmField.getText().isEmpty() && !loginIDField.getText().isEmpty()){
    		if(passwordField.getText().equals(passwordConfirmField.getText())){
    			loginFacade.signUp(nameField.getText(),firstNameField.getText(),emailField.getText(),passwordField.getText(),loginIDField.getText());
    			Node  source = (Node)  event.getSource(); 
    			Stage stage  = (Stage) source.getScene().getWindow();
				stage.close();
				                     
				Stage nextStage = new Stage();
				nextStage.setTitle("Student Profil");
				Pane myPane = null;
				try {
					myPane = FXMLLoader.load(getClass().getResource("/ui/connectionInscription/Login.fxml"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Scene scene = new Scene(myPane);
				nextStage.setScene(scene);
				nextStage.show();
			} else {
				errorLabel.setText("Erreur : Invalid password confirmation");
			}
    	} else {
    		passwordField.setText("");
    		passwordConfirmField.setText("");
    		errorLabel.setText("Error : Missing Field");
    	}
    }

    public void initialize(URL arg0, ResourceBundle arg1) {
    	// TODO Auto-generated method stub

    }

}