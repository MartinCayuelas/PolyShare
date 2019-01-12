package persistent.mySQL;


import java.sql.Connection;

import application.classesApp.MediaFile;
import persistent.DAO.MediaFileDAO;

/**
 * 
 */
public class MediaFileDAOMySQL extends MediaFileDAO {

   
    public MediaFileDAOMySQL(Connection con) {
    	super(con);
    }

	@Override
	public void createMediaFile(MediaFile d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MediaFile findByName(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(MediaFile d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(MediaFile d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void like(MediaFile m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unlike(MediaFile m) {
		// TODO Auto-generated method stub
		
	}

}