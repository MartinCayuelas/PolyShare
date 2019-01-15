package ui.skill;

import application.classesApp.Skill;
/**
 * @author martinCayuelas
 */

public class SkillCell {
	private Skill skill;
	private String nomClasse;

	
	
	
	public SkillCell(Skill s, String nomClasse) {
		super();
		this.skill = s;
		this.nomClasse = nomClasse;
		
	}
	public String getNomSkill() {
		return skill.getNameSkill();
	}
	public void setNomSkill(String nomSkill) {
		this.skill.setNameSkill(nomSkill);
	}
	public String getNomClasse() {
		return nomClasse;
	}
	public void setNomClasse(String nomClasse) {
		this.nomClasse = nomClasse;
	}
	public int getMarkSkill() {
		return skill.getMarkSkill();
	}
	public void setMarkSkill(int markSkill) {
		skill.setMarkSkill(markSkill);
		
	}
	public int getIdSkill() {
		return this.skill.getIdSkill();
	}
	public Skill getSkill() {
		return skill;
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	
	
	

}
