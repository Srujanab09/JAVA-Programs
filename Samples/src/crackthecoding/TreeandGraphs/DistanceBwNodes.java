package crackthecoding.TreeandGraphs;

public class DistanceBwNodes {

	static int leftdist = -1;
	static int rightdist = -1;
	static int dist =0;
	
	public int bstDistance(int[] values, int n, int node1, int node2)
	{ 
		TreeNode root = createBst(values);	

		leftdist = -1;
		rightdist = -1;
        dist = 0;
        
        TreeNode lca = findDistUtil(root, node1, node2, 1);
		
        if (leftdist != -1 && rightdist != -1)
            return dist;
         
        // If n1 is ancestor of n2, consider n1 as root and find level 
        // of n2 in subtree rooted with n1
        if (leftdist != -1)
        {
            dist = findLevel(lca, node2, 0);
            return dist;
        }
         
        // If n2 is ancestor of n1, consider n2 as root and find level 
        // of n1 in subtree rooted with n2
        if (rightdist != -1)
        {
            dist = findLevel(lca, node1, 0);
            return dist;
        }
         
        return -1;
	}	
	
	 static int findLevel(TreeNode root, int k, int level)
	    {
	        // Base Case
	        if (root == null)
	            return -1;
	         
	        // If key is present at root, or in left subtree or right subtree,
	        // return true;
	        if (root.val == k)
	            return level;
	             
	        int l = findLevel(root.left, k, level + 1);
	        return (l != -1)? l : findLevel(root.right, k, level + 1);
	    }
	 
	
	static TreeNode findDistUtil(TreeNode root, int n1, int n2, int lvl){
        
        // Base case
        if (root == null)
            return null;
         
        if (root.val == n1){
            leftdist = lvl;
            return root;
        }
        if (root.val == n2)
        {
        	rightdist = lvl;
            return root;
        }
         
        TreeNode left_lca = findDistUtil(root.left, n1, n2,  lvl + 1);
        TreeNode right_lca = findDistUtil(root.right, n1, n2,  lvl + 1);
         
        if (left_lca != null && right_lca != null)
        {
            dist = (leftdist + rightdist) - 2*lvl;
            return root;
        }
         
        return (left_lca != null)? left_lca : right_lca;    
    }
	
	TreeNode createBst(int[] values){
		 
		return createBst(values, 0, values.length - 1);
	}

	TreeNode createBst(int arr[], int start, int end){
		if(end < start){
			return null;
		}
		int mid = (start +  end) / 2;
		TreeNode n = new TreeNode(arr[mid]);
		n.left = createBst(arr, start, mid-1);
		n.right = createBst(arr, mid+1, end);
		return n;
	}	

	static TreeNode root = null;
	public static void main(String args[]){
		DistanceBwNodes s = new DistanceBwNodes();
		int[] arr = {1,2,3,4,5,6,7};
		int x= s.bstDistance(arr, 7, 3, 5);
		System.out.println(x);	
	}
}
