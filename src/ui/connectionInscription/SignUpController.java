package ui.connectionInscription;

import java.net.URL;
import java.util.*;

import facades.LoginFacade;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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
    private void welcome() {
    	validateNewUserButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if(!firstNameField.getText().isEmpty() && !nameField.getText().isEmpty() && !emailField.getText().isEmpty() && !passwordField.getText().isEmpty() && !passwordConfirmField.getText().isEmpty() && !loginIDField.getText().isEmpty()){
					if(passwordField.getText().equals(passwordConfirmField.getText())){
						loginFacade.signUp(nameField.getText(),firstNameField.getText(),emailField.getText(),passwordField.getText(),loginIDField.getText());
			            
						firstNameField.setText("");
					    nameField.setText("");
					    emailField.setText("");
					    loginIDField.setText("");
					} else {
			        	errorLabel.setText("Erreur : Invalid password confirmation");
			        }
				} else {
			    	passwordField.setText("");
				    passwordConfirmField.setText("");
				    //errorLabel.setText("Error : Missing Field");
				}
			}
    	});
		 
		 /*Node  source = (Node)  e.getSource(); 
        Stage stage  = (Stage) source.getScene().getWindow();
        stage.close();
                     
        Stage nextStage = new Stage();
        nextStage.setTitle("Student Profil");
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("/com/objis/userinterface/Profil.fxml"));

        Scene scene = new Scene(myPane);
        nextStage.setScene(scene);
        nextStage.show();*/
		
    }

    public void initialize(URL arg0, ResourceBundle arg1) {
    	// TODO Auto-generated method stub
    	welcome();
    }

}