package d_16_08;

public class ProizvodMain {

	public static void main(String[] args) {
		
	
		
		Proizvod kupine = new Proizvod();

			kupine.nazivProizvoda = "Kupina";
			kupine.cenaProizvoda = 800;
			kupine.tezinaproizvoda_gr = 850.0;

			kupine.stampaj();

			String jedinicaYaKonverziju="kg";
			double x= kupine.konvertuj(jedinicaYaKonverziju);

			System.out.println(x+jedinicaYaKonverziju);


			Proizvod maline = new Proizvod();

			maline.nazivProizvoda = "Malina";
			maline.cenaProizvoda = 1250.5;
			maline.tezinaproizvoda_gr = 1000.0;

			maline.stampaj();

			jedinicaYaKonverziju="t";
			x= maline.konvertuj("t");
			System.out.println(x+jedinicaYaKonverziju);
		}

	}


