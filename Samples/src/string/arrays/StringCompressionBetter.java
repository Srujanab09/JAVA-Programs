package string.arrays;

public class StringCompressionBetter {

	String compressString(String str){
		int countcompress =0;
		StringBuilder finalstr= new StringBuilder(str.length());
		int finallength = characterCountCompress(str);
		if(finallength >= str.length())
			return str;
		for(int i=0; i< str.length(); i++){
			countcompress++;
		if(i+1 >= str.length() || str.charAt(i)!= str.charAt(i+1)){
			finalstr = finalstr.append(str.charAt(i));
			finalstr = finalstr.append(countcompress);
			countcompress=0;
			}
		}
	return finalstr.toString();	
	}
	
	
	int characterCountCompress(String str){
		int countcompress =0;
		int finallength =0;
		for(int i=0; i< str.length(); i++){
			countcompress++;
		if(i+1 >= str.length() || str.charAt(i)!= str.charAt(i+1)){
			//System.out.println(countcompress);
			finallength = finallength + 1+ String.valueOf(countcompress).length(); 
			//System.out.println(String.valueOf(countcompress).length());
			countcompress=0;
			}
		
		}
		//System.out.println(finallength);
		return finallength;
	}
	
	public static void main(String args[]){
		String s1 = "abc";
		StringCompressionBetter sc = new StringCompressionBetter();
		System.out.println(sc.compressString(s1));
	}
}
