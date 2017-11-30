package leetcode.samples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintingUniqueElements {

	ArrayList<Integer> printingStrings(int[] num){
		
		HashMap<Integer, Integer> map = new HashMap<>();
	
		for(int i=0; i< num.length; i++ ){
			
			if(map.containsKey(num[i])){
				map.put(num[i], map.get(num[i])+1);
			}
			else
				map.put(num[i], 1);
		
		}
		int j=0;
		ArrayList<Integer> res = new ArrayList<>();
		for(int i=0; i< num.length; i++){
			
			if(map.get(num[i]) == 1){
				res.add(num[i]);
	
			}
			
		}
			return res;
	}
	
	public static void main(String[] args){
		int[] a={99999,9,1,1,1,1,1,2,2,2,2,66,77,2,3,3,3,3,55,555,5,6,6,6,7,7,7,88,88,11,12,13};
		
		PrintingUniqueElements p = new PrintingUniqueElements();
		ArrayList<Integer> res=	p.printingStrings(a);
		
		for(Integer obj: res){
			System.out.println(obj);
		}
		
	}
}
