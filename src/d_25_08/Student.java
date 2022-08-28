package d_25_08;

import java.util.ArrayList;

public class Student {
//	Napisati klasu Student koja ima
//	broj indeksa
//	ime i prezime
//	tip studija (osnovne, master, doktorske)
//	niz ispita
//	konstuktore koje mislite da ce vam trebati
//	gettere i settere za indeks, ime i prezime, tip studija
//	getter za niz predmeta
//	metodu dodaj ispit u niz ispita
//	metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//	metodu stampaj koja stampa u formatu:
//	(broj indeksa) - (ime i prezime) - (tip studija)
//	Predmeti:
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	Prosecna ocena: (prosecna ocena)

	 private int brojIndexa;
	    private String imeIPrezime;
	    private String tipStudija;
	    private ArrayList<Ispit> ispiti = new ArrayList<>();
	
	
	    public Student() {
	    }

	    public Student(int brojIndexa, String imeIPrezime, String tipStudija) {
	        this.brojIndexa = brojIndexa;
	        this.imeIPrezime = imeIPrezime;
	        this.tipStudija = tipStudija;
	    }

	    public ArrayList<Ispit> getIspiti() {
	        return ispiti;
	    }

	    public void setBrojIndexa(int brojIndexa) {
	        this.brojIndexa = brojIndexa;
	    }

	    public void setImeIPrezime(String imeIPrezime) {
	        this.imeIPrezime = imeIPrezime;
	    }

	    public void setTipStudija(String tipStudija) {
	        this.tipStudija = tipStudija;
	    }
	    
	    
	    public void dodajIspit(Ispit ispit) {
	        this.ispiti.add(ispit);
	    }
	
	    public double prosekPolozenihIspita ()
	    { int brojPolozenihIspita =0;
	        int suma=0;
	        for (int i = 0; i < this.ispiti.size(); i++) {

	            if (this.ispiti.get(i).getOcena()>5);
	            {suma=suma+this.ispiti.get(i).getOcena();
	            brojPolozenihIspita++;}

	        }
	        return suma/brojPolozenihIspita*1.0;


	    }
	
	    
	    public void stampa ()
	    {
	        System.out.println(this.brojIndexa+ " - "+ this.imeIPrezime + " - "+ this.tipStudija);
	        System.out.println("Predmeti: ");
	        for (int i = 0; i < this.ispiti.size(); i++) {

	            this.ispiti.get(i).stampa();

	        }
	        System.out.println("Prosecna ocena je: " + prosekPolozenihIspita());
	    }
	}
	
	    

