package d_15_08;

public class Zadatak_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za
//		10 veca.Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

		int x = 20;
		System.out.println("Broj za 10 veci od broja x je: " + stampajVrednostZa10Vecu(x));
	}

	static int stampajVrednostZa10Vecu(int a) {
		a = a + 10;
		return a;
	}

}


