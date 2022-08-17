package d_15_08;

public class Zadatak_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Zadatak
//		Napisati metodu koja stampa podatke o korisniku u formatu:
//		JMBG: [jmbg]
//		Ime: [ime]
//		Prezime: [prezime]
//		God. rodjenja: [god]
//		Aktivan: [true/false]
//		Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre 
//		metode.Metoda nista ne vraca.

		String jMBG = "2905993757519";
		String ime = "Milena";
		String prezime = "Vuckovic";
		String godiste = "1993";
		boolean aktivan = true;
		
		 podaciOKorisniku(jMBG, ime, prezime, godiste, aktivan);

	}

	static void podaciOKorisniku(String jMBG, String ime, String prezime, String godiste, boolean aktivan) {
		System.out.println("JMBG: " + jMBG);
		System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("Godina rodjenja: " + godiste);
        System.out.println("Aktivan: " + aktivan);
}}
