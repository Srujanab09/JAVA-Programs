package crackthecoding.TreeandGraphs;

public class MinDepthofBinaryTree {

	  public int minDepth(TreeNode root) {
	        if(root == null) return 0;
	        int left = minDepth(root.left);
	        int right = minDepth(root.right);
	        return (left == 0 || right == 0) ? left + right + 1: Math.min(left,right) + 1;
	       
	    }
	  public static void main(String args[]){
			
			BinaryTree tree = new BinaryTree();
			
			tree.root = new TreeNode(8);
			
			tree.root.left = new TreeNode(4);
			tree.root.right = new TreeNode(10);
			tree.root.left.left = new TreeNode(2);
			tree.root.left.right = new TreeNode(6);
			//tree.root.right.right =new TreeNode(20);
		
			MinDepthofBinaryTree depth = new MinDepthofBinaryTree();
			   
				  int deep = depth.minDepth(tree.root);
		
				  System.out.println(deep);
		}

}
