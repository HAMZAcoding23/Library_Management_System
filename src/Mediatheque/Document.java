package Mediatheque;

import java.util.Arrays;

public abstract class Document {
	private String isbn;
	private String titreDoc;
	private String[] auteur = new String[5];
	private String editeur;
	private String annee_edition;
	private String url;
	
	

	public Document(String isbn, String titreDoc, String[] auteur, String editeur, String annee_edition, String url) {
		this.isbn = isbn;
		this.titreDoc = titreDoc;
		this.auteur = auteur;
		this.editeur = editeur;
		this.annee_edition = annee_edition;
		this.url = url;
	}

	

	public String getIsbn() {
		return isbn;
	}



	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}



	public String getTitreDoc() {
		return titreDoc;
	}



	public void setTitreDoc(String titreDoc) {
		this.titreDoc = titreDoc;
	}



	public String[] getAuteur() {
		return auteur;
	}



	public void setAuteur(String[] auteur) {
		this.auteur = auteur;
	}



	public String getEditeur() {
		return editeur;
	}



	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}



	public String getAnnee_edition() {
		return annee_edition;
	}



	public void setAnnee_edition(String annee_edition) {
		this.annee_edition = annee_edition;
	}



	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}



	@Override
	public String toString() {
		return "Document [isbn=" + isbn + ", titreDoc=" + titreDoc + ", auteur=" + Arrays.toString(auteur)
				+ ", editeur=" + editeur + ", annee_edition=" + annee_edition + ", url=" + url + "]";
	}
	
	
}

















