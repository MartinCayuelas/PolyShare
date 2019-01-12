package application.classesApp;

import java.util.*;

/**
 * <b>Skill</b> corresponds to level of comprehension of a topic
 */
public class Skill {
	private int idSkill;
    private String nameSkill;
    private int markSkill;
    private int idStudent;
    private int idClass;
	
    
    /**
     * Default constructor
     */
    public Skill(int idSkill, String nameS, int markS, int idStudent, int idClass) {
    	this.idSkill = idSkill;
    	this.nameSkill = nameS;
    	this.markSkill = markS;
    	this.idStudent = idStudent;
    	this.idClass = idClass;
    	
    }



    public int getIdSkill() {
		return idSkill;
	}



	public void setIdSkill(int idSkill) {
		this.idSkill = idSkill;
	}



	public int getIdStudent() {
		return idStudent;
	}



	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}



	public int getIdClass() {
		return idClass;
	}



	public void setIdClass(int idClass) {
		this.idClass = idClass;
	}



	/**
     * Get the name of a skill
     * @return name of the skill
     */
    public String getNameSkill() {
        // TODO implement here
        return this.nameSkill;
    }

    /**
     * Change the name of the skill
     * @param value new name of the skill
     */
    public void setNameSkill(String value) {
        // TODO implement here
    }

    /**
     * Get the mark, the level of comprehension of the skill, the topic
     * @return mark of the skill
     */
    public int getMarkSkill() {
        // TODO implement here
        return this.markSkill;
    }

    /**
     * Change the mark of a skill
     * @param value new mark for a skill
     */
    public void setMarkSkill(int value) {
        // TODO implement here
    }

    
    public String toString() {
    	String str ="";
    	str += "idSkill : " + this.getIdSkill() + "NomSkill : " +this.getNameSkill();
    	return str;
    	
    }
}