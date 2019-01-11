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
    	
    	
    }



    /**
     * Get the name of a skill
     * @return name of the skill
     */
    public String getNameSkill() {
        // TODO implement here
        return "";
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
        return 0;
    }

    /**
     * Change the mark of a skill
     * @param value new mark for a skill
     */
    public void setMarkSkill(int value) {
        // TODO implement here
    }

}