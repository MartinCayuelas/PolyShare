package ui.skill;

public class SkillCell {
	private int idSkill;
	private String nomSkill;
	private String nomClasse;
	private int markSkill;
	
	
	
	public SkillCell(int idSkill, String nomSkill, String nomClasse, int markSkill) {
		super();
		this.idSkill = idSkill;
		this.nomSkill = nomSkill;
		this.nomClasse = nomClasse;
		this.markSkill = markSkill;
	}
	public String getNomSkill() {
		return nomSkill;
	}
	public void setNomSkill(String nomSkill) {
		this.nomSkill = nomSkill;
	}
	public String getNomClasse() {
		return nomClasse;
	}
	public void setNomClasse(String nomClasse) {
		this.nomClasse = nomClasse;
	}
	public int getMarkSkill() {
		return markSkill;
	}
	public void setMarkSkill(int markSkill) {
		this.markSkill = markSkill;
	}
	public int getIdSkill() {
		return idSkill;
	}
	public void setIdSkill(int idSkill) {
		this.idSkill = idSkill;
	}
	
	

}
