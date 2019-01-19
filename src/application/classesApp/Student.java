package application.classesApp;

import java.util.Set;

/**
 * @author lucadebeir
 */

/**
 * <b>Student</b> is a user who is register
 */
public class Student {

	/**
     * Default constructor
     */
	public Student (int id, String name) {
		this.idStudent = id;
		this.nameStudent= name;
	}
	
	public Student (int id) {
		this.idStudent = id;
	}
	
	public Student(int id, String nameStudent, String firstNameStudent, String emailStudent, String passwordStudent,
			String loginID) {
		this.idStudent = id;
		this.nameStudent = nameStudent;
		this.firstNameStudent = firstNameStudent;
		this.emailStudent = emailStudent;
		this.passwordStudent = passwordStudent;
		this.loginID = loginID;
		
	}
	
	/**
     * 
     */
	private int idStudent;

    /**
     * 
     */
    public String nameStudent;

    /**
     * 
     */
    public String firstNameStudent;

    /**
     * 
     */
    public String emailStudent;

    /**
     * 
     */
    public String passwordStudent;

    /**
     * 
     */
    public int nbRecommandations;

    /**
     * 
     */
    public String loginID;

    /**
     * 
     */
    public Set<Appointment> myAppointments;
    
    /**
     * 
     */
    public Set<SchoolClass> listClass;
    
    /**
     * 
     */
    public Set<SchoolClass> listClassManaged;
    
    /**
     * 
     */
    public Set<Skill> listSkill;


    public String getLoginID() {
		return loginID;
	}

	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}

	/**
     * Get all the school classes of a student
     * @return list of school classes for a student
     */
    public Set<SchoolClass> getSchoolClasses() {
        // TODO implement here
        return null;
    }

    /**
     * Get all the skills for a student
     * @return list of the skills for a student
     */
    public Set<Skill> getSkills() {
        // TODO implement here
        return null;
    }

    /**
     * Get all the school classes of a student when the student is administrator of classes
     * @return list of the managed school classes
     */
    public Set<SchoolClass> getManagedSchoolClasses() {
        // TODO implement here
        return listClassManaged;
    }

    /**
     * Add a skill for a student
     * @param s skill added
     */
    public void addSkill(Skill s) {
        // TODO implement here
    }

    /**
     * Delete a skill for a student
     * @param s skill deleted
     */
    public void deleteSkill(Skill s) {
        // TODO implement here
    }

    /**
     * Update a skill for a student
     * @param s  skill updated
     * @param l new mark for the skill
     */
    public void updateSkill(Skill s, int l) {
        // TODO implement here
    }

    /**
     * Demand for join a school
     * @param c school class to join
     */
    public void joinSchoolClass(SchoolClass c) {
        // TODO implement here
    }

    /**
     * Add a school class
     * @param c school class added
     */
    public void addSchoolClass(SchoolClass c) {
        // TODO implement here
    }
    
    /**
     * Get the name of the student
     * @return name of the student
     */
    public int getId() {
        // TODO implement here
        return idStudent;
    }

    /**
     * Change the name of the student
     * @param value new name of the student
     */
    public void setId(int value) {
        // TODO implement here
    	this.idStudent = value;
    }
    
    /**
     * Get the name of the student
     * @return name of the student
     */
    public String getNameStudent() {
        // TODO implement here
        return nameStudent;
    }

    /**
     * Change the name of the student
     * @param value new name of the student
     */
    public void setNameStudent(String value) {
        // TODO implement here
    	this.nameStudent = value;
    }

    /**
     * Get the first name of the student
     * @return first name of the student
     */
    public String getFirstNameStudent() {
        // TODO implement here
    	return firstNameStudent;
    }

    /**
     * Change the first name of the student
     * @param value new first name of the student
     */
    public void setFirstNameStudent(String value) {
        // TODO implement here
    	this.firstNameStudent = value;
    }

    /**
     * Get the email address of the student
     * @return email address of the student
     */
    public String getEmailStudent() {
        // TODO implement here
    	return emailStudent;
    }

    /**
     * Change the email address of the student
     * @param value new email address of the student
     */
    public void setEmailStudent(String value) {
        // TODO implement here
    	this.emailStudent = value;
    }

    /**
     * get the password of the student
     * @return password of the student
     */
    public String getPasswordStudent() {
        // TODO implement here
        return passwordStudent;
    }

    /**
     * change the password of the student
     * @param value new password of the student
     */
    public void setPasswordStudent(String value) {
        // TODO implement here
    	this.passwordStudent = value;
    }

    /**
     * Recommend a student
     * @param s student recommended
     */
    public void recommendStudent(Student s) {
        // TODO implement here
    }

    /**
     * signal a student
     * @param s student signaled
     */
    public void signalStudent(Student s) {
        // TODO implement here
    }

    /**
     * Get the total number of recommendations for a student
     * @return
     */
    public int getNbRecommendations() {
        // TODO implement here
        return 0;
    }


}