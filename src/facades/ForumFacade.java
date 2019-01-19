package facades;

import java.util.ArrayList;

import application.classesApp.MediaFile;
import application.classesApp.Topic;
import factory.AbstractFactory;


/**
 * 
 */
public class ForumFacade {
	private AbstractFactory abstractFactory = AbstractFactory.getFactoryMySql();
	private persistent.DAO.MediaFileDAO MediaFileDAO = abstractFactory.createMediaFileDAO();

    /**
     * Default constructor
     */
    public ForumFacade() {
    }


    /**
     * @param text the body of the answer who is going to be created
 
     */
    public void addAnswer(String text) {
        // TODO implement here
    }

    /**
     * @param text the body of the question who is going to be created
     * 
     */
    public void addQuestion(String text) {
        // TODO implement here
    }

    /**
     * @param text the body of the answer who is going to be updated
     * @return
     */
    public void updateAnswer(String text) {
        // TODO implement here
    }

    /**
     * @return text the body of the question who is going to be updated
     */
    public void updateQuestion() {
        // TODO implement here
    }

    /**
     * @param close a topic ( when a question has a good answer )
     */
    public void closePost(Topic topic) {
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


	public ArrayList<MediaFile> getAllMd() {
		// TODO Auto-generated method stub
		return MediaFileDAO.getAllMd() ;
	}

}