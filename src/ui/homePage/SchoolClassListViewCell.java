package ui.homePage;

import java.io.IOException;

import application.classesApp.SchoolClass;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.HBox;

public class SchoolClassListViewCell extends ListCell<SchoolClass> {
	@FXML private Label cellLabelSchoolClass;
	@FXML private  HBox cellLayout;
	FXMLLoader mLLoader;
	
	@Override
    protected void updateItem(SchoolClass sc, boolean empty) {
        super.updateItem(sc, empty);
        
        if(empty || sc == null) {

            setText(null);
            setGraphic(null);

        } else {
            if (mLLoader == null) {
                mLLoader = new FXMLLoader(getClass().getResource("ListCellSchoolClass.fxml"));
                mLLoader.setController(this);
                try {
                    mLLoader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            
            this.cellLabelSchoolClass.setText(String.valueOf(sc.getNameSchoolClass()));
            
            setText(null);
            setGraphic(cellLayout);
        }

    }
	
}
