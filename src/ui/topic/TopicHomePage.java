package ui.topic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import application.classesApp.MediaFile;
import application.classesApp.Question;
import application.classesApp.Topic;
import facades.ForumFacade;
import facades.SchoolClassFacade;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import ui.Router;

/**
 * @author ponthieu julienroumagnac
 */
public class TopicHomePage {
	
	@FXML Button popup;
	@FXML ListView<Question> questionLV;
	@FXML TextArea questionArea;
	@FXML Label topicName;
	
	SchoolClassFacade scFac;
	ForumFacade forumFac ;
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
    	
    	this.topic = (Topic)Router.getInstance().getParams()[0];
    	
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
    
    @FXML
    public void backHome() {
    	Router.getInstance().activate("HomePage");
    }
    public ArrayList<MediaFile> getAllMediaFiles() {
    	forumFac= new ForumFacade();
    	ArrayList<MediaFile> listMediaFile = forumFac.getAllMd();
    	return listMediaFile;
    }
    
    @FXML
	private void handleAddNewMedia(ActionEvent event) throws IOException {
		

		Stage nextStage = new Stage();
		nextStage.setTitle("New Media");
		Pane myPane = null;
		myPane = FXMLLoader.load(getClass().getResource("/ui/mediaFile/AddMediaFille.fxml"));

		Scene scene = new Scene(myPane);
		nextStage.setScene(scene);
		nextStage.show();

	}
    @FXML
	private void getRessources(ActionEvent event) throws IOException {
		

		Stage nextStage = new Stage();
		nextStage.setTitle("Ressources");
		Pane myPane = null;
		myPane = FXMLLoader.load(getClass().getResource("/ui/mediaFile/MediaFile.fxml"));

		Scene scene = new Scene(myPane,1000,800);
		nextStage.setScene(scene);
		nextStage.show();

	}
    

}