package d_15_08;

public class Zadatak_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri 
//		funkcije vraca novu vrednost koja se formira kao na primeru. METODA NISTA NE 
//		STAMPA.
//		ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//		ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

//		
		  String a = "2";
	        String b = "6";

 System.out.println("Novi broj sa ciframa a i b je: " + spojCifre(a, b));

	        
	}
	static String spojCifre(String a, String b) {
        String c = a + b;
        return c;
}}
