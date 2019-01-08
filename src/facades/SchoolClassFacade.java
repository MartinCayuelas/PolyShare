package facades;

import application.classesApp.SchoolClass;
import application.classesApp.Subject;

/**
 * 
 */
public class SchoolClassFacade {

    /**
     * Default constructor
     */
    public SchoolClassFacade() {
    }


    /**
     * @param className 
     * Create a new SchoolClass and save it
     * 
     */
    public void CreateSchoolClass(String className) {
        // TODO implement here
    }

    /**
     * @param subjectName 
     * Create a new subject and save it
     */
    public void CreateSubject(String subjectName) {
        // TODO implement here
    }

    /**
     * @param topicName
     * @param subject
     * Create a topic linked to a subject and save it
     */
    public void CreateTopic(String topicName, Subject subject) {
        // TODO implement here
    }

    /**
     * @param s the name of the researched schoolClass
     * @return SchollClass return the matched schoolClass 
     */
    public SchoolClass findSchoolClass(String s) {
        // TODO implement here
        return null;
    }

    /**
     * @param SchoolClass
     * Make a demand to the admin of the class. The admin can accept the demand.
     * 
     */
    public void joinSchoolClass(SchoolClass schoolClass) {
        // TODO implement here
    }

}