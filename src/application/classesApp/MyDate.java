package application.classesApp;
/*
 *  @author julienroumagnac
 *  
 * */
public class MyDate {
	
	private String jour;
	private String mois;
	private String année;
	
	// this class is date class to help us work with sql the sql date format is "AAAA-MM-JJ" so we keep year month and day .
	public MyDate(String jour, String mois, String année) {
		super();
		this.jour = jour;
		this.mois = mois;
		this.année = année;
	}
	public MyDate ( String date) {
		this.année= date.substring(0, 4);
		this.mois= date.substring(5, 7);
		this.jour= date.substring(8,10);
	}
	
	// this function return the date of this object date in the sql format needed to create a date in SQL
	public String getSQLDate() {
		String res;
		res = this.getAnnée().concat("-").concat(this.getMois()).concat("-").concat(this.getJour());
		
		return res ;
	}
	// return the date with a format used for the scene like 2019/06/15
	public String getShowingDate() {
		String res;
		res = this.getAnnée().concat("/").concat(this.getMois()).concat("/").concat(this.getJour());
		
		return res ;
	}
	
	public String getJour() {
		return jour;
	}
	
	public void setJour(String jour) {
		this.jour = jour;
	}
	public String getMois() {
		return mois;
	}
	public void setMois(String mois) {
		this.mois = mois;
	}
	public String getAnnée() {
		return année;
	}
	public void setAnnée(String année) {
		this.année = année;
	}
	
	

}
