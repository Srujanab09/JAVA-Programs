package leetcode.samples;

import java.awt.List;
import java.util.HashMap;
import java.util.HashSet;

public class IntersectionofTwoArrays {

	int[] checkInterscetion(int[] a, int[] b){
	
		
		
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> sol = new HashSet<>();
		for(int i=0; i<a.length; i++){
			set.add(a[i]);
		}
		
		for(int i=0; i<b.length;i++){
			if(set.contains(b[i])){
				sol.add(b[i]);
			}
				
		}
		
		int[] result = new int[sol.size()];
		int i=0;
		for(Integer in: sol){
			result[i]=in;
			i++;
		}
		
		return result;
	}
	
	
 	
	public static void main(String[] args){
		int[] a={99999,9,1,1,1,1,1,2,2,2,2,2,3,3,3,3,55,555,5,6,6,6,7,7,7,88,88};
		int b[] ={9,99999,3,3,3,3,4,4,4,4,2,2,2,21,1,7,88,555};
		IntersectionofTwoArrays ia = new IntersectionofTwoArrays();
		
		int[] result = ia.checkInterscetion(a, b);
		
		for(int i=0; i< result.length; i++){
			System.out.print(result[i]+" ");
		}
	}
}
