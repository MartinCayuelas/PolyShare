package ui.skill;

import java.io.IOException;

import application.classesApp.SchoolClass;
import application.classesApp.Skill;
import facades.SkillFacade;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.HBox;


/**
 * @author martinCayuelas
 */

public class SkillListViewCell extends ListCell<SkillCell> {
	
	private SkillControlleur controller;
	private SkillFacade skillFacade = new SkillFacade();
	@FXML private Label cellLabelnomSkill;
	@FXML private Label cellLabelSchoolClassSkill;
	@FXML private Label cellLabelmarkSkill;
	
	@FXML private Button buttonDelete;
	@FXML private Button buttonUpdate;
	
	@FXML private  HBox cellLayout;
	FXMLLoader mLLoader;
	
	
	
	public SkillListViewCell(SkillControlleur controller) {
		super();
		this.controller = controller;
	}



	@Override
    protected void updateItem(SkillCell sc, boolean empty) {
        super.updateItem(sc, empty);
        
        if(empty || sc == null) {

            setText(null);
            setGraphic(null);

        } else {
            if (mLLoader == null) {
                mLLoader = new FXMLLoader(getClass().getResource("SkillListViewCell.fxml"));
                mLLoader.setController(this);
                try {
                    mLLoader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            
            this.cellLabelnomSkill.setText(String.valueOf(sc.getNomSkill()));
            this.cellLabelSchoolClassSkill.setText(String.valueOf(sc.getNomClasse()));
           String mark = String.valueOf(sc.getMarkSkill());
           this.cellLabelmarkSkill.setText(mark);
           
           this.buttonUpdate.setOnAction(new EventHandler<ActionEvent>() {
               @Override
               public void handle(ActionEvent event) {
                   
               }                            
           });
           
           this.buttonDelete.setOnAction(new EventHandler<ActionEvent>() {
               @Override
               public void handle(ActionEvent event) { 
                   controller.deleteSkill(sc);
               }                            
           });
           
            setText(null);
            setGraphic(cellLayout);
        }

    }
	
}