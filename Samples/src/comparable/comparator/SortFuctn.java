package comparable.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SortFuctn {

	String sortIntegers(int[] a){
		Arrays.sort(a);
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
		return Arrays.toString(a);
	}
	
	String sortString(String s){
		 char arr[] = s.toCharArray();
		 Arrays.sort(arr);
		 System.out.println(s);
		 System.out.println(arr);
		return Arrays.toString(arr);
		
	}
	
	 List<String> sortListStrings(List<String> list){
	
		Collections.sort(list);
		return list;
	}
	
	public static void main(String args[]){
		SortFuctn s = new SortFuctn();
		
		
		int arr[] = {1,5,3,9,2,6};
		String ss = s.sortIntegers(arr);
		System.out.println(ss);
		
		String sortString = s.sortString("lkjhgfdsa");
		System.out.println(sortString);

		List<String> ls= new ArrayList<String>();
		ls.add("abc");
		ls.add("bc");
		ls.add("aab");
		ls.add("aaab");
		ls.add("tgv");
		
		List<String> ll = s.sortListStrings(ls);
		
		for(String li: ll){
			System.out.println(li);
		}
	}
}
