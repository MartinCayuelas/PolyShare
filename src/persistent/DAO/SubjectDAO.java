package persistent.DAO;

import java.sql.Connection;
import java.util.ArrayList;

import application.classesApp.SchoolClass;
import application.classesApp.Skill;
import application.classesApp.Subject;
import application.classesApp.Topic;

/**
 * @author ponthieu, guillaud
 */
public abstract class SubjectDAO {

	protected Connection con = null;
    
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
    
    /**
     * Search Subjects with a SchoolClass Id
     * @param idSchoolClass 
     * @return list of subjects
     */
    public abstract ArrayList<Subject> findSubjectsByIdSchoolClass(int idSchoolClass);
    
    /**
     * Remove a Subject to the SchoolClass
     * @param idSubject the ID of the future deleted subject
     */
    public abstract void deleteSubject(int idSubject);
    

    /**
     * Update a Subject
     * @param idSubject the ID of the updated subject
     *  @param nameSubject the new name of the subject
     */
    public abstract void updateSubject(int idSubject, String nameSubject);
    
    /**
     * Find a Subject
     * @param idSubject 
     * @return subject found
     */
    public abstract Subject findSubjectById(int idSubject);
    
    /**
     * Add a new Subject
     * @param subject the new Subject add
     */
    public abstract void addSubject(Subject subject);

}