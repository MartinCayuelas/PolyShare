package application.classesApp;

import java.util.*;


/**
 * <b>MediaFile</b> corresponds to documents shared between Students
 */
/** @author julien
 * 
 * 
 * */
public class MediaFile {

    /**
     * Default constructor
     */
    public MediaFile() {
    }

    public MediaFile(String url) {
		// TODO Auto-generated constructor stub
    	this.nameMediaFile = url;
	}

	public MediaFile(String titre, String lien) {
		// TODO Auto-generated constructor stub
		this.nameMediaFile=titre;
		this.lienMF = lien;
	}

	/**
     * 
     */
    public String nameMediaFile;
    
    public String lienMF;

    /**
     * 
     */
    public int nbLikesMediaFile;

	public int idTopic;


    /**
     * Download a MediaFile
     */
    public void downloadMediaFile() {
        // TODO implement here
    }

    /**
     * Delete a MediaFile
     */
    public void deleteMediaFile() {
        // TODO implement here
    }

    /**
     * Add a like for a MediaFile
     */
    public void addLike() {
        // TODO implement here
    }

    /**
     * Delete a like for a MediaFile
     */
    public void deleteLike() {
        // TODO implement here
    }

    /**
     * Get the ID of the MediaFile
     * @return ID of the MediaFile
     */
    public int getIdMediaFile() {
        // TODO implement here
        return 0;
    }

    /**
     * Change the ID of a MediaFile
     * @param value new ID of the MediaFile
     */
    public void setIdMediaFile(int value) {
        // TODO implement here
    }

    /**
     * Get the name of the MediaFile
     * @return the MediaFile name
     */
    public String getNameMediaFile() {
        // TODO implement here
        return this.nameMediaFile;
    }

    /**
     * Set the name of the MediaFile
     * @param value new name of the MediaFile
     */
    public void setNameMediaFile(String value) {
        // TODO implement here
    }

    /**
     * Get the total number of like for a MediaFile
     * @return total number of like for a MediaFile
     */
    public int getNbLikesMediaFile() {
        // TODO implement here
        return 0;
    }

    /**
     * Change the number of like for a MediaFile (+1 or -1)
     * @param value new number of like for a MediaFile
     */
    public void setNbLikesMediaFile(int value) {
        // TODO implement here
    }

	public String getLien() {
		// TODO Auto-generated method stub
		return this.lienMF;
	}

	public int getIdTopic() {
		// TODO Auto-generated method stub
		return this.idTopic;
	}

}