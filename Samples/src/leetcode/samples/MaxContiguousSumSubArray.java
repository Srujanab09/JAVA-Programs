package leetcode.samples;

public class MaxContiguousSumSubArray {

	public static void main(String args[]){
		int arr[] ={-2, -3, 4,-2,1,-1,5,-3};
		int sum = maxSum(arr);
		System.out.println(sum);
	}
	
	static int maxSum(int[] arr){
		int maxSum = 0;
		int maxCurrent =0;
		
		for(int i=0; i< arr.length; i++){
			maxCurrent = maxCurrent + arr[i];
			if(maxCurrent < 0){
				maxCurrent = 0;
			}
			else if(maxSum < maxCurrent){
				maxSum =  maxCurrent;
			}
			
		}
		
		
		return maxSum;
	}
}
