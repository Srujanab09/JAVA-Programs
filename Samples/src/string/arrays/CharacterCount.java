package string.arrays;

import java.lang.String;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class CharacterCount {

	/*
	 * Write a java program to count the total number of occurrences of a given character in a string without using any loop?
	
	
	public static void CharCount(String str, String s){
		
		int count = str.length() - str.replaceAll(s, "").length();
		System.out.println(count);
	}
	
	public static void main(String args[]){
		CharCount("aa aa gdfgd fgfd add ggre hhyr", "a");
	}
	
	 */
	
	
	static List<Map<String, Object>> validatecards(String[] bannedPrefixes, String[] cardstoValidate){
		
		List prefixList = Arrays.asList(bannedPrefixes); 
		Set BannedCardPrefixesSet = new HashSet(Arrays.asList(prefixList)); 
		
		
		return null;
	}
	
	
	boolean isAllowed(String[] bannedPrefixes, String cardNumber){
		
		
		
		return true;
	}
	
}
