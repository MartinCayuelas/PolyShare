package ui.skill;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import application.classesApp.SchoolClass;
import application.classesApp.Skill;
import application.classesApp.Student;
import facades.LoginFacade;
import facades.SchoolClassFacade;
import facades.SkillFacade;
import facades.exceptions.DisconnectedStudentException;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

/**
 * 
 */
public class SkillControlleur implements Initializable {

	protected List<String> skillsList = new ArrayList<>();

	protected ListProperty<String> listProperty = new SimpleListProperty<>();
	private SkillFacade skillFacade = new SkillFacade();
	private LoginFacade loginFacade = new LoginFacade();
	private SchoolClassFacade schoolClassFacade = new SchoolClassFacade();
	private Student student;
	
	/**
	 * Default constructor
	 */
	public SkillControlleur() {
	}

	/**
	 * @return
	 */
	public void addSkill() {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public void deleteSkill() {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public void updateSkill() {
		// TODO implement here
	}

	@FXML
	private Button button;

	@FXML
	private Label label;

	@FXML
	private ListView myListSkills;

	
	@FXML
	private void handleButtonAction(ActionEvent event) {
		listProperty.set(FXCollections.observableArrayList(skillsList));
		//listProperty.set(FXCollections.observableArrayList(europeanCurrencyList));
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		/*try {
			student = loginFacade.getConnectedStudent();
		} catch (DisconnectedStudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			student.setId(2);
		}*/
		ArrayList<Skill> sk = new ArrayList<>();
		student = new Student(2, "Test");
		sk = skillFacade.getSkills(student);
		 for(Skill sc : sk) {
			 SchoolClass clas = schoolClassFacade.findSchoolClassId(sc.getIdClass());
			 skillsList.add(sc.getNameSkill()+" - "+clas.getNameSchoolClass()+" - "+sc.getMarkSkill());
		    }
		
		

		/*europeanCurrencyList.add("EUR");
		europeanCurrencyList.add("GBP");
		europeanCurrencyList.add("NOK");
		europeanCurrencyList.add("SEK");
		europeanCurrencyList.add("CHF");
		europeanCurrencyList.add("HUF");*/
		
		myListSkills.itemsProperty().bind(listProperty);

		// This does not work, you can not directly add to a ListProperty
		// listProperty.addAll( asianCurrencyList );
		listProperty.set(FXCollections.observableArrayList(skillsList));
	}

}