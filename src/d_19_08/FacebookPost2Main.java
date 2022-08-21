package d_19_08;

public class FacebookPost2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FacebookPost2 post1= new FacebookPost2();
		
		post1.setImeIPrezimekoPostuje("Milena Vuckovic");
		post1.SetKomejepostovano("Natalija ilic");
		post1.setText("Cao Natalija");
		
		post1.setBrojLajkova(10);
		post1.setBrojdeljenja(2);
		
		post1.dislike();
		post1.print();
		post1.like();
		post1.share();
		post1.print();
		
		FacebookPost2 post2 = new FacebookPost2("Natalija Ilic","Milena Vuckovic", "Happy Birthday");
		
		post2.setBrojdeljenja(3);
		post2.setBrojLajkova(12);
		post2.like();
		post2.share();
		post2.dislike();
		post2.print();
	}

}
