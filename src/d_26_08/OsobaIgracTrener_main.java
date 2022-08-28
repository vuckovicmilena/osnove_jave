package d_26_08;

public class OsobaIgracTrener_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.

		Igrac igrac1 = new Igrac("Milos Milosevic", "1105089",
                1993, 7, "napadac", true);

        Igrac igrac2 = new Igrac("Marko Petrovic", "1234567",
                2000, 12, "odbrambeni", false);

        Trener trener1 = new Trener("Nikola Milic","7654321",
                1975, 9, "glavni");

        Trener trener2 = new Trener("Vojin Djuric", "2602984", 1984,
                8,"kondicioni");

        trener2.stampaj();
        igrac1.stampaj();

		
		
	}

}
