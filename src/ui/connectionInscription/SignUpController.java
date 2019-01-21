package ui.connectionInscription;

import java.io.IOException;
import java.net.URL;
import java.util.*;

import facades.LoginFacade;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import ui.Router;

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
     * @throws IOException 
     */
    @FXML
    private void welcome(ActionEvent event) throws IOException {
    	if(!firstNameField.getText().isEmpty() && !nameField.getText().isEmpty() && !emailField.getText().isEmpty() && !passwordField.getText().isEmpty() && !passwordConfirmField.getText().isEmpty() && !loginIDField.getText().isEmpty()){
    		if(passwordField.getText().equals(passwordConfirmField.getText())){
    			loginFacade.signUp(nameField.getText(),firstNameField.getText(),emailField.getText(),passwordField.getText(),loginIDField.getText());
    			Router.getInstance().activate("Login");
			} else {
				errorLabel.setText("Erreur : Invalid password confirmation");
			}
    	} else {
    		passwordField.setText("");
    		passwordConfirmField.setText("");
    		errorLabel.setText("Error : Missing Field");
    	}
    	
    }
    
    @FXML
	private void backLogin() {
    	Router.getInstance().activate("Login");

	}

    @FXML
    public void initialize() {
    	// TODO Auto-generated method stub

    }

}