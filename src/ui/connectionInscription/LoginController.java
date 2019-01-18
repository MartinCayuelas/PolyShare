package ui.connectionInscription;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import facades.LoginFacade;
import facades.exceptions.DisconnectedStudentException;
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
import ui.Router;

/**
 * 
 */
public class LoginController {
	
	// Java FX Implementation
	@FXML
	private Button btnLogin;
			
	@FXML
	private Button btnSignUp;
			
	@FXML
	private TextField txtEmailStudent;
			
	@FXML
	private PasswordField txtPassWord;
			
	@FXML
	private Label errorText;
			
			
	// Config
			
	private String emailStudent;
	private String passWord;
	private LoginFacade loginFacade = new LoginFacade();

    /**
     * Default constructor
     */
    public LoginController() {
    }


    /**
	 * Method used by btnLogin from Java FX
	 * @throws IOException 
	 */
	 @FXML
	 private void login(ActionEvent e) throws IOException {
		 emailStudent = txtEmailStudent.getText();
		 passWord = txtPassWord.getText();
	     if(emailStudent.equals("") || passWord.equals("")) {
	    	 errorText.setText("Enter email or password");
	     } else {
	    	 loginFacade.login(emailStudent, passWord);
	    	 if (loginFacade.isConnected()) {
             	
                Router.getInstance().activate("HomePage");
	    	 } else {
	    		 errorText.setText("Wrong email/password");
	    	 }
////	    	 try {
////				if (loginFacade.getConnectedStudent() != null) {
////				 	Node  source = (Node)  e.getSource(); 
////				    Stage stage  = (Stage) source.getScene().getWindow();
////				    stage.close();
////				                        
////				    Stage nextStage = new Stage();
////				    nextStage.setTitle("Student Account");
////				    Pane myPane = null;
////				    myPane = FXMLLoader.load(getClass().getResource("/ui/homePage/HomePage.fxml"));
////				            
////				            
////				    Scene scene = new Scene(myPane);
////				    nextStage.setScene(scene);
////				    nextStage.show(); 
////				 } else {
////					 errorText.setText("Wrong email/password");
////				 }
//			} catch (DisconnectedStudentException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
	     }
	 }
	 
	@FXML
	private void signup(ActionEvent e) throws IOException {
		Node  source = (Node)  e.getSource(); 
	    Stage stage  = (Stage) source.getScene().getWindow();
	    stage.close();
	                          
	    Stage nextStage = new Stage();
	    nextStage.setTitle("Student Account");
	    Pane myPane = null;
	    myPane = FXMLLoader.load(getClass().getResource("/ui/connectionInscription/UserForm.fxml"));
	
	    Scene scene = new Scene(myPane);
	    nextStage.setScene(scene);
	    nextStage.show(); 
	}
	
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		errorText.setText("");
	}

}