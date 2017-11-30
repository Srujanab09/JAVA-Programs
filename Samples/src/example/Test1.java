package example;

import java.util.Scanner;

public class Test1 {

	public static void main(String args[]) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter the name: ");
	    String n;
	    n = in.nextLine();

	    char [] chars = n.toCharArray();
	    for (int i = 0; i < chars.length; i++) {
	        char c = chars[i];

	        if(c >= 'a' && c <='y')
	            chars[i] = (char) ( c + 1);
	        else if(c == 'z')
	        	chars[i] = (char)('a');

	       // if(c >= 'A' && c <='Z')
	         //   chars[i] = (char) ('Z' - c + 'A');
	    }
	    System.out.println(new String(chars));
	}
}
