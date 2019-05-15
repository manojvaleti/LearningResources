class addd{

static int add(int a , int b){
	return a+b;
}
static String add(String a , String b){
	return a+b;
}
}

public class overloadingg{
	public static void main(String[] arg){
	addd ze = new addd();
	String a = "hai";
	System.out.println(a.hashCode());
	String b = "manoj";
	int c =3,d=4;
	System.out.println(ze.add(c,d));
	System.out.println(ze.add(a,b));
}
}
	
