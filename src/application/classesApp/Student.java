package application.classesApp;

import java.util.Set;

import persistent.DAO.StudentDAO;

/**
 * 
 */
public class Student {

    /**
     * Default constructor
     */
    public Student() {
    }

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
    public int loginID;

    /**
     * 
     */
    public Set<Appointment> myAppointments;





    /**
     * @return
     */
    public Set<SchoolClass> getSchoolClasses() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Set<Skill> getSkills() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Set<SchoolClass> getManagedSchoolClasses() {
        // TODO implement here
        return null;
    }

    /**
     * @param s
     */
    public void addSkill(Skill s) {
        // TODO implement here
    }

    /**
     * @param s
     */
    public void deleteSkill(Skill s) {
        // TODO implement here
    }

    /**
     * @param s 
     * @param l
     */
    public void updateSkill(Skill s, int l) {
        // TODO implement here
    }

    /**
     * @param c
     */
    public void joinSchoolClass(SchoolClass c) {
        // TODO implement here
    }

    /**
     * @param c
     */
    public void addSchoolClass(SchoolClass c) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getNameStudent() {
        // TODO implement here
        return "";
    }

    /**
     * @param value
     */
    public void setNameStudent(String value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getFirstNameStudent() {
        // TODO implement here
        return "";
    }

    /**
     * @param value
     */
    public void setFirstNameStudent(String value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getEmailStudent() {
        // TODO implement here
        return "";
    }

    /**
     * @param value
     */
    public void setEmailStudent(String value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getPasswordStudent() {
        // TODO implement here
        return "";
    }

    /**
     * @param value
     */
    public void setPasswordStudent(String value) {
        // TODO implement here
    }

    /**
     * @param s
     */
    public void recommandStudent(Student s) {
        // TODO implement here
    }

    /**
     * @param s
     */
    public void signalStudent(Student s) {
        // TODO implement here
    }

    /**
     * @return
     */
    public int getNbRecommandations() {
        // TODO implement here
        return 0;
    }

    /**
     * @param email 
     * @return
     */
    public StudentDAO getStudentFromDb(String email) {
        // TODO implement here
        return null;
    }

}