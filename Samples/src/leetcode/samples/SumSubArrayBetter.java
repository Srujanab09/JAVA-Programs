package leetcode.samples;

import java.util.HashMap;

public class SumSubArrayBetter {

	int[] twoSum(int numbers[], int target){
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for(int i=0; i< numbers.length; i++){
			int diff = target - numbers[i];
			if(hm.containsKey(diff)){
				 int[] arr = {hm.get(diff), i};
				 return arr;	
			}
			hm.put(numbers[i], i);
		}
		
		
		return null;
	}
	
	 public static void main(String[] args){
	    	int arr[] = {1, 4, 20, 3, 10, 5};
	    	SumSubArrayBetter saa = new SumSubArrayBetter();
	    	int out[]= saa.twoSum(arr, 15);
	    	if(out != null){
	    		
	    		System.out.println("" +out[0] +" " +out[1]);
	    	}
	    }
}
