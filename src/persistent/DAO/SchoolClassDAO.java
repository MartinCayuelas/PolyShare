package persistent.DAO;

import application.classesApp.SchoolClass;
import application.classesApp.Student;
import application.classesApp.Subject;

/**
 * 
 */
public class SchoolClassDAO {

    /**
     * Default constructor
     */
    public SchoolClassDAO() {
    }



    /**
     * @param name 
     * Creates a new SchoolClass named with the param
     */
    public void createSchoolClass(String name) {
        // TODO implement here
    }

    /**
     * @param c
     * @param s 
     * Remove the student from the class corresponding to the Student
     */
    public void quitSchoolClass(SchoolClass c, Student s) {
        // TODO implement here
    }

    /**
     * @param c
     * @param s 
     * Add a Student to the corresponding SchoolClass
     */
    public void addStudent(SchoolClass c, Student s) {
        // TODO implement here
    }

    /**
     * @param s 
     *  Add a Subject to the corresponding SchoolClass
     */
    public void addSubject(Subject s) {
        // TODO implement here
    }

    /**
     * @param c
     * Close the SchoolClass and also remove all Students, Subjects, Topics, Questions and Answers
     */
    public void close(SchoolClass c) {
        // TODO implement here
    }

    /**
     * @param s 
     * @return SchoolClass
     *  Return a SchoolClass
     */
    public SchoolClass getSchoolClassByName(String s) {
        // TODO implement here
        return null;
    }

}