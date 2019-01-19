package ui.mediaFile;


import java.util.*;

import application.classesApp.MediaFile;
import facades.ForumFacade;
import facades.RessourceFacade;

/**
 * @author julien
 */
public class MediaFileController {
	
	
	RessourceFacade rssFac ;
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
    	ArrayList<MediaFile> listMediaFile = rssFac.getAllMdByTopic( idtopic);
    	return listMediaFile;
    }

    /**
     * @return
     */
    public void delete(int idMedia) {
    	rssFac= new RessourceFacade();
    	rssFac.deleteMediaFile(idMedia);
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