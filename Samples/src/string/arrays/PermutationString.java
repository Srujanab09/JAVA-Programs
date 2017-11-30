package string.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PermutationString {

	/*
	 *  check permutation: given two strings, write a method to decide if one is a permuation of other
	 */

	private static Scanner in;
	String sort(String str){
		char arr[] = str.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}
	
	boolean permuationStrng(String s1, String s2){
		if(s1.length() != s2.length())
			return false;
		
		return s1.equals(s2);
	}
	public static void main(String[] args){
		in = new Scanner(System.in);
		String s1 = in.nextLine();
		String s2 = in.nextLine();
		PermutationString ps = new PermutationString();
		String s11 = ps.sort(s1);
		String s22 = ps.sort(s2);
		if(ps.permuationStrng(s11, s22))
			System.out.println("String permmtations");
		else
			System.out.println("Not String");
	}
}

