package d_16_08;

public class SmartAirConditioning {
//
	//Kreirati klasu SmartAirConditioning koja ima:
		//atribut za marku klime (npr: Samsung, Galanz, Gree, …)
		//atribut za izabranu temperaturu 
	///	atribut za mod (hladi/greje) - string
	//	metodu za stampu (proizvoljno)
	//	metodu koja vraca informaciju da li je napolju veca 
	//temperatura od one na koju je klima postavljena. Metoda 
	//kao parametar prima temperaturu koja je napolju.


	//	U glavnom programu kreirati minimum 2 objekta klase 
	//SmartAirConditioning i za svaki od njih pozvati metode
	
	String marka;

	 int izabranaTemperatura;
	 String mode;


	 public void stampa() {
	 System.out.println("Temperatura na koju je postavljena klima "
	 + this.marka + " marke je " + this.izabranaTemperatura);

	 }
	 
	 public boolean daLiJeTemperaturaNapoljuVeca (int spoljnaTemp)
	 {if (spoljnaTemp>this.izabranaTemperatura){boolean spoljnaVeca=true; return spoljnaVeca;}
	 else {boolean spoljnaVeca=false; return spoljnaVeca;}

	
	 }
	
}
