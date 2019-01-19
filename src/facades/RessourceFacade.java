package facades;


import java.util.*;

import application.classesApp.MediaFile;
import factory.AbstractFactory;
import persistent.DAO.MediaFileDAO;

/**
 * 
 */
public class RessourceFacade {
	
	private AbstractFactory abstractFactory = AbstractFactory.getFactoryMySql();
	private MediaFileDAO MfDAO = abstractFactory.createMediaFileDAO();

    /**
     * Default constructor
     */
    public RessourceFacade() {
    }


    /**
     * @param text 
     * @return
     */
    public void addAnswer(String text) {
        // TODO implement here
    }

    /**
     * @param text 
     * @return
     */
    public void addQuestion(String text) {
        // TODO implement here
    }

    /**
     * @param text 
     * @return
     */
    public void updateAnswer(String text) {
        // TODO implement here
    }

    /**
     * @return
     */
    public void updateQuestion() {
        // TODO implement here
    }

    /**
     * @return
     */
    public void closePost() {
        // TODO implement here
    }

    /**
     * @return
     */
    public void likeQ() {
        // TODO implement here
    }

    /**
     * @return
     */
    public void likeA() {
        // TODO implement here
    }

    /**
     * @return
     */
    public void unlikeQ() {
        // TODO implement here
    }

    /**
     * @return
     */
    public void unlikeA() {
        // TODO implement here
    }

    /**
     * @param text 
     * @return
     */
    public void saveMediaFile(String text) {
        // TODO implement here
    }

    /**
     * @param idMedia 
     * @return
     */
    public void deleteMediaFile(int idMedia) {
       MfDAO.deleteMediaFileById(idMedia);
    }

    /**
     * @return
     */
    public void likeMediaFile() {
        // TODO implement here
    }

    /**
     * @return
     */
    public void unlikeMediaFile() {
        // TODO implement here
    }


	public ArrayList<MediaFile> getAllMdByTopic(int idtopic) {
		ArrayList<MediaFile> listMediaFile = MfDAO.getAllMdByTopic(idtopic);
		return listMediaFile;
	}


	public void addMedia(MediaFile media) {
		MfDAO.createMediaFile(media);
		
	}

}