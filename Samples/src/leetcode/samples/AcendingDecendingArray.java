package leetcode.samples;

import java.util.Arrays;

public class AcendingDecendingArray {

	  public static void main(String[] args){
	        int[] arr={-1, 0, 13, -4};
	        int[] arrDec=new int[arr.length];

	        //sort array
	        Arrays.sort(arr);


	        for(int a:arr){
	            System.out.println(a);
	        }

	        
	        //index variable
	        int j=arr.length-1;
	        for(int i=0; i<arr.length/2;i++){
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	            j--;
	        }
	        System.out.println("=========");
	        for(int i=0;i<arr.length;i++){
	            System.out.println(arr[i]);
	        }

	    }
}
