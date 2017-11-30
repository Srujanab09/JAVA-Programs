package leetcode.samples;

public class ReverseInteger {
	/*
	 * The input is assumed to be a 32-bit signed integer. 
	 * Your function should return 0 when the reversed integer overflows
	 */
	
	public int reverse(int x)
	{
	    int newResult1 = 0;

	    while (x != 0)
	    {
	        int remainder = x % 10;
	        newResult1 = newResult1 * 10 + remainder;
	       // if ((newResult - remainder) / 10 != result)
	       // { return 0; }
	      //  result = newResult1;
	        x = x / 10;
	    }

	    return newResult1;
	}
	
	public int reversebetter(int x)
	{
	    int result = 0;

	    while (x != 0)
	    {
	        int tail = x % 10;
	        int newResult = result * 10 + tail;
	        if ((newResult - tail) / 10 != result)
	        { return 0; }
	        result = newResult;
	        x = x / 10;
	    }

	    return result;
	}
	
	 public static void main(String args[]){
	 
		 int x=1534236462;
		 ReverseInteger r = new ReverseInteger();
		 int rr= r.reversebetter(x);
		 System.out.println(rr);
	 }
}


/*
 * Overflow in int

As int data type is 32 bit in Java, any value that surpasses 32 bits gets rolled over. 
In numerical terms, it means that after incrementing 1 on Integer.MAX_VALUE (2147483647), 
the returned value will be -2147483648. In fact you don't need to remember these values and 
the constants Integer.MIN_VALUE and Integer.MAX_VALUE can be used.

*  
*  Underflow of int

Underflow is the opposite of overflow. While we reach the upper limit in case of overflow, 
we reach the lower limit in case of underflow. 
Thus after decrementing 1 from Integer.MIN_VALUE, we reach Integer.MAX_VALUE. 
Here we have rolled over from the lowest value of int to the maximum value.
*/
