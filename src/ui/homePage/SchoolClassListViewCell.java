package ui.homePage;

import java.io.IOException;

import application.classesApp.SchoolClass;
import facades.SchoolClassFacade;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.BorderPane;
/**
 * 
 * @author ponthieu
 *
 */

public class SchoolClassListViewCell extends ListCell<SchoolClass> {
	@FXML
	private Label cellLabelSchoolClass;
	@FXML
	private BorderPane cellLayout;
	@FXML
	private Button btn;
	FXMLLoader mLLoader;
	Boolean searched;
	SchoolClassFacade scFac = null;
	SchoolClass sc = null;
	HomePageController controller;

	public SchoolClassListViewCell(HomePageController controller, Boolean searched) {
		super();
		this.searched = searched;
		this.scFac = new SchoolClassFacade();
		this.controller = controller;
	}

	@Override
	protected void updateItem(SchoolClass sc, boolean empty) {
		super.updateItem(sc, empty);

		this.sc = sc;
		if (empty || sc == null) {

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

			// Create the btn
			if (this.searched) {
				this.btn.setStyle("-fx-background-color :  #357AB7;\n" + "	-fx-text-fill:  #FFFFFF;");
				this.btn.setText("Join");
				btn.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
						join();
					}
				});

			} else {
				this.btn.setStyle("-fx-background-color :  #FF0000;\n" + "	-fx-text-fill:  #FFFFFF;");
				this.btn.setText("Quit");
				btn.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
						quit();
					}
				});
			
			}
		}

		setText(null);
		setGraphic(cellLayout);
	}


	@FXML
	private void join() {
		this.scFac.joinSchoolClass(this.sc);
		this.controller.fetchList();
		this.controller.updateListView();
	}

	@FXML
	private void quit() {
		this.scFac.quitClass(this.sc);
		this.controller.fetchList();
		this.controller.updateListView();
	}

}
