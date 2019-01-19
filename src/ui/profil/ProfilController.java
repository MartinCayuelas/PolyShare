package ui.profil;

import application.classesApp.Student;
import facades.LoginFacade;
import facades.exceptions.DisconnectedStudentException;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import ui.Router;

/**
 * 
 * @author ponthieu
 *
 */

public class ProfilController {
	@FXML TextField nameF;
	@FXML TextField firstNameF;
	@FXML TextField loginF;
	@FXML TextField emailF;
	@FXML PasswordField passwordF;
	LoginFacade lFacade = new LoginFacade();
	
	@FXML
	public void goBackHome() {
		Router.getInstance().activate("HomePage");
	}
	
	@FXML
	public void goSkills () {
		Router.getInstance().activate("Skill");
	}
	
	@FXML
	public void saveModifications() {
		String name = this.nameF.getText();
		String firstName = this.firstNameF.getText();
		String login = this.loginF.getText();
		String email = this.emailF.getText();
		String password = this.passwordF.getText();
		Student sCo;
		try {
			sCo = LoginFacade.getInstance().getConnectedStudent();
			Student newStudent = new Student(sCo.getId(),
					name, firstName, email, password,  login);
			lFacade.updateStudent(newStudent);
			LoginFacade.getInstance().setConnectedStudent(newStudent);
			
			
			Router.getInstance().activate("HomePage");
		} catch (DisconnectedStudentException e) {
			e.printStackTrace();
		}
	}

	
	@FXML
	public void initialize() {
		try {
			Student sConnected = LoginFacade.getInstance().getConnectedStudent();
			this.nameF.setText("ee");
			this.nameF.setText(sConnected.getNameStudent());
			this.firstNameF.setText(sConnected.getFirstNameStudent());
			this.loginF.setText(sConnected.getLoginID());
			this.emailF.setText(sConnected.getEmailStudent());
			this.passwordF.setText(sConnected.getPasswordStudent());
			
		} catch (DisconnectedStudentException e) {
			e.printStackTrace();
		}
	}
	
	
}
