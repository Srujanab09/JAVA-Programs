package regEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample1 {

	int compareStringsRegex(List<List<String>> list, List<String> myList){
		Set<String> settt = new HashSet<String>();
		for(List<String> s: list){
			for(String ss: s){
				settt.add(ss);
			}
		}
		
		for(String s : myList){
			if(!settt.contains(s))
				settt.add(s);
		}
		
		settt.remove("anything");
		
		StringBuilder str = new StringBuilder();
		str.append("(.*)");
		for(List<String> mainlist: list){
			
			for(String sublist: mainlist){
				str.append("(");
					if(sublist.equals("anything")){
						
						str.replace(str.length(), str.length()+1, "");
						for(String ss: settt){
							str.replace(str.length(), str.length()+1, ss);
							str.append("|");	
						}
				
						str.replace(str.length()-1, str.length(), "){1}");
					}	
					else {
						str.append(sublist);
						str.append("){1}");
						}
				}
			str.append("(.*)");
		}
			
	
	//	System.out.println(str);
		
		Pattern regex = Pattern.compile(str.toString());
		 
		StringBuilder sbb = new StringBuilder();
		for(String st : myList){
			sbb.append(st);
			}
			
			String myylist = sbb.toString();
			//System.out.println(myylist);
			Matcher m = regex.matcher(myylist);
			if(m.find()){
				//System.out.println(m.group(1));
				//System.out.println(m.group(2));
				return 0;
			
			}
		return 1;
	}
	
	public static void main(String args[]){
		List<List<String>> l1 = new ArrayList<List<String>>();
		l1.add(new ArrayList<String>(){{add("apple"); add("banana"); add("mango"); add("anything");add("bbb");}});
		l1.add(new ArrayList<String>(){{add("apple"); add("appricot");}});
	//	List<String> l2 = Arrays.asList(new String[] {"mmm", "apple", "banana" ,"mango" ,"orange","bbb","apple","apple","appricot", "ghjsggddns"});
		
		List<String> l2 = Arrays.asList(new String[] {"apple", "banana", "mango" ,"mango" ,"bbb"});
		Sample1 s = new Sample1();
		int x = s.compareStringsRegex(l1, l2);
		System.out.println("X= 0 : matched pattern, X=1 Missmatch");
			System.out.println("Value : "+ x);
	}
}
