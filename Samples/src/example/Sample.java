package example;

import java.util.Arrays;

class Sample{

boolean isunique(String str){
	
	if(str.length()>= 128)

		return false;
	boolean arr[] = new boolean[128];
	for(int i=0; i< str.length(); i++){
	 int val = str.charAt(i);
		if(arr[val])
			return false;
		arr[val] = true;
	
	}
	
	return true;
}

boolean isUnique1(String str){
	
	if(str.length()>= 128)
		return false;
	 /*for(int i=0; i< str.length();i++){
		
		for(int j=i+1; j<str.length(); j++){
			if(str.charAt(i) == str.charAt(j))
				return false;
		}
	}
	*/
	
	char[] a = str.toCharArray();
	Arrays.sort(a);
	
	for(int i=0; i< a.length-1; i++){
		
		if(a[i] == a[i+1])
			return false;
	}
	
	return true;
	
}

public static void main(String args[]){

String str = "asdfghjkl;'][poiuytrew.qzxcvbnm,098765432!@#.$%^&*()";

Sample s = new Sample();
if(s.isUnique1(str))
System.out.println("Unique");
else
System.out.println(" not Unique");
}

}

