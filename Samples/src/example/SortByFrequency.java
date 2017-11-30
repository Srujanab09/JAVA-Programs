package example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortByFrequency {

	public static void main(String[] args) {
		Integer[] input = new Integer[] { 8,2,3,5,3,7,9,5,3,7, 5,5,5,11,1,0 };
		// Sort the array using custom comparator
		
		
		SortByFrequency ss = new SortByFrequency();
		Integer[] arr = ss.frequencySort(input);
		
		for (Integer i : input)
			System.out.print(i + " ");
	}
	
	Integer[] frequencySort(Integer[] input){
		
		Arrays.sort(input, new FrequencyComparator(input));
		
		return input;
	}
 	
	static class FrequencyComparator implements Comparator<Integer>
    {            
		Map<Integer, Integer> frequencyMap = new HashMap<>();

		public FrequencyComparator(Integer[] input) {
			for (Integer i : input) {
				frequencyMap.put(i, frequencyMap.get(i) != null ? frequencyMap.get(i) + 1 : 1);
			}
		}
		
		@Override
		public int compare(Integer i1, Integer i2) {
			// If frequencies are the same then compare the actual numbers
			if (frequencyMap.get(i1) == frequencyMap.get(i2)) 
				return i1.compareTo(i2);

			return (frequencyMap.get(i1) < frequencyMap.get(i2)) ? 1 : -1;
		}
     }
	
}
