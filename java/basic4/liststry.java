import java.io.*;
import java.util.*;


class elem{
	int x = 5;
	int y=6;
	}
public class liststry{
	public static void main(String[] arg){
	ArrayList<elem> myel = new ArrayList<elem>();
	elem s = new elem();
	myel.add(s);
	elem t = new elem();
	myel.add(t);

	System.out.println(myel);
	System.out.println(myel.get(0).x);
}
}
