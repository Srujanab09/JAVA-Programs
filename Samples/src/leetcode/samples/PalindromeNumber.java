package leetcode.samples;

public class PalindromeNumber {
	/*
	 * Could negative integers be palindromes? (ie, -1)

	If you are thinking of converting the integer to string, note the restriction of using extra space.

	You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", 
	you know that the reversed integer might overflow. How would you handle such case?
	 */

	public boolean isPalindrome(int x) {
	    if (x<0 || (x!=0 && x%10==0)) return false;
	    int rev = 0;
	    while (x>rev){
	    	rev = rev*10 + x%10;
	    	x = x/10;
	    }
	    return (x==rev || x==rev/10);
	}
	
	public boolean checkPlaindrome(int x){
        if (x < 0) 
        	return false;

        int p = x; 
        int q = 0; 
    
        while (p >= 10){
        	q =q*10; 
        	q =q+ p%10; 
        	p /=10; 
        }
    
    return q == x / 10 && p == x % 10;
    }
	
	
	public static void main(String args[]){
		 
		 int x=2134504312;
		 PalindromeNumber r = new PalindromeNumber();
		  if(r.isPalindrome(x))
		 System.out.println("palindrome");
		  else
			 System.out.println("not a "); 
	 }
}

