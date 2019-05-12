class guessgame{
	player p1;
	player p2;
	player p3;

	void startgame(){
		p1 = new player();
		p2 = new player();
		p3 = new player();

		int target = (int) (Math.random()*10);
		System.out.println("the target number is"+target);
		boolean pg1=false,pg2=false,pg3=false;
		while(!pg1&&!pg2&&!pg3){
			p1.guess();
			p2.guess();
			p3.guess();
			if(p1.number == target){
				pg1=true;
			}
			if(p2.number == target){
				pg2 = true;
			}
			if(p3.number == target){
				pg3=true;
			}
		}
		System.out.println(pg1+" "+pg2+" "+pg3);
	}
}
class player{
	int number;
	 void guess(){
		this.number = (int)(Math.random()*10);
	}
}

public class game{
	public static void main(String[] arg){
		guessgame g = new guessgame();
		g.startgame();
	
	}
}

