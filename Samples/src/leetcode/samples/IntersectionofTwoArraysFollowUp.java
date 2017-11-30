package leetcode.samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class IntersectionofTwoArraysFollowUp {

	/* intersection of two arrays with result printing the elements as many times as they are repreating */
	
	int[] intersect(int[] a, int[] b){
		//int result[] = new int[];
		
		HashMap<Integer, Integer> hash = new HashMap<>();
		ArrayList<Integer> result = new ArrayList<>();
		
		for(int i=0; i<a.length; i++){
			
			if(hash.containsKey(a[i])){
				hash.put(a[i], hash.get(a[i])+1);
			}
			else
				hash.put(a[i], 1);
		}
		
		for(int i=0; i<b.length;i++){
			if(hash.containsKey(b[i]) && hash.get(b[i])>0){
				result.add(b[i]);
				hash.put(b[i], hash.get(b[i])-1);
			}
		}
		
		int res[] = new int[result.size()];
		int ii=0;
		
		for(Integer obj: result){
			res[ii]=obj;
			ii++;
		}
		return res;
	}
	
	public static void main(String[] args){
		int[] a={9,1,1,1,1,1,2,2,2,2,2,3,3,3,3,3,9,55,555,5,6,6,6,7,7,7,88,88};
		int b[] ={9,3,3,3,3,3,4,4,4,4,2,2,2,21,1,7,88,555};
		IntersectionofTwoArraysFollowUp ia = new IntersectionofTwoArraysFollowUp();
		
		int[] result = ia.intersect(a, b);
		
		for(int i=0; i< result.length; i++){
			System.out.print(result[i]+" ");
		}
	}
}
