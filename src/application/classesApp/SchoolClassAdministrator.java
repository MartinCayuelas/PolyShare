package application.classesApp;

import java.util.*;

/**
 * <b>School Class Administrator</b> is a student who is administrator of a class
 */
public class SchoolClassAdministrator extends Role {

    /**
     * Default constructor
     */
    public SchoolClassAdministrator() {
    }

    /**
     * 
     */
    public Set<SchoolClass> mySchoolClasses;

    /**
     * Delete a school class
     * @param c school class deleted
     */
    public void deleteSchoolClass(SchoolClass c) {
        // TODO implement here
    }

    /**
     * Accept a student to join the school class
     * @param s student accept in the scool class
     */
    public void acceptStudent(Student s) {
        // TODO implement here
    }

    /**
     * Delete a student from a school class
     * @param s student deleted from the school class
     */
    public void deleteStudent(Student s) {
        // TODO implement here
    }

}