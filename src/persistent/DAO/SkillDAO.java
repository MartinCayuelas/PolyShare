package persistent.DAO;


import java.sql.Connection;
import java.util.ArrayList;

import application.classesApp.Skill;

/**
 * @author ponthieu
 */
public abstract class SkillDAO {
	protected Connection connect = null;
    /**
     * Default constructor
     */
    public SkillDAO(Connection conn) {
    	this.connect = conn;
    }


    /**
     * Search a Skill with a Student Id
     * @param idStudent 
     * @return Skill
     */
    public abstract ArrayList<Skill> findSkillsByIdStudent(int idStudent);

    /**
     * Add a new Skill to a Student
     * @param idStudent 
     * @param skill 
     * 
     */
    public abstract void addSkillById(int idStudent, Skill skill);

    /**
     * Remove a Skill to the Student
     * @param idStudent 
     * @param skill 
     */
    public abstract void deleteSkillByIdSkill(int idStudent, Skill skill);
    

    /**
     * @param idStudent 
     * @param skill 
     * Update the skill in the Student Profil
     */
    public abstract void updateSkill(int idStudent, Skill skill);

}