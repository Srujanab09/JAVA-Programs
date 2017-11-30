package string.arrays;

public class ReverseWordsString {

	
		public static void main(String[] args) {
			System.out.println(reverseWords("The Sky is Blue"));
			System.out.println(reverseWords("My name is Bushan"));
		}
	
		static String reverseWords(String s){
			String result = "";
			String words[] = s.split(" ");
			for(int i= words.length-1; i>0 ;i--){
				result = result+ words[i]+ " ";
			}
			
			
			return result.trim();
		}
	}

