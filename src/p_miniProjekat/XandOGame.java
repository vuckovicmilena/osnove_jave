package p_miniProjekat;

import java.util.ArrayList;

public class XandOGame extends Player{
	
	//table - niz koji cuva stanje igre. Npr: table = x, x, 0, 0, x, 0, x, 0, x
    //

	private ArrayList<String> table = new ArrayList<>();

	// nextPlayer - atribut koji cuva informaciju ko igra sledeci. Moze da ima
	// vrednosti x ili o

	private String nextPlayer;

	// playerX - igrac X

	private Player playerX;

	// playerO - igrac O

	private Player playerO;

	// Difoltni konstuktor koji u niz dodaje 9 elemenata. Svaki element u nizu je “
	// “

	public XandOGame(String polje) {

		this.table = new ArrayList<>();
		for (int i = 0; i < 9; i++) {
			this.table.add(i, polje);

		}
	}

	// Kontuktor koji prima dva parametra, igraca x i igraca o i ovaj kontuktor radi
	// sve sto radi i difoltni samo sto
//    dodatno postavlja i igraca

	public XandOGame(Player playerX, Player playerO, String nextPlayer, String polje) {
		this.playerX = playerX;
		this.playerO = playerO;
		this.nextPlayer = nextPlayer;
		this.table = new ArrayList<>();
		for (int i = 0; i < 9; i++) {
			this.table.add(i, polje);
		}
	}

	public XandOGame() {
	}
//gettere i settere za igrace

	public Player getPlayerX() {
		return playerX;
	}

	public void setPlayerX(Player playerX) {
		this.playerX = playerX;
	}

	public Player getPlayerO() {
		return playerO;
	}

	public void setPlayerO(Player playerO) {
		this.playerO = playerO;
	}

//    Metodu print koja stampa tablu sliku kao na slici. Stampanje se vrsi petljom. Ako je niz iz primera iznad stampa izgleda:
//
//    x | x | 0 |
//
//    0 | x | 0 |
//
//    x | 0 | x |
	// ako su na mestu u nizu broj 2...5...8 onda ide stampa sa ln da predje u novi
	// red

	public void printTable() {
		for (int i = 0; i < table.size(); i++) {
			if (i == 2 || i == 5 || i == 8) {
				System.out.println(this.table.get(i) + "|");
			} else {
				System.out.print(this.table.get(i) + "|");
			}

		}
	}

	// Metodu startGame, metoda postavlja sve elemente niza na prazan string “ “ i
	// zatim postavlja da je na redu igrac X.

	public void startGame() {
		for (int i = 0; i < 9; i++) {
			this.table.set(i, " ");

			nextPlayer = "x";

		}
	}

	// Metodu isGameOver, igra je gotova ako su sva polja popunjena.

	public boolean isGameOver() {
		int brojac = 0;
		for (int i = 0; i < this.table.size(); i++) {

			if (this.table.get(i).equals("x") || this.table.get(i).equals("o")) {
				brojac++;
			}
		}

		if (brojac == 9) {
			return true;
		} else {
			return false;
		}
	}

//Metodu isFieldFree, koja vraca da li je trazeno polje slobodno.
// Metoda od parametara prima niz i poziciju za kojju se proverava.
// Polje je slobodno ako u njemu ne pise x ili o

	public boolean isFieldFree(int brojpolja) {
		if (this.table.get(brojpolja).equals(" ")) {
			return true;
		} else {
			return false;
		}
	}

//Metodu makeAMove, metoda prima poziciju gde moze da odigra potez.
//
//Ako je trenutno stanje u igri i sledeci na redu je igrac x
//
//x | x | 0 |
//
//0 |   |   |
//
//x |   |   |
//
//I pozove se metoda makeAMove za poziciju 5, novo stanje u igri je
//
//x | x | 0 |
//
//0 |   | x |
//
//x |   |   |

