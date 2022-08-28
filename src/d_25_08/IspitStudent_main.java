package d_25_08;

public class IspitStudent_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ispit nasledno = new Ispit("nasledno pravo", 8, "Natasa Ciric");

        Ispit obligacije = new Ispit("obligacije", 7, "Djordje Djordjic");

        Ispit mjp = new Ispit("mjp", 10, "Z. Radivojevic");


        Student student1 = new Student(1027, "Milena Vuckovic", "osnovne");

        student1.dodajIspit(nasledno);
        student1.dodajIspit(obligacije);
        student1.dodajIspit(mjp);

        nasledno.stampa();
        System.out.println(student1.prosekPolozenihIspita());

        student1.stampa();
    }
}
		
		
		
		
		
		
		
		
		
		
		
		
		
	


