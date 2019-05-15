class car{
	int wheels =4;
	String color = "black";
	private int price = 200;
	int getprice(){
		return price;
}
}
class ford extends car{
	String color = "white";
}

public class cars{
	public static void main(String[] arg){
	ford f = new ford();
	System.out.println(f.getprice());
	System.out.println(f.color);
}
}
	
