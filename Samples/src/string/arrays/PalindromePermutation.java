package string.arrays;

import java.util.Scanner;

public class PalindromePermutation {

	/*
	 *  Given a string, write a function to check if it is a permutation of a palindrome
	 */
	boolean checkPalindrome(String str){
		int table[] = charCount(str);
		return checkOddCount(table);
	}
	
	boolean checkOddCount(int[] table){
		boolean foundOdd = false;
		for(int i: table){
			if(i%2 == 1){
				if(foundOdd){
					return false;
				}
				foundOdd = true;
			}
		}
		return true;
	}
	
	int getCharNumericVal(Character c){
		int num1 = Character.getNumericValue('a');
		
		int num2 = Character.getNumericValue('z');
		int val = Character.getNumericValue(c);
		if(num1 <= val && val <= num2){
			return (val - num1);
		}
		return -1;
	}
	
	int[] charCount(String str){
		int[] table = new int[getCharNumericVal('z') - getCharNumericVal('a') +1];
		for(char c : str.toCharArray()){
			if(getCharNumericVal(c) != -1){
				table[getCharNumericVal(c)]++;
			}
		}
		return table;
	
	
	
	}
	
	boolean checkPerm(String str){
		
		int[] letter = new int[128];
		boolean flag= false;
		for(int i=0; i< str.length(); i++){
			int val = str.charAt(i);
			letter[val]++;
		}
		
		for(int i=0; i< str.length(); i++){
			if(letter[str.charAt(i)] % 2 != 0) {
				if(flag){
					return false;
				}
				flag= true;
			}
				
		}
		return true;
	}
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		String arr = "&&&!!!!!!!!!!!!!!!!!!^^^^^^*******^^^^^bbbbccccccdddd";
		PalindromePermutation pp = new PalindromePermutation();
		
		//if(pp.checkPalindrome(arr))
		if(pp.checkPerm(arr))
		System.out.println("Its a palindrome permutation strng");
		else 
		System.out.println("NOt");
	}
}
