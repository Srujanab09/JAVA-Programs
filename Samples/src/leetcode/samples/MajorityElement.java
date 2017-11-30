package leetcode.samples;

import java.util.HashMap;

public class MajorityElement {

	/*
	 * Write a function which takes an array and emits the majority element (if it exists), otherwise prints NONE
	 * 
	 */

	int returnMajorityElement(int[] arr){
		int result = 0;
		
		HashMap<Integer, Integer> hash = new HashMap<>();
		int size = arr.length;
		
		for(int i=0; i< size ; i++){
			if(hash.containsKey(arr[i])){
				
				hash.put(arr[i], hash.get(arr[i])+1);
				if(hash.get(arr[i])> size/2){
					result = arr[i];
					return result;
				}
			}
			else {
				hash.put(arr[i], 1);
			}
		}
		
		return -1;
		
	}
	
	void printMajorityElementMoore(int arr[]){
		
		int size = arr.length;
		int elemt = findCandidate(arr, size);
		
		if(isMajority(arr, size, elemt))
			System.out.println("Majority Element :" + elemt);
		else
			System.out.println("None");
	}
	
	int findCandidate(int a[], int size){
		
		int maj_index = 0, count = 1;
        int i;
        for (i = 1; i < size; i++) 
        {
            if (a[maj_index] == a[i])
                count++;
            else
                count--;
            if (count == 0)
            {
                maj_index = i;
                count = 1;
            }
        }
        return a[maj_index];
	}
	
	
	boolean isMajority(int a[], int size, int cand){
		
		int i, count = 0;
        for (i = 0; i < size; i++) 
        {
            if (a[i] == cand)
                count++;
        }
        if (count > size / 2) 
            return true;
        else
            return false;
	}
	
	public static void main(String args[]){
		
		int arr[] = {3, 3, 4, 2, 4, 4,3, 2, 4, 4,3,3,3,3,3};
		MajorityElement m = new MajorityElement();
		int result = m.returnMajorityElement(arr);
		
		if(result != -1){
			System.out.println("Majority Repeated element :"+result);
		}
		else
			System.out.println("None");
		
	}


}
