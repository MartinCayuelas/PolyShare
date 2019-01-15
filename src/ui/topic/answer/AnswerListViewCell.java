package ui.topic.answer;

import java.io.IOException;

import application.classesApp.Answer;
import facades.SchoolClassFacade;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

/**
 * @author ponthieu
 */

public class AnswerListViewCell extends ListCell<Answer> {
	@FXML private Label nbLike;
	@FXML private TextArea answerContent;
	@FXML private BorderPane cellLayout;

	Answer answer;
	FXMLLoader mLLoader;
	AnswerController controller;
	

	public AnswerListViewCell(AnswerController controller) {
		super();
		this.controller = controller;
	}

	@Override
	protected void updateItem(Answer answer, boolean empty) {
		super.updateItem(answer, empty);
		this.answer = answer;
		
		if (empty || answer == null) {

			setText(null);
			setGraphic(null);

		} else {
			if (mLLoader == null) {
				mLLoader = new FXMLLoader(getClass().getResource("ListCellAnswer.fxml"));
				mLLoader.setController(this);
				try {
					mLLoader.load();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
			
			this.nbLike.setText(Integer.toString(answer.getNbLikesAnswer()));
			this.answerContent.setText(answer.getContent());
			
			setText(null);
			setGraphic(cellLayout);

		}

	}
	
	@FXML
	public void like() {
		controller.like(this.answer);
	}

}
