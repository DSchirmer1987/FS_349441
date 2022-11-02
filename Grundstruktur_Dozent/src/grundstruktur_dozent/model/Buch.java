package grundstruktur_dozent.model;

public class Buch extends Artikel {
	private String isbn;
	
	public Buch(String bezeichnung, String artikelNummer, String isbn) {
		super(bezeichnung, artikelNummer);
		this.isbn = isbn;
	}
	
	public String getIsbn() {
		return this.isbn;
	}
	
	public String toString() {
		return super.toString() + " Buch: ISBN = " + this.isbn;
	}

}
