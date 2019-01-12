package persistent.DAO;

import java.sql.Connection;

import application.classesApp.SchoolClass;
import application.classesApp.Subject;
import application.classesApp.Topic;

/**
 * @author ponthieu
 */
public abstract class SubjectDAO {

	private Connection con = null;
    
	public SubjectDAO(Connection con) {
		this.con = con;
    }



    /**
     * Creates a new subject with a name in a SchoolClass
     * @param namesubject 
     * @param classsub
     */
    public abstract void createSubject(String namesubject, SchoolClass classsub);

    /**
     * Add a new Topic to a Subject
     * @param s
     * @param t 
     * @return
     */
    public abstract void addTopic(Subject s, Topic t);

    /**
     * Close a subject
     * @param s
     *
     */
    public abstract void close(Subject s);

}