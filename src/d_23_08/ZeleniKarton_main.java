package d_23_08;

import java.util.ArrayList;

public class ZeleniKarton_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		U glavnoj klasi:
//	        //kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
		
		ArrayList<ZeleniKarton> zeleniKartoni = new ArrayList<>();

		ZeleniKarton ispit1 = new ZeleniKarton("Milena Vuckovic", 1234, "Java osnove", "Milan Jovanovic", 7);

		zeleniKartoni.add(ispit1);

		ZeleniKarton ispit2 = new ZeleniKarton("Milica Petkovic", 5434, "Java", "Vladimir Minic", 8);

		zeleniKartoni.add(ispit2);

		ZeleniKarton ispit3 = new ZeleniKarton("Ana Anic", 1256, "Java 1", "Milan Milenkovic", 10);

		zeleniKartoni.add(ispit3);

		ZeleniKarton ispit4 = new ZeleniKarton("Jovan Jovanovic", 234, "Selenium", "Milan Jovanovic", 8);

		zeleniKartoni.add(ispit4);

		ZeleniKarton ispit5 = new ZeleniKarton("Petar Peric", 458, "Java 2", "Vladimir Minic", 9);

		zeleniKartoni.add(ispit5);

		ZeleniKarton ispit6 = new ZeleniKarton("Marko Jovanovic", 5888, "Java 4", "Petar Radic", 5);

		zeleniKartoni.add(ispit6);

		ZeleniKarton ispit7 = new ZeleniKarton("Marija Maric", 777, "Java 5", "Milan Mitrovic", 10);

		zeleniKartoni.add(ispit7);

		ZeleniKarton ispit8 = new ZeleniKarton("Stefan Nikolic", 4532, "Java 6", "Milan Jovanovic", 9);

		zeleniKartoni.add(ispit8);

		ZeleniKarton ispit9 = new ZeleniKarton("Nevena Nikolic", 532, "Java 7", "Jovan Jovanovic", 7);

		zeleniKartoni.add(ispit9);

		ZeleniKarton ispit10 = new ZeleniKarton("Strale Djokic", 7634, "Java 8", "Milan Jovanovic", 9);

		zeleniKartoni.add(ispit10);

		for (int i = 0; i < zeleniKartoni.size(); i++) {
			zeleniKartoni.get(i).stampa();
			System.out.println();

		}

		int suma = 0;

		for (int i = 0; i < zeleniKartoni.size(); i++) {
			suma = suma + zeleniKartoni.get(i).getOcena();

		}
		double prosecnaOcena = suma / zeleniKartoni.size();
		System.out.println("Prosecna ocena svih ispita je: " + prosecnaOcena);

		System.out.println();

		suma = 0;
		for (int i = 0; i < zeleniKartoni.size(); i++) {
			if (zeleniKartoni.get(i).prelaznaOcena() == true) {
				suma = suma + zeleniKartoni.get(i).getOcena();
			} else {
				suma = suma + 0;
			}
		}

		double prosekPrelaznihOcena = suma / zeleniKartoni.size();

		System.out.println("Prosek prelaznih ocena je: " + prosekPrelaznihOcena);

	}

}
