package leetcode.samples;

public class LongestCommonPrefix {

	 public String getlongestCommonPrefix(String[] strs) {
	     
		    if(strs == null || strs.length == 0)    return "";
		    String pre = strs[0];
		    int i = 1;
		    while(i < strs.length){
		        while(strs[i].indexOf(pre) != 0)
		        {
		        	
		        	pre = pre.substring(0,pre.length()-1);       
		        	System.out.println(pre);
		        }
		       
		            i++;
		    }
		    return pre;   
		    }
	 
	  public static void main(String args[]){
			
			String s[]= { "aaaac", "aaab","aa"};
			LongestCommonPrefix ll = new LongestCommonPrefix();
			String str=ll.getlongestCommonPrefix(s);
			System.out.println(str);
			if(str == ""){
				System.out.println("null");
			}

	  }
	  
	  /*The java string indexOf() method returns index of given character value or substring. 
	   * If it is not found, it returns -1. The index counter starts from zero.
	   * int indexOf(String substring)	returns index position for the given substring
	   * 
	   */
}

