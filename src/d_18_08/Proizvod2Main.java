package d_18_08;

import d_16_08.Proizvod;

public class Proizvod2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double povecanjeCene=150;
		double popust=10;
		
		Proizvod2 kupine = new Proizvod2();

		kupine.nazivProizvoda = "Kupina";
		kupine.cenaProizvoda = 800;
		kupine.tezinaproizvoda_gr = 850.0;

		kupine.stampaj();
		kupine.povecajCenu(povecanjeCene);
		kupine.stampaj();
		kupine.vratiCenusaPopustom(popust);
		kupine.stampaj();
		kupine.postarina();

	


		Proizvod2 maline = new Proizvod2();

		maline.nazivProizvoda = "Malina";
		maline.cenaProizvoda = 1250.5;
		maline.tezinaproizvoda_gr = 1000.0;

		maline.stampaj();
		maline.povecajCenu(povecanjeCene);
		maline.stampaj();
		maline.vratiCenusaPopustom(popust);
		maline.stampaj();
		maline.postarina();
	
	

	}

}
