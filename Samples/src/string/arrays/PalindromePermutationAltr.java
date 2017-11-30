package string.arrays;

import java.util.Scanner;

public class PalindromePermutationAltr {

	private static Scanner in;

	boolean checkPlaindrome(String str){
		int countOdd =0;
		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		for(char c: str.toCharArray()){
			int x = getCharNumber(c);
			if(x != -1){
				table[x]++;
				if(table[x]%2 == 1){
					countOdd++;
			//System.out.println(countOdd);
				}
				else
					countOdd--;
			}
		}
		
		return countOdd <= 1;
	}
		
		int getCharNumber(Character c){
		int num1 = Character.getNumericValue('a');
		int num2 = Character.getNumericValue('z');
		int val = Character.getNumericValue(c);
		if(num1 <= val && num2 >= val){
			return val;
		}
		else
			return -1;
		}
		
		public static void main(String args[]){
			in = new Scanner(System.in);
			String arr = "aaa Bbb";
			//System.out.println(Character.getNumericValue('A'));
			//System.out.println(Character.getNumericValue('a'));
			PalindromePermutationAltr pp = new PalindromePermutationAltr();
			if(pp.checkPlaindrome(arr))
			System.out.println("Its a palindrome permutation strng..!!!");
			else 
			System.out.println("NOttttttttt");
		}
	}

