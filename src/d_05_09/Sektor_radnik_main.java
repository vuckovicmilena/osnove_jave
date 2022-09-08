package d_05_09;

import java.util.ArrayList;

public class Sektor_radnik_main {

	public static void main(String[] args) {
		//U glavnom programu kreirati jednog magacionera i
        // jednog menadzera, postaviti sektore u kojima rade i ispisati platu za svakog

    Sektor plocice = new Sektor("Plocice", 70000);
    Sektor kozmetika = new Sektor("Kozmetika", 45000);
    Sektor garderoba = new Sektor("Garderoba", 45000);

    Radnik r1 = new Menadzer();
    r1.imeIPrezime= "Milan Jovanovic";
    r1.zaposliUSektor(kozmetika);
    r1.zaposliUSektor(plocice);


    Radnik r2 = new Magacioner();
    r2.imeIPrezime = "Milena Vuckovic";
    r2.zaposliUSektor(garderoba);
    r2.zaposliUSektor(plocice);


    ArrayList<Radnik> nizRadnika=new ArrayList<>();
    nizRadnika.add(r1);
    nizRadnika.add(r2);

        for (int i = 0; i < nizRadnika.size(); i++) {
            System.out.println("Prosecna plata radnika:"+ nizRadnika.get(i).imeIPrezime
                    + " je " + nizRadnika.get(i).plataRadnika());

        }

    }
}
		