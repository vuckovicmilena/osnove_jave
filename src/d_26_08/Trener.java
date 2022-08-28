package d_26_08;

public class Trener extends Osoba {
//	Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//		godine iskustva
//		tip trenera (kondicioni, za igru, pomocni, personalni)
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.

	 private int godineIskustva;
	    private String tipTrenera;

	    public Trener(int godineIskustva, String tipTrenera) {
	        this.godineIskustva = godineIskustva;
	        this.tipTrenera = tipTrenera;
	    }

	    public Trener(String imeIPrezime, String jMBG, int godinaRodjenja, int godineIskustva, String tipTrenera) {
	        super(imeIPrezime, jMBG, godinaRodjenja);
	        this.godineIskustva = godineIskustva;
	        this.tipTrenera = tipTrenera;
	    }
	    
	    
	    @Override
	    public void stampaj ()
	    {super.stampaj();
	        System.out.println("Godine iskustva: " + this.godineIskustva);
	        System.out.println("Tip trenera: " + this.tipTrenera);

	    }
	} 
	
	
	
	

