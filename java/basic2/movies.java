class movie{
	String name;
	String hero;
	int rating;
	String review;
}

public class movies{
	public static void main(String[] arg){

		movie m1 = new movie();
		m1.name="jersy";
		m1.hero="nani";
		m1.rating=4;
		m1.review="excellent";

		movie m2 = new movie();
		m2.name="maharshi";
		m2.hero="mahesh babu";
		m2.rating = 3;
		m2.review="good";

		System.out.println(m1.rating+m2.rating);
	}
}
