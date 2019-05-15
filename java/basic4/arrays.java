class name{
	private int x =5;
	public void getx(){
		System.out.println(x);
}
public void setx(int y){
	x =y;
}
}
public class arrays{
	public static void main(String[] arg){
	name[] n = new name[2];
	n[0] = new name();
	n[0].setx(6);
	n[0].getx();
	}
}
