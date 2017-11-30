package leetcode.samples;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeats {

	/*
	 * In fact, it could be optimized to require only n steps. 
	 * Instead of using a set to tell if a character exists or not, we could define a mapping of the characters to its index. 
	 * Then we can skip the characters immediately when we found a repeated character. 
	 * The reason is that if s[j]s[j] have a duplicate in the range [i, j)[i,j) with index j'j′, 
	 * we don't need to increase ii little by little. We can skip all the elements in the range [i, j'][i,j′ ] 
	 * and let ii to be j' + 1 j′+1 directly.
	 * 
	 */
	
	 public int lengthOfLongestSubstring(String s) {
	      int n = s.length(), ans = 0;
	        Map<Character, Integer> map = new HashMap<>(); // current index of character
	        // try to extend the range [i, j]
	        for (int j = 0, i = 0; j < n; j++) {
	            if (map.containsKey(s.charAt(j))) {
	                i = Math.max(map.get(s.charAt(j)), i);
	            }
	            ans = Math.max(ans, j - i + 1);
	            map.put(s.charAt(j), j + 1);
	        }
	        return ans;
	    
	    }
	 
	 /*   ****Sliding Window Concept ** 
	  * We use HashSet to store the characters in current window [i, j)[i,j) (j = ij=i initially). 
	  * Then we slide the index j to the right. 
	  * If it is not in the HashSet, we slide j further. 
	  * Doing so until s[j] is already in the HashSet. 
	  * At this point, we found the maximum size of substrings without duplicate characters start with index ii. 
	  * If we do this for all ii, we get our answer.
	  */
	 
	  public int lengthOfLongestSubstringAtler(String s) {
	        int n = s.length();
	        java.util.Set<Character> set = new java.util.HashSet<>();
	        int ans = 0, i = 0, j = 0;
	        while (i < n && j < n) {
	            // try to extend the range [i, j]
	            if (!set.contains(s.charAt(j))){
	                set.add(s.charAt(j++));
	                ans = Math.max(ans, j - i);
	            }
	            else {
	                set.remove(s.charAt(i++));
	            }
	        }
	        return ans;
	    }
	  
	  public int lengthOfLongestSubstringalterr(String s) {
	        int n = s.length();
	        java.util.Set<Character> set = new java.util.HashSet<>();
	        int ans = 0, i = 0, j = 0;
	        while (i < n && j < n) {
	            // try to extend the range [i, j]
	            if (!set.contains(s.charAt(j))){
	                set.add(s.charAt(j));
	                j++;
	                ans = Math.max(ans, j - i);
	            }
	            else {
	                set.remove(s.charAt(i));
	                i++;
	            }
	        }
	        return ans;
	    }
	  
	 
	 public static void main(String args[]){
			
			String s1="pwwkewasdfghjuuuuabcdf";
			
			LongestSubStringWithoutRepeats ll = new LongestSubStringWithoutRepeats();
			//int max= ll.lengthOfLongestSubstring(s1);
			int max= ll.lengthOfLongestSubstringalterr(s1);
			System.out.println(max);
	 }
}
