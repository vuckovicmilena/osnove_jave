package d_23_08;

public class RacunaTransakcija_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	u glavnom kreirati objekte i testirati funkcionalnosti 	

		Racun racun1 = new Racun("333-456456-123", "Milan Petrovic", 20000.0);

		Racun racun2 = new Racun("123-456-789", "Ana Stanic", 245.5);

		Racun racun3 = new Racun("987-555-123", "Djordje Bojic", 48500.0);

		Transakcija transakcija1 = new Transakcija("555555", racun1, racun2);

		Transakcija transakcija2 = new Transakcija("333333", racun2, racun3);

		Transakcija transakcija3 = new Transakcija("888888", racun3, racun2);

		double iznosTransakcije1 = 2500;
		double iznosTransakcije2 = 1000;
		double iznosTransakcije3 = 24000;

		racun1.stampa();
		racun2.stampa();
		racun3.stampa();

		transakcija1.izvrsiTransakciju(iznosTransakcije1);

		transakcija1.stampaTransakcije(transakcija1);

		racun1.stampa();
		racun2.stampa();

		transakcija2.izvrsiTransakciju(iznosTransakcije2);

		transakcija2.stampaTransakcije(transakcija2);

		racun2.stampa();
		racun3.stampa();
	}
}
