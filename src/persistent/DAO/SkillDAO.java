package persistent.DAO;


import application.classesApp.Skill;

/**
 * AO
 */
public abstract class SkillDAO {

    /**
     * Default constructor
     */
    public SkillDAO() {
    }


    /**
     * Search a Skill with a Student Id
     * @param idStudent 
     * @return Skill
     */
    public Skill findById(int idStudent) {
        // TODO implement here
        return null;
    }

    /**
     * Add a new Skill to a Student
     * @param idStudent 
     * @param skill 
     * 
     */
    public void addSkillById(int idStudent, Skill skill) {
        // TODO implement here
    }

    /**
     * Remove a Skill to the Student
     * @param idStudent 
     * @param skill 
     */
    public void deleteSkillByIdSkill(int idStudent, Skill skill) {
        // TODO implement here
    }

    /**
     * @param idStudent 
     * @param skill 
     * Update the skill in the Student Profil
     */
    public void updateSkill(int idStudent, Skill skill) {
        // TODO implement here
    }

}