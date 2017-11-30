package leetcode.samples;

import java.util.Stack;

public class PalindromeValidity {

	boolean checkPlaindrome(String s){
		
		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		 
		System.out.println(s);
		int len = s.length();
		if (len < 2)
			return true;
	 
		Stack<Character> stack = new Stack<Character>();
	 
		int index = 0;
		while (index < len / 2) {
			stack.push(s.charAt(index));
			index++;
		}
	 
		if (len % 2 == 1)
			index++;
	 
		while (index < len) {
			if (stack.empty())
				return false;
	 
			char temp = stack.pop();
			if (s.charAt(index) != temp)
				return false;
			else
				index++;
		}
	 
		return true;
	}

	public static void main(String args[]){
		
		String s="123 321";
		PalindromeValidity p = new PalindromeValidity();
		if(p.checkPlaindrome(s))
			System.out.println("true");
		else
			System.out.println("false");	
		}
	
}
