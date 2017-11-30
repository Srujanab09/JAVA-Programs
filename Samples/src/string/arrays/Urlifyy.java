package string.arrays;

public class Urlifyy {

String urlMethod(char[] arr, int truelength){
		
		int countSpaces =0;
		
		for(int i=0; i< truelength; i++){
			if(arr[i] == ' '){
				countSpaces++;
			}
			
		}
		System.out.println(arr.length);
		int finallength = truelength + 2*countSpaces;
		System.out.println(finallength);
//		if(truelength < arr.length) 
	//		arr[truelength] = '\0';
		for(int i=truelength-1; i >=0 ; i--){
			if(arr[i] == ' '){
				
				arr[finallength-1] = '0';
				
				arr[finallength-2] = '2';
				arr[finallength-3] = '%';
				finallength = finallength -3;
				
			}
			else{
			arr[finallength-1] = arr[i];
			
			finallength--;
			}	
		}
		return new String(arr);
	}
	
	public static void main(String args[]){
	String s1 = "Mr     John    Smith                  ";
	int len = s1.length();
	char arr[] = s1.toCharArray();
	Urlifyy uu = new Urlifyy();
	String str = uu.urlMethod(arr, 20);
	System.out.println(str);
	}
}
