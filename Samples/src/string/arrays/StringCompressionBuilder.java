package string.arrays;

public class StringCompressionBuilder {

	String compressStrng(String str){
		int countCompress =0;
		StringBuilder compressedStr = new StringBuilder();
		for(int i=0; i< str.length(); i++){
			countCompress++;
			if(i+1>= str.length() || str.charAt(i)!= str.charAt(i+1)){
				compressedStr.append(str.charAt(i));
				compressedStr.append(countCompress);
				countCompress=0;
			}
			
		}
		return compressedStr.length() < str.length() ? compressedStr.toString() : str;
	}
	
	public static void main(String args[]){
		String s1 = "aaaaaaabbfkfbbc";
		StringCompressionBuilder sc = new StringCompressionBuilder();
		System.out.println(sc.compressStrng(s1));
	}
}

