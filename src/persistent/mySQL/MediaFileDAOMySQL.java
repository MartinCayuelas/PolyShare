package persistent.mySQL;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import application.classesApp.Appointment;
import application.classesApp.MediaFile;
import application.classesApp.MyDate;
import application.classesApp.SchoolClass;
import application.classesApp.Student;
import application.classesApp.Subject;
import persistent.DAO.MediaFileDAO;

/**
 * @author julien
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
	public ArrayList<MediaFile> getAllMd(){
		ArrayList<MediaFile> listMediaFile = new ArrayList<MediaFile>();
		MediaFile md = null;
		try {
			ResultSet result = this.con.createStatement().executeQuery("SELECT * FROM MediaFiles; ");
			
			while(result.next()){ 
				
				
				md = new MediaFile(result.getString("nameMediaFile"));
				listMediaFile.add(md); 
				
			}
			
			// on recupere tous les appt il est prof d'une single session 			
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return listMediaFile;
		
	}

}