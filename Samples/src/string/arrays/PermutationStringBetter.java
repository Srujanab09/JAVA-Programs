package string.arrays;

import java.util.Scanner;

public class PermutationStringBetter {

	private static Scanner in;

	/*
	 *  check permutation: given two strings, write a method to decide if one is a permuation of other
	 */

	boolean checkPermutation(String s1, String s2){
	if(s1.length() != s2.length())
		return false;
	
	int letters[] = new int[128];
	
	for(int i=0; i< s1.length(); i++){
	
	int val = s1.charAt(i);
	letters[val]++;
	
	}
	
	for(int i=0; i< s2.length(); i++){
		
		int vall = s2.charAt(i);
		letters[vall]--;
		if(letters[vall] < 0 )
			return false;
		}
	
		
	/*int val[] = new int[128];
	char arr[] = s1.toCharArray();
	for(char c: arr){
		val[c]++;
		
	}
		
	for(int i=0; i< s2.length(); i++){
		int v = s2.charAt(i);
		val[v]--;
		if(val[v]<0)
			return false;
	}
	*/
	
		return true;
	}
	
	public static void main(String[] args){
		in = new Scanner(System.in);
		String s1 = in.nextLine();
		String s2 = in.nextLine();
		PermutationString ps = new PermutationString();
		String s11 = ps.sort(s1);
		String s22 = ps.sort(s2);
		if(ps.permuationStrng(s11, s22))
			System.out.println("Both String permmtations");
		else
			System.out.println("Not Permutation Strings");
	}
	
}
