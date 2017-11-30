package string.arrays;



public class URLify {

	void replaceSpaces(char[] str, int truelength){
		int spacecount =0, index, i = 0;
		for(i =0; i<truelength; i++){
			if(str[i] == ' ')
				spacecount++;
		}
		index = truelength + spacecount*2;
		//if(truelength < str.length) str[truelength] = '\0';
		for(i = truelength-1; i>=0; i--){
			if(str[i]== ' '){
				str[index-1]='0';
				str[index-2] = '2';
				str[index-3] = '%';
				index= index-3;
			}
			else{
				str[index-1] = str[i];
				index--;
			}
		}
	}
	
	public static void main(String args[]){
	//	Scanner in = new Scanner(System.in);
		String arr = "mr john smith                ";
		char[] ar = arr.toCharArray();
		URLify ur= new URLify();
		System.out.println(arr.length());
		System.out.println(ar.length);
		ur.replaceSpaces(ar, 13);
		System.out.println(ar);
		System.out.println(ar.length);
		
	}
}
