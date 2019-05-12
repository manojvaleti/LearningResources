class dog{
	int size;
}
public class array{
	public static void main(String[] arg){
		dog[] d = new dog[2];
		d[0] = new dog();
		d[0].size=1;
		d[1]=new dog();
		d[1].size=2;
		System.out.println(d[0].size + " "+d[1].size);
	}
}


