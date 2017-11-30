package leetcode.samples;

public class SumSubArray {

	/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
	 */
	
    public int[] twoSum(int[] nums, int target) {
        
        for(int i=0; i< nums.length; i++){
        	for(int j=1; j< nums.length; j++){
        		if(nums[i]+nums[j] == target){
        			int arr[] = {nums[i], nums[j]};
        			return arr;
        		}
        	}
        }
        return null;
    }
    
    public static void main(String[] args){
    	int arr[] = {1, 4, 20, 3, 10, 5};
    	SumSubArray sa = new SumSubArray();
    	int out[]= sa.twoSum(arr, 15);
    	if(out != null){
    		System.out.println("hiiiiii");
    		System.out.println("" +out[0] +" " +out[1]);
    	}
    }
}
