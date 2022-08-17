package d_15_08;

import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//		Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
//		/ / / / /
//		Napomena: Metoda nista ne vraca.

		Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int n = s.nextInt();
        System.out.println("Unesite karakter:");
        String karakter = s.next();

        stampaKaraktera(n, karakter);
			
	}

	static void stampaKaraktera(int n, String karakter) {
        for (int i = 0; i < n; i++) {
            System.out.print(karakter + " ");
}}}
