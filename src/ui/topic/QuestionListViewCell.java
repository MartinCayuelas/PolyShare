package ui.topic;

import java.io.IOException;

import application.Main;
import application.classesApp.Question;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import ui.topic.answer.AnswerController;

/**
 * @author ponthieu
 */

public class QuestionListViewCell extends ListCell<Question> {
	@FXML private Button seeMore;
	@FXML private Label nbLike;
	@FXML private Label questionContent;

	@FXML private BorderPane cellLayout;

	Question question;
	FXMLLoader mLLoader;
	TopicHomePage controller;
	
	public QuestionListViewCell(TopicHomePage controller) {
		super();
		this.controller = controller;
	}

	@Override
	protected void updateItem(Question question, boolean empty) {
		super.updateItem(question, empty);
		this.question = question;

		if (empty || question == null) {

			setText(null);
			setGraphic(null);

		} else {
			if (mLLoader == null) {
				mLLoader = new FXMLLoader(getClass().getResource("ListCellQuestion.fxml"));
				mLLoader.setController(this);
				try {
					mLLoader.load();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
			
			this.nbLike.setText(Integer.toString(question.getNbLikesQuestion()));
			this.questionContent.setText(question.getContentQuestion());
			setText(null);
			setGraphic(cellLayout);

		}

	}

	@FXML
	public void seeMore() {
		Stage dialog = new Stage();
		FXMLLoader root = new FXMLLoader(getClass().getResource("answer/Answer.fxml"));
		root.setController(new AnswerController(question, dialog));
		Parent skillLayout;
		try {
			skillLayout = root.load();
			Scene scene = new Scene(skillLayout, 700, 600);
			dialog.setTitle("Answers");
			dialog.setScene(scene);
			dialog.initOwner(Main.primaryStage);
			dialog.initModality(Modality.APPLICATION_MODAL);
			dialog.showAndWait();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	

	@FXML
	public void like() {
		controller.like(this.question);
	}

}
