package ui.topic.answer;

import java.util.List;


import application.classesApp.Answer;
import application.classesApp.Question;
import application.classesApp.Topic;
import facades.SchoolClassFacade;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import ui.topic.QuestionListViewCell;

/**
 * @author ponthieu
 */
public class AnswerController {
	
	@FXML Label title;
	@FXML ListView<Answer> answerLV;
	@FXML Button back;
	@FXML TextArea answerArea;
	
	Stage window;
	Question question;
	List<Answer> aList;
	ObservableList<Answer> answerObservableList;
	SchoolClassFacade scFac;
	

    /**
     * Default constructor
     */
    public AnswerController(Question question, Stage window) {
    	this.question = question;
    	this.window = window;
    }

    
    @FXML
    private void close() {
    	this.window.close();
    }
    
    @FXML
    public void initialize() {
    	this.title.setText(this.question.getContentQuestion());
    	
    	
    	scFac = new SchoolClassFacade();
    	
    	answerObservableList = FXCollections.observableArrayList();
    	
    	fetchListAnswerView();
    	updateListView();
    	this.answerLV.setCellFactory(answerListView -> new AnswerListViewCell(this));
    }

	public void like(Answer answer) {
		SchoolClassFacade scf = new SchoolClassFacade();
		if (scf.likeAnswer(answer)) {
			answer.setNbLikesAnswer(answer.getNbLikesAnswer() - 1 );
		} else {
			answer.setNbLikesAnswer(answer.getNbLikesAnswer() + 1 );
		}
		
		
		updateListView();
		
		
	}
	
	private void updateListView () {
		answerObservableList.clear();
		answerObservableList.addAll(aList);
		this.answerLV.setItems(answerObservableList);
	}
	
	private void fetchListAnswerView() {
    	aList = this.scFac.getAllAnswerByQuestion(this.question);
    	
	}
	
	@FXML
	public void addAnswer() {
		String content = this.answerArea.getText();
		this.answerArea.clear();
		scFac.addAnswer(this.question.getId(), content);
		
		fetchListAnswerView();
		updateListView();
	}

}