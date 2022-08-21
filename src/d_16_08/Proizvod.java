package d_16_08;

public class Proizvod {
	//Napisati klasu Proizvod koja ima atribute
	//
	// naziv proizvoda (String)
	//
	// cenu proizvoda (double)
	//
	// težinu proizvoda u gramima. (double)
	//
	// i metode:
	//
	// stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
	//
	// konvertuj - metoda konvertuje tezinu u kilograme i tone. Metoda kao parametar prima
	// jedinicu u koju zelimo da konvertujemo, a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
	//
	// Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
	//
	// Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012

	String nazivProizvoda;
	 double cenaProizvoda;
	 double tezinaproizvoda_gr;


	 public void stampaj(){
	 System.out.print(this.nazivProizvoda + ", " + this.cenaProizvoda + ", " );
	 System.out.println(this.tezinaproizvoda_gr);
	 }

	 public double konvertuj (String jedinica)
	 {
	 if (jedinica.equals("kg"))
	 {double tezinaKg = this.tezinaproizvoda_gr/1000;
	 return tezinaKg;}
	 else {double tezinaT= this.tezinaproizvoda_gr/1000000;
	 return tezinaT;}


	 }

}
