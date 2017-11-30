package string.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class IsUnique {

	/*
	 * Algorithm to determine if a string has all unique characters. What if we cannot use additional data structure
	 * 
	 */
	boolean checkUnique(String str){
		if(str.length()>128){
			return false;
			}
		boolean[] arr = new boolean[128];
		for(int i=0; i< str.length(); i++){
			int val = str.charAt(i);
			if(arr[val])
				return false;
			arr[val]=true;
		}
		
		return true;
	}
	
	boolean checkUniqueWithoutDatastruct(String str){
		
		if(str.length() > 128){
			return false;
		}
		
		for(int i=0; i< str.length(); i++){
			for(int j=i+1; j< str.length(); j++){
				if(str.charAt(i) == str.charAt(j))
					return false;
			}
			
		}
		
		
		return true;
	}
	
	boolean checkUniqueSort(String str){
		
		if(str.length() > 128)
			return false;
		
		char[] chararray = str.toCharArray();
		Arrays.sort(chararray);
		System.out.println(chararray);
		
		for(int i=0; i< chararray.length; i++){
			if(chararray[i] == chararray[i++]){
				return false;
			}
		}
		return true;
	}
	
	

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String");
		String s = in.nextLine();
	IsUnique uq = new IsUnique();
	 
/*	if(uq.checkUnique(s))
		System.out.println("String has unique elements");
	else
		System.out.println("NOt Unique");*/
	
	if(uq.checkUniqueSort(s)){
		System.out.println("true..");
	}
	
	if(uq.checkUniqueWithoutDatastruct(s))
		System.out.println("String has unique elements");
	else
		System.out.println("NOt Unique");
	
	}
}
