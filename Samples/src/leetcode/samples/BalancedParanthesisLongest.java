package leetcode.samples;

import java.util.Stack;

public class BalancedParanthesisLongest {

	public static int longestValidParentheses(String s) {
		Stack<int[]> stack = new Stack<int[]>();
		int result = 0;
	 
		for(int i=0; i<=s.length()-1; i++){
			char c = s.charAt(i);
			if(c=='('){
				int[] a = {i,0};
				stack.push(a);
			}else{
				if(stack.empty()||stack.peek()[1]==1){
					int[] a = {i,1};
					stack.push(a);
				}else{
					stack.pop();
					int currentLen=0;
					if(stack.empty()){
						currentLen = i+1;
					}else{
						System.out.println(i);
						System.out.println(stack.peek()[0]);
						currentLen = i-stack.peek()[0];
					}
					result = Math.max(result, currentLen);
				}
			}
		}
	 
		return result;
	}
	
	public static void main(String args[]){
		
		String s1="))(()";
		
		BalancedParanthesisLongest b = new BalancedParanthesisLongest();
		int res= b.longestValidParentheses(s1);
			System.out.println(res);
		 }
}
