package d_15_08;

public class Zadatak_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napisati metodu koja vrsi spajanje punog imena i vraca tu vrednost. Metoda od 
//		parametara prima ime i prezime (2 parametra) i vraca jedan string tako sto spoji
//		ime i prezime. METODA NISTA NE STAMPA.
//		Primer poziva: Ako se metoda pozvoe za ime=�Milan� i prezime=�Jovanovic�, metoda
//		vraca �Milan Jovanovic�
		
		String ime="Milena";
		String prezime="Vuckovic";

	}

	public static String ImePrezime(String ime, String prezime) {


		String punoIme = ime + "_" + prezime;
		return punoIme;

	}
}
