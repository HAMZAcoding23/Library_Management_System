package Mediatheque;

public class Dictionnaire extends Document {
	private String langue;
	private int nbreDeTomes;
	
	public Dictionnaire(String isbn, String titreDoc, String[] auteur, String editeur, String annee_edition, String url, String langue,int nbreDeTomes) {
		super(isbn, titreDoc, auteur, editeur, annee_edition, url);
		this.langue = langue;
		this.nbreDeTomes = nbreDeTomes;
	}

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	public int getNbreDeTomes() {
		return nbreDeTomes;
	}

	public void setNbreDeTomes(int nbreDeTomes) {
		this.nbreDeTomes = nbreDeTomes;
	}

	@Override
	public String toString() {
		return "Dictionnaire [langue=" + langue + ", nbreDeTomes=" + nbreDeTomes + "]";
	}
	
	
}
