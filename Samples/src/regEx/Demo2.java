package regEx;

import java.util.TreeMap;

public class Demo2 {
	
	public static void main(String args[]){
		String[] a= {"push","push","push","pop"};
		int[] b={1,3,2,1};
		long[] res = maxMin(a,b);
		for(int i=0;i<res.length;i++){
			System.out.println(res[i]);
		}
	}
	static long[] maxMin(String[] operations, int[] x) {
        long result[] = new long[x.length];
        long min =0, max =0;
        TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("push")){
                if(map.get(x[i])!=null){
                    map.put(map.get(x[i]),map.get(x[i])+1);
                }else{
                    map.put(x[i],1);
                }
                result[i]=map.firstKey()*map.lastKey();
                
            }else if(operations[i].equals("pop")){
            	 if(map.get(x[i])==1){
                     map.remove(map.get(x[i]));
                 }else{
                	 map.put(map.get(x[i]),map.get(x[i])-1);
//                     map.put(x[i],1);
                 }
                result[i]=map.firstKey()*map.lastKey();
            }
        }
        return result;
    }
	
	 static int budgetShopping(int n, int[] bundleQuantities, int[] bundleCosts) {          
	        int len =bundleQuantities.length;

	         // Returns the maximum value that can be put in a knapsack of capacity W
	        
	            // Base Case
	        if (len == 0 || n == 0)
	            return 0;

	        // If weight of the nth item is more than Knapsack capacity W, then
	        // this item cannot be included in the optimal solution
	        if (bundleQuantities[len-1] > n)
	           return budgetShopping(n, bundleQuantities, bundleCosts);

	        // Return the maximum of two cases: 
	        // (1) nth item included 
	        // (2) not included
	        else return max( bundleCosts[len-1] + budgetShopping(n-bundleQuantities[len-1], bundleQuantities, bundleCosts),
	                         budgetShopping(n, bundleQuantities, bundleCosts)
	                          );
	      }
	 
	    static int max(int a, int b) 
	    { 
	        return (a > b)? a : b; 
	    }
}
