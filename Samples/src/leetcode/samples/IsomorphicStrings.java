package leetcode.samples;

import java.util.HashMap;
import java.util.Map;
//import java.util.HashMap;
import java.util.Scanner;

import string.arrays.PermutationString;

public class IsomorphicStrings {

	
	  public boolean isIsomorphic(String s1, String s2) {
	        int[] m = new int[512];
	        for (int i = 0; i < s1.length(); i++) {
	            if (m[s1.charAt(i)] != m[s2.charAt(i)+256]) return false;
	            m[s1.charAt(i)] = m[s2.charAt(i)+256] = i+1;
	        }
	        return true;
	    }
	  
	  
	  public boolean isIsomorphicHashMap(String s, String t) {
	        if(s == null || s.length() <= 1) return true;
	        java.util.HashMap<Character, Character> map = new java.util.HashMap<Character, Character>();
	        Map index = new HashMap();
	        for(int i = 0 ; i< s.length(); i++){
	            char a = s.charAt(i);
	            char b = t.charAt(i);
	            if(map.containsKey(a)){
	                 if(map.get(a).equals(b))
	                continue;
	                else
	                return false;
	            }else{
	                if(!map.containsValue(b))
	                map.put(a,b);
	                else return false;
	                
	            }
	        }
	        return true;
	        
	    }
	  
	  public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			String s1 = in.nextLine();
			String s2 = in.nextLine();
			IsomorphicStrings ps = new IsomorphicStrings();
			
			if(ps.isIsomorphicHashMap(s1, s2))
		//	if(ps.isIsomorphic(s1, s2))
				System.out.println("String are isomorphic");
			else
				System.out.println("Not");
		}
		
}
