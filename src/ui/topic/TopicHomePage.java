package ui.topic;

import java.util.List;

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

/**
 * @author ponthieu
 */
public class TopicHomePage {
	
	@FXML Button popup;
	@FXML ListView<Question> questionLV;
	@FXML TextArea questionArea;
	@FXML Label topicName;
	
	SchoolClassFacade scFac;
	List<Question> qList;
	Topic topic;
	ObservableList<Question> questionObservableList;

    /**
     * Default constructor
     */
    public TopicHomePage() {
    }


    /**
     * @return
     */
    public void add() {
        // TODO implement here
    }

    /**
     * @return
     */
    public void update() {
        // TODO implement here
    }

    /**
     * @return
     */
    public void delete() {
        // TODO implement here
    }

    /**
     * @return
     */
    public void like(Question question) {
    	SchoolClassFacade scf = new SchoolClassFacade();
		scf.likeQuestion(question);
    	fetchListQuestionView();
		updateListView();
    }
    
    private void fetchListQuestionView() {
    	qList = this.scFac.getAllQuestionByTopic(this.topic);
    	
	}
    
	private void updateListView () {
		questionObservableList.clear();
		questionObservableList.addAll(qList);
		this.questionLV.setItems(questionObservableList);
	}
    
    
    /**
     * Needed in router.params :
     * case 0 : Topic - Questions of this topic will be display
     * 
     */
    @FXML
    public void initialize() {
    	
    	
    	// get Class and fill ClassView
    	scFac = new SchoolClassFacade();
    	
    	//Topic topic = (Topic)Router.getInstance().getParams()[0];
    	//TODO enlever comment

    	topic = new Topic(0, "OOSE");
    	
    	this.topicName.setText(this.topic.getNameTopic());
    	qList = scFac.getAllQuestionByTopic(topic);
    	
    	questionObservableList = FXCollections.observableArrayList();
    	questionObservableList.addAll(qList);
    	
    	this.questionLV.setItems(questionObservableList);
    	this.questionLV.setCellFactory(questionListView -> new QuestionListViewCell(this));
    	
    }
    
    @FXML
    public void addQuestion() {
    	String content = this.questionArea.getText();
    	this.questionArea.clear();
    	
    	this.scFac.addQuestion(content, this.topic.getId());
    	
    	fetchListQuestionView();
    	updateListView();
    }

}