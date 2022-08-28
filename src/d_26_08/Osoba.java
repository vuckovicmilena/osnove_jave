package d_26_08;

public class Osoba {
//	Kreirati klasu Osoba koja ima:
//		ime i prezime
//		jmbg
//		godinu rodjenja
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere 
//		metodu stampaj koja stampa u formatu:
//		(ime i prezime), (jmbg), (godina rodjenja)

	  protected String imeIPrezime;
	    protected String jMBG;
	    protected int godinaRodjenja;

	    public Osoba() {
	    }

	    public Osoba(String imeIPrezime, String jMBG, int godinaRodjenja) {
	        this.imeIPrezime = imeIPrezime;
	        this.jMBG = jMBG;
	        this.godinaRodjenja = godinaRodjenja;
	    }

	    public String getImeIPrezime() {
	        return imeIPrezime;
	    }

	    public void setImeIPrezime(String imeIPrezime) {
	        this.imeIPrezime = imeIPrezime;
	    }

	    public String getjMBG() {
	        return jMBG;
	    }

	    public void setjMBG(String jMBG) {
	        this.jMBG = jMBG;
	    }
	    
	    
	    public void stampaj ()
	    {
	        System.out.println("Ime i prezime: " + this.imeIPrezime + ", JMBG: " + this.jMBG +
	                ", godina rodjenja " + this.godinaRodjenja);
	    }

	}
	
	


