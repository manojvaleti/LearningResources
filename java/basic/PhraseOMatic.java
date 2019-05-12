public class PhraseOMatic{
	public static void main(String[] arg){
		String[] word1 = {"24/7","tier","30,000 foot","BtoB","win-win","front-end","smart"};
		String[] word2 = {"empowered","sticky","value-added","centric","outofbox"};
		String[] word3 = {"process","tipping","hello-world","how are you"};

		int len1,len2,len3;
		len1 = word1.length;
		len2 = word2.length;
		len3 = word3.length;

	        int r1,r2,r3;
	r1 = (int)(Math.random()*len1);
        r2 = (int)(Math.random()*len2);
	r3 = (int)(Math.random()*len3);

System.out.println(word1[r1]+word2[r2]+word3[r3]);}}	
