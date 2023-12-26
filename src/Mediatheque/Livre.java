package Mediatheque;

public class Livre extends Document {
	private int nbrePages;
	private String type;
	private String tome;
	
	public Livre(String isbn, String titreDoc, String[] auteur, String editeur, String annee_edition, String url, int nbrePages, String type, String tome) {
		super(isbn, titreDoc, auteur, editeur, annee_edition, url);
		this.nbrePages = nbrePages;
		this.type = type;
		this.tome = tome;
	}

	public int getNbrePages() {
		return nbrePages;
	}

	public void setNbrePages(int nbrePages) {
		this.nbrePages = nbrePages;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTome() {
		return tome;
	}

	public void setTome(String tome) {
		this.tome = tome;
	}

	@Override
	public String toString() {
		return "Livre [nbrePages=" + nbrePages + ", type=" + type + ", tome=" + tome + "]";
	}
	
	

}