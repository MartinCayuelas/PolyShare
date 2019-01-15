package facades;

import java.util.ArrayList;
import java.util.List;

import application.classesApp.Skill;
import application.classesApp.Student;
import factory.AbstractFactory;
import persistent.DAO.SkillDAO;
import persistent.DAO.StudentDAO;

/**
 * @author martinCayuelas
 */

public class SkillFacade {
	private AbstractFactory abstractFactory = AbstractFactory.getFactoryMySql();
	private SkillDAO skillDAO = abstractFactory.createSkillDAO();
	
	
    /**
     * Default constructor
     */
    public SkillFacade() {
    }

    /**
     * @param student Student 
     * @return student's skills
     */
    public ArrayList<Skill> getSkills(Student student) {
    	List<Skill> skills = new ArrayList<Skill>();
    	skills = skillDAO.findSkillsByIdStudent(student.getId());
        return (ArrayList<Skill>) skills;
    }

    /**
     * delete the skill in param for the connected user
     * @param skill 
     * 
     */
    public void deleteSkill(Skill skill) {
        skillDAO.deleteSkillByIdSkill(skill);
    }

    /**
     * add the skill in param for the connected user
     * @param skill 
     * 
     */
    public void addSkill(Skill skill) {
        skillDAO.addSkillById(skill.getIdStudent(), skill);
    }

    /**
     * @param student 
     * 
     */
    public void updateSkill(Skill skill) {
        skillDAO.updateSkill(skill.getIdStudent(), skill);
    }

}