package string.arrays;

import java.util.HashMap;
import java.util.Set;
import java.lang.String;

public class DuplicateWordsInString {

	/*
	 * Write a java program to find the duplicate words and their number of occurrences in a string?
	 */
	
	 public static void duplicateWordsInString(String str){
		 
		 String[] words = str.split(" ");
	/*	
		 System.out.println(words.length);
		 int count=1;
		 for(int i=0; i< str.length()-1; i++){
			 if(str.charAt(i)== ' ' && str.charAt(i+1)!= ' ')
				 count++;
		 }
		System.out.println(count);
		*/ 
		 HashMap<String, Integer> wordMap = new HashMap<>();
		 
		 for(int i=0; i< words.length;i++){
			 if(wordMap.containsKey(words[i].toLowerCase()))
				 wordMap.put(words[i].toLowerCase(), wordMap.get(words[i])+1);
			 else
				 wordMap.put(words[i].toLowerCase(), 1);
		 }
		 //Extacting all keys from wordmap
		 
		 Set<String> wordsinString = wordMap.keySet();
		 
		 for(String word: wordsinString){
			 if(wordMap.get(word) >= 1){
				 System.out.println(word+" "+wordMap.get(word));
			 }
		 }
	 }
	 
	 public static void main(String args[]){
		 duplicateWordsInString("Bread butter and bread is are butter and   ");
	 }
}
