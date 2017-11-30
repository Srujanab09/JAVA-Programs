package crackthecoding.TreeandGraphs;

public class MaxDepthBinaryTree {

	public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
	
public static void main(String args[]){
		
		BinaryTree tree = new BinaryTree();
		
		tree.root = new TreeNode(8);
		
		tree.root.left = new TreeNode(4);
		tree.root.right = new TreeNode(10);
		tree.root.left.left = new TreeNode(2);
		tree.root.left.right = new TreeNode(6);
		tree.root.right.right =new TreeNode(20);
	
		   MaxDepthBinaryTree depth = new MaxDepthBinaryTree();
		   
			  int deep = depth.maxDepth(tree.root);
	
			  System.out.println(deep);
	}

}