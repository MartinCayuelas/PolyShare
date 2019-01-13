package application.classesApp;

import java.util.Set;

/**
 * <b>SchoolClass</b> is a class, with an administrator who is a student and other students
 */
public class SchoolClass {


	public int getIdSchoolClass() {
		return idSchoolClass;
	}

	public void setIdSchoolClass(int idSchoolClass) {
		this.idSchoolClass = idSchoolClass;
	}

	public Set<Subject> getListOfSubjects() {
		return listOfSubjects;
	}

	public void setListOfSubjects(Set<Subject> listOfSubjects) {
		this.listOfSubjects = listOfSubjects;
	}

	public SchoolClass(String nameSchoolClass) {
		this.nameSchoolClass = nameSchoolClass;
    }
    
    public SchoolClass(int id, String nameSchoolClass) {
		this.nameSchoolClass = nameSchoolClass;
		this.idSchoolClass = id;
    }

	/**
	  * 
	  */
	 private int idSchoolClass;
	    
	 /**
     * 
     */
    public String nameSchoolClass;

    /**
     * 
     */
    public Set<Subject> listOfSubjects;




    /**
     * Add a subject for a school class
     * @param sub subject added
     */
    public void addSubject(Subject sub) {
        // TODO implement here
    }

    /**
     * Delete a subject for a school class
     * @param sub subject deleted
     */
    public void deleteSubject(Subject sub) {
        // TODO implement here
    }

    /**
     * get all the subjects for a school class
     * @return list of subjects for a school class
     */
    public Set<Subject> getSubjects() {
        // TODO implement here
        return null;
    }

    /**
     * Get the name of a school class
     * @return name of the school class
     */
    public String getNameSchoolClass() {
        return nameSchoolClass;
    }

    /**
     * Change the name of a school class
     * @param value new name of the school class
     */
    public void setNameSchoolClass(String value) {
    	this.nameSchoolClass = value;
    }

}