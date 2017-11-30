package leetcode.samples;

public class BinarySum {

	 public String addBinary(String a, String b) {
	        
		 int p1 = a.length() - 1;
		        int p2 = b.length() - 1;
		        StringBuilder buf = new StringBuilder();
		        int carry = 0;
		        while (p1 >= 0 || p2 >= 0) {
		            int sum = carry;
		            if (p1 >= 0) {
		                sum += a.charAt(p1) - '0';		                
		                p1--;
		            }
		            if (p2 >= 0) {
		                sum += b.charAt(p2) - '0';
		                p2--;
		            }
		            
		            carry = sum >> 1;
		            //System.out.println(sum +" "+ carry);

		            
		            sum = sum & 1;
		            System.out.println(sum);
		            buf.append(sum == 0 ? '0' : '1');
		        }
		        if (carry > 0) {
		            buf.append('1');
		        }
		        System.out.println(buf.toString());
		        buf.reverse();
		        return buf.toString();
		    }
	 
	 
	 public static void main(String args[]){
		 
		 BinarySum bs = new BinarySum();
		 String s= bs.addBinary("11", "1");
		 System.out.println("Resullt: "+s);
	 }
}
