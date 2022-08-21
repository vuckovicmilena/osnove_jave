package d_18_08;

public class FacebookPostMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		 FacebookPost welcome = new FacebookPost();
	        welcome.imeIPrezimeKoPostuje = "Milena Vuckovic";
	        welcome.imeIPrezimeKomeJePOstovano= "Jovan Jovanovic";
	        welcome.tekstObjave= "Welcome!!!";
	        welcome.brojDeljenja= 22;
	        welcome.brojLajkova=30;


	        welcome.like();
	        welcome.dislike();
	        welcome.share();
	        welcome.print();

	        FacebookPost birthday = new FacebookPost();
	        
	        birthday.imeIPrezimeKoPostuje = "Milena Vuckovic";
	        birthday.imeIPrezimeKomeJePOstovano= "Marija Nikolic";
	        birthday.tekstObjave= "Happy Birthday";
	        birthday.brojDeljenja= 3;
	        birthday.brojLajkova=14;


	        birthday.like();
	     
	        birthday.dislike();
	        
	        birthday.share();
	        
	        birthday.print();
	}

}
