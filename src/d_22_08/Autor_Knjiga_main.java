package d_22_08;

public class Autor_Knjiga_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		U glavnom programu napraviti vise autora sa vise knjiga.
		
		Autor autor1 = new Autor("Milena" , "Vuckovic");
		Autor autor2 = new Autor("Milan", "Milenkovic");
		
		Knjiga putovanja = new Knjiga("4321", "Putovanja", 2010, autor1);
		Knjiga nebo = new Knjiga("9876", "Nebo", 2015, autor1);
		
		Knjiga automobili = new Knjiga ("6547", "Automobili", 2001, autor2);
		Knjiga san = new Knjiga ("7765", "San", 2012, autor2);
		
		autor1.print();
		putovanja.stampa();
		
		autor2.print();
		automobili.stampa();
		
	}

}
