package string.arrays;

public class StringCompression {

	/*
	 *  eg: aabccccaaa --> a2b1c4a3
	 */
	String compressedString(String str){
		String compressedStr ="";
		int countConseq=0;
		for(int i=0;i< str.length(); i++ ){
			countConseq++;
			if(i+1 >= str.length() || str.charAt(i)!= str.charAt(i+1)){
				compressedStr = compressedStr + str.charAt(i)+countConseq;
				countConseq=0;
			}
		}
		
		return compressedStr.length() < str.length()? compressedStr : str;
	}

	public static void main(String args[]){
		String s1 = "aabbbbc";
		StringCompression sc = new StringCompression();
		System.out.println(sc.compressedString(s1));
	}
}
