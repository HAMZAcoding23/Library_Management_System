package Mediatheque;

public class Magazine extends Document {
	private String periodicite;
	private String dateEdition;
	
	public Magazine(String isbn, String titreDoc, String[] auteur, String editeur, String annee_edition, String url, String periodicite, String dateEdition) {
		super(isbn, titreDoc, auteur, editeur, annee_edition, url);
		this.periodicite = periodicite;
		this.dateEdition = dateEdition;
	}

	public String getPeriodicite() {
		return periodicite;
	}

	public void setPeriodicite(String periodicite) {
		this.periodicite = periodicite;
	}

	public String getDateEdition() {
		return dateEdition;
	}

	public void setDateEdition(String dateEdition) {
		this.dateEdition = dateEdition;
	}

	@Override
	public String toString() {
		return "Magazine [periodicite=" + periodicite + ", dateEdition=" + dateEdition + "]";
	}
	
	

}
