class dog{
	String name;
	int size;
	String breed;

	void details(){
		System.out.println(this.name);
	}

}

public class dogbarking{
	public static void main(String[] arg){
		dog d  = new dog();
		d.name="rick";
		d.size=40;
		d.breed="special";
		d.details();
	}
}
