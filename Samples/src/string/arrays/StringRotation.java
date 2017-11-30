package string.arrays;

public class StringRotation {

	boolean checkRotation(String s1, String s2){
		int len = s1.length();
		if(len == s2.length() && len>0){
			String s1s1 = s1+s1;
			return s1s1.contains(s2);
		}
		
		return false;
	}
	
	public static void main(String args[]){
		String s1 ="waterbottle";
		String s2 = "erbottjewat";
		StringRotation sr = new StringRotation();
		if(sr.checkRotation(s1, s2))
			System.out.println("String rotated");
		else
			System.out.println("not a rotation");
	}
}
