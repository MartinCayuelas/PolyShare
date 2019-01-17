package ui.skill;

import java.io.IOException;
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
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import ui.Router;
import ui.homePage.SchoolClassListViewCell;

/**
 * 
 */
public class SkillControlleur implements Initializable {

	@FXML private ListView<SkillCell> mySkillsLView;

	//protected ListProperty<String> listProperty = new SimpleListProperty<>();
	private SkillFacade skillFacade = new SkillFacade();
	private LoginFacade loginFacade = new LoginFacade();
	private SchoolClassFacade schoolClassFacade = new SchoolClassFacade();
	private Student student;
	private Router r = Router.getInstance();
	ObservableList<SkillCell> skillObservableList;
	List<SkillCell> skCells ;
	
	/**
	 * Default constructor
	 */
	public SkillControlleur() {
	}

	

	/**
	 * @return
	 */
	public void deleteSkill(SkillCell s) {
		//Skill s = new Skill(12, "ASupprimer", 4, 2, 1);
		skillFacade.deleteSkill(s.getSkill());
		skCells.remove(s);
		skillObservableList.clear();
		skillObservableList.addAll(skCells);
		System.out.println(skCells.size());
		mySkillsLView.setItems(skillObservableList);
		
		
	}

	

	@FXML
	private Button button;

	@FXML
	private Label label;

	@FXML
	private ListView<?> myListSkills;

	
	
	
	@FXML
	private void handleAddNewSkill(ActionEvent event) throws IOException {
		Node  source = (Node)  event.getSource(); 
        Stage stage  = (Stage) source.getScene().getWindow();
        stage.close();
                            
        Stage nextStage = new Stage();
        nextStage.setTitle("Student Account");
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("/ui/skill/AddUpdateSkill/addNewSkill.fxml"));
                
                
        Scene scene = new Scene(myPane);
        nextStage.setScene(scene);
        nextStage.show(); 
		
		
	}
	
	@FXML
	private void backHome(ActionEvent event) throws IOException {
		Node  source = (Node)  event.getSource(); 
        Stage stage  = (Stage) source.getScene().getWindow();
        stage.close();
                            
        Stage nextStage = new Stage();
        nextStage.setTitle("Student Account");
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("/ui/homePage/HomePage.fxml"));
                
                
        Scene scene = new Scene(myPane);
        nextStage.setScene(scene);
        nextStage.show(); 
		
		
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
		student = new Student(1, "Test");
		sk = skillFacade.getSkills(student);
		 skCells = new ArrayList<>();
		
		 for(Skill sc : sk) {
			 SchoolClass clas = schoolClassFacade.findSchoolClassId(sc.getIdClass());
			 SkillCell sCell = new SkillCell(sc,clas.getNameSchoolClass());
			//skillsList.add(sc.getNameSkill()+" - "+clas.getNameSchoolClass()+" - "+sc.getMarkSkill());
			 System.out.println(sCell.getNomSkill()+" - "+sCell.getNomClasse()+" - "+sCell.getMarkSkill());
			 
			 skCells.add(sCell);
		    }
		
		
		skillObservableList = FXCollections.observableArrayList();
		skillObservableList.addAll(skCells);
    	
    	this.mySkillsLView.setItems(skillObservableList);
    	this.mySkillsLView.setCellFactory(studentListView -> new SkillListViewCell(this));
	

	
	}

}