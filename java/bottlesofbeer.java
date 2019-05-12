public class bottlesofbeer{
	public static void main(String[] arg){

		int n=99;
		while(n!=0){
			System.out.println(n+" "+"bottles of beer on the wall,");
			System.out.println(n+" "+"bottles of beer.");
			System.out.println("Take one down ,pass it around,");
			n-=1;
			if(n!=0){
				System.out.println(n+" " + "bottles of beer on the wall");
			}
			else{
				System.out.println("No bottles of beer on the wall.");
			}
			System.out.println();
		}
		if(n==0){
			System.out.println("No bottles of beer on the wall,");
			System.out.println("No bottles of beer.");
			System.out.println("Go to the store, buy some more,");
			System.out.println("99 bottles of beer on the wall.");
		}
	}
}


