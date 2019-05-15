class animal{
	String name;
	String food;
	String hungerlevel;
	String location;
	
	void makenoise(){
	System.out.print("animal noise");
	}
	void eat(){
	System.out.println("Animal eats");
	}
	void sleep(){
	System.out.println("Animal sleeps");
	}
	void roam(){
	System.out.println("Animal roams");
	}
	}
class feline extends animal{
	void roam(){
	System.out.println("Feline roams");
	}
	}
class canine extends animal{
	void roam(){
	System.out.println("Canine roams");
	}
}

class hippo extends animal{
	void makenoise(){
	System.out.println("Hippo make some noise");
}

	void eat(){
	System.out.println("Hippo eat it");
	}
}

class lion extends feline{
	void makenoise(){
	System.out.println("lion make some noise");}
	void eat(){
	System.out.println("Lion eat it");
}
}
class tiger extends feline{
	void makenoise(){
	System.out.println("Tiger noise");
	}
	void eat(){
	System.out.println("tiger eats you");
}
}

class cat extends feline{
	void makenoise(){
	System.out.println("cat noise");
	}
	void eat(){
	System.out.println("eat cat");
	}
}

class dog extends canine{
	void eat(){
	System.out.println("dog eat");
	}
	void makenoise(){
	System.out.println("Barking dog");
}
}
class wolf extends canine{
	void makenoise(){
	System.out.println("Wolf noise");
	}
	void eat(){
	System.out.println("Wolf eat");
}
}

public class animals{
	public static void main(String[] arg){
	wolf w = new wolf();
	w.makenoise();
	w.roam();
	w.eat();
	w.sleep();
}}

