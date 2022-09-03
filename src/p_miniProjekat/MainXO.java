package p_miniProjekat;

import java.util.Scanner;

public class MainXO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ucitati podatke za igrace
		//
		// Kreirajte objekat klase XandOGame
		//
		// Startujte igru, tada je na potezu igrac X
		//
		// Saveti za dobar zadatak
		//

		Player playerX = new Player("Milena Vuckovic");
		Player playerO = new Player("JOvan Jovanovic");

		XandOGame igra1 = new XandOGame(playerX, playerO, "x", " ");

		igra1.printTable();
		igra1.startGame();

		Scanner s = new Scanner(System.in);

//Igra treba da traje dok (while petlja)
		//
		// nije kraj igre - imamo metodu za to
		//
		// Ili dok ne dobijemo pobednika
		//
		// U petlji
		//
		// Trazimo od aktuelnog igraca da unese potez
		//
		// Ukoliko je pozicija validna i ako je to slobodno mesto, igramo potez
		//
		// Prebacujemo red na drugog igraca
		//
		// Stampamo tablu
		//
		// Ukoliko nije validna pozicija ili nije slobodno mesto stampamo poruku "You
		// enter invalid position."
		//
		// Nakon zavrsetka igre, racunamo skor i stampamo rezultat igre i podatke za
		// igrace

		while (igra1.isGameOver() == false || (igra1.isWinnerX() == false || igra1.isWinnerO() == false))

		{
			System.out.println("Unesite poziciju od 0 do 8.");

			int pozicija = s.nextInt();
			if (igra1.isValidMove(pozicija) == true && igra1.isFieldFree(pozicija) == true) {
				igra1.makeAMove(pozicija);

				igra1.promeniIgraca();
				igra1.printTable();
			} else {
				System.out.println("You enter invalid position.");
			}
		}

		int rezultat = igra1.gameScore();

		if (rezultat == 0) {
			System.out.println("nema pobednika");
		} else if (rezultat == 1) {
			System.out.println("Pobednik je: ");
			playerX.print();
		} else if (rezultat == 2) {
			System.out.println("Pobednik je: ");
			playerO.print();
		}
	}
}
