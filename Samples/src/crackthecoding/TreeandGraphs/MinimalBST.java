package crackthecoding.TreeandGraphs;

public class MinimalBST {


	TreeNode  createMinimalBST(int array[]){
		
		return createMinimalBST(array, 0, array.length-1);
	}
	
	TreeNode createMinimalBST(int array[], int start, int end){
		if(end<start){
			return null;
		}
		//System.out.println("helloooo");
		int mid = (start+end)/2;
		TreeNode n = new TreeNode(array[mid]);
		n.left = createMinimalBST(array, start, mid-1);
		n.right = createMinimalBST(array, mid+1, end);
		return n;
	}
	
public void preOrderTraversal(TreeNode root){
		
		
		if(root !=null){
			//result.add(root.val);
			System.out.println(root.val);
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
			
		}
				
}


public void postOrderTraversal(TreeNode root){
	
	if(root!=null){
		
		
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.println(root.val);
	}
	
}	


public void inOrderTraversal(TreeNode root){
    
    if(root !=null){
        inOrderTraversal(root.left);
    	System.out.println(root.val);
        inOrderTraversal(root.right);
    }
    if(root == null)
    	return ;
}
	
	public static void main(String args[]){
		int arr[] ={1,2,3,4,5,6,7,8};
		MinimalBST bst = new MinimalBST();
		TreeNode root = bst.createMinimalBST(arr);
		bst.preOrderTraversal(root);
		//bst.inOrderTraversal(root);
	    //bst.postOrderTraversal(root);
	   

	}
}
