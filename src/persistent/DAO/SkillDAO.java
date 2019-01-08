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
     * @param idStudent 
     * @return
     */
    public Skill findById(int idStudent) {
        // TODO implement here
        return null;
    }

    /**
     * @param idStudent 
     * @param skill 
     * @return
     */
    public void addById(int idStudent, Skill skill) {
        // TODO implement here
    }

    /**
     * @return
     */
    public void deleteSkillByIdSkill() {
        // TODO implement here
    }

    /**
     * @param skill 
     * @return
     */
    public void updateSkill(Skill skill) {
        // TODO implement here
    }

}