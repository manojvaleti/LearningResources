class simpleship{
	 int[] locationCells = new int[7];
	 int numofhits = 0 ;

	 String check(int guess){
		 int x = guess;
		 if(locationCells[x] == 1){
			 numofhits+=1;
			 locationCells[x]=0;
			 if(numofhits == 3){
				 return "kill";
			 }
			 else{
				 return "hit";
			 }
		 }
		 else{

			 return "miss";
		 }
	 }

	 void setlocationCells(int[] loc){
		 int i;
		 for(i=0;i<3;i++){
			 locationCells[loc[i]]=1;
		 }
	 }
}

public class basicgame{
	public static void main(String[] arg){

		simpleship d = new simpleship();
		int[] locations = {2,3,4};
		d.setlocationCells(locations);
		String s = "miss";
		int totalchances=0;
		while(s != "kill"){
		int guess = (int)(Math.random()*7);
		System.out.println(guess);
		s = d.check(guess);
		totalchances+=1;
		}
		System.out.println("You took a total of "+totalchances+" chances to sink the ship");
	}
}

