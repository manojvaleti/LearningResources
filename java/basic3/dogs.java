class dog{
	private String name;
	private int age;

	public String getname(){
		return name;
	}
	public int getage(){
		return age;
	}
	public void setage(int s){
		this.age=s;
	}
	public void setname(String n){
		this.name=n;
	}
}

public class dogs{
	public static void main(String[] arg){

		dog[] d = new dog[2];
		d[0]  = new dog();
		d[1] = new dog();
		d[0].setage(1);
		d[1].setage(2);
		d[0].setname("rick");
		d[1].setname("jimmy");
int i=0;
for(i=0;i<2;i++){
		System.out.println(d[i].getname() + " is it's name and it's age is "+d[i].getage());
	}
	}
}


