package leetcode.samples;

import java.util.HashMap;

public class IndexofTargetInteger {

	int indexValue(int[] arr, int target){
		
	HashMap<Integer, Integer> map = new HashMap<>();
	
	for(int i=0; i< arr.length;i++){
		
			map.put(arr[i], i);
		
		}
	
	if(map.containsKey(target)){
		return map.get(target);
	}
	else
		return -1;
	
	}
	
	 public static void main(String args[]){
		 
		 int x[]= {1,3,3,2,2,2,4,4,4,4,5,5,5,5,5};
		 
		 IndexofTargetInteger i = new IndexofTargetInteger();
		 
		int res  = i.indexValue(x, 4);
		 System.out.println(res);
		 
	 }
		 
}
