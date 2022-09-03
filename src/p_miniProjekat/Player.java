package p_miniProjekat;

public class Player {

//	 ime i prezime
	 //
//	     gettere i settere
	 //
//	             konstuktore
	 //
//	     metodu print, koja stampa ime i prezime igraca


	private String imeIPrezime;

	public Player() {
	}

	public Player(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public void print() {
		System.out.println("Ime i prezime igraca: " + this.imeIPrezime);
	}
}
