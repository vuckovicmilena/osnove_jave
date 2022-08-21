package d_16_08;

public class SmartAirConditioningMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartAirConditioning gorenje = new SmartAirConditioning();

	    int spoljnaTemp=22;

	    gorenje.marka="Gorenje";
	    gorenje.izabranaTemperatura= 21;
	    gorenje.mode="hladjenje";


	    gorenje.stampa();
	    System.out.println("Da li je spolja temp veca:" + gorenje.daLiJeTemperaturaNapoljuVeca(spoljnaTemp));

	    SmartAirConditioning galanz = new SmartAirConditioning();

	    galanz.marka= "Galanz";
	    galanz.izabranaTemperatura=28;
	    galanz.mode="grejanje";

	    galanz.stampa();
	    System.out.println("Da li je spolja temp veca:" + galanz.daLiJeTemperaturaNapoljuVeca(spoljnaTemp));
	}
}
