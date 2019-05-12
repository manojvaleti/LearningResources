class animal{
	int age;
	String name;
}
public class news{
	public static void main(String[] arg){
		animal dog = new animal();
		dog.age=21;
		dog.name="jimmy";
		animal cat = new animal();
		cat.age=13;
		cat.name="silly";

		//cat =dog;

		animal n = cat;
		System.out.println(n.age+" "+n.name);
		n=dog;
		System.out.println(n.age+" "+n.name);
	}
}

