package ui.skill.AddUpdateSkill;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import application.classesApp.SchoolClass;
import application.classesApp.Skill;
import facades.LoginFacade;
import facades.SchoolClassFacade;
import facades.SkillFacade;
import facades.exceptions.DisconnectedStudentException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import ui.Router;
import ui.skill.SkillCell;

/**
 * @author martinCayuelas
 */

public class addNewSkillController implements Initializable {

	private LoginFacade loginFacade = new LoginFacade();
	private SchoolClassFacade schoolClassFacade = new SchoolClassFacade();
	ObservableList<String> SchoolClassObservableList;
	Router r = Router.getInstance();

	@FXML
	private TextField nameSkill;
	// @FXML private TextField nameSkill;

	private SkillFacade skillFacade = new SkillFacade();

	@FXML
	private Spinner<Integer> mySpinner;
	@FXML
	private ChoiceBox<String> choiceBoxClass;

	public void addSkill() throws DisconnectedStudentException {
		// int idStudent = loginFacade.getConnectedStudent().getId();
		// Mettre idStudent à la place de 1

		// System.out.println(nameSkill.getText());
		// System.out.println(choiceBoxClass.getValue());
		SchoolClass lClass = schoolClassFacade.findSchoolClass(choiceBoxClass.getValue());
		// System.out.println(lClass.getIdSchoolClass() + " - "
		// +lClass.getNameSchoolClass());
		int idClass = lClass.getIdSchoolClass();
		Skill s = new Skill(0, nameSkill.getText(), mySpinner.getValue(), 1, idClass);
		skillFacade.addSkill(s);
		
		
		//Quand on appuie sur Add ça doit renvoyer vers la page des skills

	}

	private void initSpinner() {

		mySpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 5));
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

		initSpinner();
		List<SchoolClass> sc = new ArrayList<>();
		sc = schoolClassFacade.getAllSchoolClass();
		SchoolClassObservableList = FXCollections.observableArrayList();
		for (SchoolClass c : sc) {
			//System.out.println("Class : " + c.getNameSchoolClass());
			SchoolClassObservableList.add(c.getNameSchoolClass());
		}

		this.choiceBoxClass.setItems(SchoolClassObservableList);

	}

}
