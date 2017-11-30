package example;

import java.util.Scanner;

public class Fibonacci 
{

	public static void main(String args[])  
	{    
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int count = in.nextInt();
	 int n1=0,n2=1,n3=0,i;    
	    
	 for(i=2;i<count;++i)
	 	{    
		 	n3=n1+n2;    
		 	n1=n2;    
		 	n2=n3;    
	 	}
	 	System.out.print(n3);    

	}
}