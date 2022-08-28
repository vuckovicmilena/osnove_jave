package d_26_08;

public class Igrac extends Osoba{
	
//	Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//		broj (broj koji igrac nosi)
//		poziciju koju igra (odbrambeni, napadac, … )
//		kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere za broj, kapiten i poziciju
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu

	  private int brojIgraca;
	    private String pozicija;
	    private boolean daLiJeKapiten;
	    
	    public Igrac(String imeIPrezime, String jMBG, int godinaRodjenja) {
	        super(imeIPrezime, jMBG, godinaRodjenja);
	    }

	    public Igrac(String imeIPrezime, String jMBG, int godinaRodjenja, int brojIgraca, String pozicija,
	                 boolean daLiJeKapiten) {
	        super(imeIPrezime, jMBG, godinaRodjenja);
	        this.brojIgraca = brojIgraca;
	        this.pozicija = pozicija;
	        this.daLiJeKapiten = daLiJeKapiten;
	    }

	    public int getBrojIgraca() {
	        return brojIgraca;
	    }

	    public void setBrojIgraca(int brojIgraca) {
	        this.brojIgraca = brojIgraca;
	    }

	    public String getPozicija() {
	        return pozicija;
	    }

	    public void setPozicija(String pozicija) {
	        this.pozicija = pozicija;
	    }

	    public boolean isDaLiJeKapiten() {
	        return daLiJeKapiten;
	    }

	    public void setDaLiJeKapiten(boolean daLiJeKapiten) {
	        this.daLiJeKapiten = daLiJeKapiten;
	    }
	    
	    @Override
	    public void stampaj() {
	        super.stampaj();
	        System.out.println("Broj igraca: " + this.brojIgraca);
	        System.out.println("Da li je igrac kapiten: " + this.daLiJeKapiten);
	        System.out.println("Igra na poziciji: " + this.pozicija);
	    }
	}   
	
	
	
	
	

