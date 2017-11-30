package string.arrays;

public class OneAway {

	boolean oneEditAway(String s1, String s2){
		if(s1.length() == s2.length())
			return oneReplaceAway(s1, s2);
		else if(s1.length()+1 == s2.length())
			return oneInsertAway(s1, s2);
		else if(s1.length()-1 == s2.length())
			return oneInsertAway(s2, s1);
		else
			return false; 
	}
	
	boolean oneReplaceAway(String s1, String s2){
		boolean foundmismatch = false;
		for(int i=0; i< s1.length(); i++){
			if(s1.charAt(i)!=s2.charAt(i)){
				if(foundmismatch){
					//System.out.println("helloo...!!");
					return false;
				}
				foundmismatch = true;
				
			}
			
		}
		return true;
	}
	
	boolean oneInsertAway(String s1, String s2){
		int index1 =0;
		int index2 =0;
		while(index1< s1.length() && index2 < s2.length()){
		//	System.out.println("helloo");
			if(s1.charAt(index1) != s2.charAt(index2)){
				if(index1 != index2){
					return false;
				}
				index2++;
			}
			else{
				index1++;
				index2++;
			}
		}
		return true;
	}
	
	public static void main(String args[]){
		String s1 = "aple";
		String s2 = "apble";
		OneAway oa = new OneAway();
		if(oa.oneEditAway(s1, s2))
			System.out.println("One edit away");
		else
			System.out.println("NOt one edit away");
	}
}
