package persistent.DAO;


import java.sql.Connection;
import java.util.ArrayList;

import application.classesApp.MediaFile;

/**
 * @author julien
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
     * @param d 
     * @return
     */
    public abstract void delete(MediaFile d);

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

}