	public void makeAMove(int brojPolja) {
		if (this.table.get(brojPolja).equals(" ") && this.nextPlayer.equals("x")) {
			this.table.set(brojPolja, "x");
		} else if (this.table.get(brojPolja).equals(" ") && this.nextPlayer.equals("o")) {
			this.table.set(brojPolja, "o");
		}
	}

	// Metodu isWinnerX - metoda vraca rezultat igre za igraca X.
	// Pobednik je ukoliko prosledjeni igrac ima 3 vezana svoja znaka ili po koloni
	// ili po redu ili po dijgonalama

	public boolean isWinnerO() {
		if (this.table.get(0).equals("o") && this.table.get(1).equals("o") && this.table.get(2).equals("o")) {
			return true;
		}
		if (this.table.get(3).equals("o") && this.table.get(4).equals("o") && this.table.get(5).equals("o")) {
			return true;
		}
		if (this.table.get(6).equals("o") && this.table.get(7).equals("o") && this.table.get(8).equals("o")) {
			return true;
		}
		if (this.table.get(0).equals("o") && this.table.get(3).equals("o") && this.table.get(6).equals("o")) {
			return true;
		}
		if (this.table.get(1).equals("o") && this.table.get(4).equals("o") && this.table.get(7).equals("o")) {
			return true;
		}
		if (this.table.get(2).equals("o") && this.table.get(5).equals("o") && this.table.get(8).equals("o")) {
			return true;
		}
		if (this.table.get(0).equals("o") && this.table.get(4).equals("o") && this.table.get(8).equals("o")) {
			return true;
		}
		if (this.table.get(2).equals("o") && this.table.get(4).equals("o") && this.table.get(6).equals("o")) {
			return true;
		} else {
			return false;
		}

	}

	// Metodu isWinnerO - metoda vraca rezultat igre za igraca O.
	// Pobednik je ukoliko prosledjeni igrac ima 3 vezana svoja znaka ili po koloni
	// ili po redu ili po dijgonalama

	public boolean isWinnerX() {
		if (this.table.get(0).equals("x") && this.table.get(1).equals("x") && this.table.get(2).equals("x")) {
			return true;
		}
		if (this.table.get(3).equals("x") && this.table.get(4).equals("x") && this.table.get(5).equals("x")) {
			return true;
		}
		if (this.table.get(6).equals("x") && this.table.get(7).equals("x") && this.table.get(8).equals("x")) {
			return true;
		}
		if (this.table.get(0).equals("x") && this.table.get(3).equals("x") && this.table.get(6).equals("x")) {
			return true;
		}
		if (this.table.get(1).equals("x") && this.table.get(4).equals("x") && this.table.get(7).equals("x")) {
			return true;
		}
		if (this.table.get(2).equals("x") && this.table.get(5).equals("x") && this.table.get(8).equals("x")) {
			return true;
		}
		if (this.table.get(0).equals("x") && this.table.get(4).equals("x") && this.table.get(8).equals("x")) {
			return true;
		}
		if (this.table.get(2).equals("x") && this.table.get(4).equals("x") && this.table.get(6).equals("x")) {
			return true;
		} else {
			return false;
		}

	}

	// Metodu isValidMove koja vraca informaciju da li je pozicija
	// na koju igrac zeli da odigra potez validna. Pozicija je validna ako je u
	// opsegu od 0 do 8

	public boolean isValidMove(int brojPolja) {
		if (brojPolja >= 0 && brojPolja <= 8) {
			return true;
		} else {
			return false;
		}
	}

	// Metodu gameScore, metoda vraca informaciju za kraj igre.

	// Ukoliko je pobednik igrac x, metoda vraca 1

	// Ukoliko je pobednik igrac o, metoda vraca 2

	// Ukoliko nemam pobednika vracamo 0

	public int gameScore() {

		if (isWinnerO() == true) {
			return 2;
		} else if (isWinnerX() == true) {
			return 1;
		} else {
			return 0;
		}

	}

	public void promeniIgraca() {
		if (this.nextPlayer.equals("x")) {
			this.nextPlayer = "o";
		} else if (this.nextPlayer.equals("o")) {
			this.nextPlayer = "x";
		}
	}

}
