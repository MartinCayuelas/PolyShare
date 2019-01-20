package ui.mediaFile;


import java.io.IOException;
import java.util.ArrayList;

import application.classesApp.MediaFile;
import application.classesApp.Topic;
import facades.RessourceFacade;
import facades.exceptions.DisconnectedStudentException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

/**
 * @author roumagnac, cayuelas
 */
public class MediaFileController {
	
	private Topic topic;
	RessourceFacade rssFac ;
	ObservableList<MediaFile> mfObservableList;
	@FXML
	private ListView<MediaFile> mfListView;
	
	private ArrayList<MediaFile> mediaFiles;
    /**
     * Default constructor
     */
    public MediaFileController() {
    }


    /**
     * @return
     */
    public void upload() {
        // TODO implement here
    }
    public ArrayList<MediaFile> getAllMediaFilesByTopic(int idtopic) {
    	rssFac= new RessourceFacade();
    	ArrayList<MediaFile> listMediaFile = new ArrayList<MediaFile>();
    	listMediaFile = rssFac.getAllMdByTopic( idtopic);
    	return listMediaFile;
    }
    
    @FXML
	public void initialize() {
//TODO recuperer le topicId de la page 
		

    	
		mediaFiles= this.getAllMediaFilesByTopic(this.topic.getId());
		
		mfObservableList = FXCollections.observableArrayList();
		mfObservableList.addAll(mediaFiles);
		this.mfListView.setItems(mfObservableList);
		this.mfListView.setCellFactory(mfListView -> new MediaListCell(this));
		
		
		
		
		
	}
    
    public void init(Topic t) {
    	this.topic = t;
    }
    
    @FXML
	private void backHome(ActionEvent event) throws DisconnectedStudentException, IOException{
		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.close();
		//Router.getInstance().activate("HomePage");
	}

    /**
     * @return
     */
    
    public void delete(MediaFile md) {
    	rssFac= new RessourceFacade();
    	rssFac.deleteMediaFile(md.getIdMediaFile());
    
    	mediaFiles.remove(md);
    	mfObservableList.clear();
    	mfObservableList.addAll(mediaFiles);
		
		mfListView.setItems(mfObservableList);
    }

    /**
     * @return
     */
    public void save() {
        // TODO implement here
    }

    /**
     * @return
     */
    public void like() {
        // TODO implement here
    }

    /**
     * @return
     */
    public void unlike() {
        // TODO implement here
    }
    
    

}