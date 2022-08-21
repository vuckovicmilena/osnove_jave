package d_19_08;

public class FacebookPost2 {
	
//	.Kreirati klasu FacebookPost koja ima:
//		   Od atributa:
//		ime i prezime korisnika koji je objavio post
//		ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//		tekst objave
//		broj lajkova
//		broj deljenja
	
	private String imeIPrezimeKoPostuje;
  private String imeIPrezimeKomeJePOstovano;
    private String tekstObjave;
   private  int brojLajkova;
    private int brojDeljenja;
//		 Konstruktore:
//		difoltni konstuktor
    
    public FacebookPost2 ()
    {};
    
//		konstuktor koji postavlja ime i prezime
    //korisnika ko je objavio, korisnika na kom je profilu objavnljen i tekst objave
    
    
    public FacebookPost2(String koJeObjavio, String komejePostovano, String tekst )
    
    {this.imeIPrezimeKoPostuje=koJeObjavio;
    this.imeIPrezimeKomeJePOstovano=komejePostovano;
    this.tekstObjave=tekst;
    }
  
    public void setBrojLajkova(int brojLajkova) {this.brojLajkova=brojLajkova;}
    public void setBrojdeljenja(int brojDeljenja) {this.brojDeljenja=brojDeljenja;}
    public void setImeIPrezimekoPostuje(String koPostuje) {this.imeIPrezimeKoPostuje=koPostuje;}
    public void SetKomejepostovano(String KomeJePostovano) {this.imeIPrezimeKomeJePOstovano=KomeJePostovano;}
    public void setText (String tekstObjave) {this.tekstObjave=tekstObjave;}
    
    public String getImeIprezimeKoPostuje() {return this.imeIPrezimeKoPostuje;}
    public String getImeIPrezimeKomeJePostovano() {return this.imeIPrezimeKomeJePOstovano;}
    public int getBrojLajkova () {return this.brojLajkova;}
    public int getBrojdeljenja() {return this.brojDeljenja;}
    public String getTekstObjave() {return this.tekstObjave;}
    
    
//		  Od metoda:
//		like(), koja povecava broj lajkova za 1.
//		dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//		share(), koja povecava broj deljenja za 1
//		print(), koja stampa objavu u formatu:
//		(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//		(tekst objave)
//		Likes (broj lajkova) | Shares (broj deljenja)
    
    public void like() {
        this.brojLajkova++;
    }
    
    public void dislike() {
        if(this.brojLajkova>0) {this.brojLajkova--;}
        else {this.brojLajkova=0;}
    }
    
    public void share() {
        this.brojDeljenja++;
    }
    
    public void print() {System.out.println(this.imeIPrezimeKoPostuje + " >>>" 
    + this.imeIPrezimeKomeJePOstovano);
        System.out.println(" "+ this.tekstObjave);
        System.out.println("Likes: " + this.brojLajkova+ " | Shares: " + this.brojDeljenja);
    }
    
    
//
//		U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//		Primer stampanja:
//		Milan Jovanovic >>> Pera Peric
//		Ovo je tekst objave
//		Likes 3 | Shares 1


}
