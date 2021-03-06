package persistent.DAO;


import java.sql.Connection;
import java.util.ArrayList;

import application.classesApp.MediaFile;

/**
 * @author julienroumagnac
 * 
 */
public abstract class MediaFileDAO {

    protected Connection con;
    
    public MediaFileDAO(Connection con) {
    	this.con = con;
    }


    /**
     * @param d 
     * @return
     */
    public abstract void createMediaFile(MediaFile d);

    /**
     * @param s 
     * @return
     */
    public abstract MediaFile findByName(String s);

    /**
     * @param idMedia 
     * @return
     */
    public abstract void deleteMediaFileById(int idMedia);

    /**
     * @param d 
     * @return
     */
    public abstract void update(MediaFile d);

    /**
     * @param m 
     * @return
     */
    public abstract void like(MediaFile m);

    /**
     * @param m 
     * @return
     */
    public abstract void unlike(MediaFile m);


    public abstract ArrayList<MediaFile> getAllMd();


	public abstract ArrayList<MediaFile> getAllMdByTopic(int idtopic);

}