package crackthecoding.TreeandGraphs;

public class SuccessorPredecessor {

	public TreeNode successor(TreeNode root, TreeNode p) {
		  if (root == null)
		    return null;

		  if (root.val <= p.val) {
		    return successor(root.right, p);
		  } else {
		    TreeNode left = successor(root.left, p);
		    return (left != null) ? left : root;
		  }
		}
	
	
	
	public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
	    TreeNode succ = null;
	    while (root != null) {
	        if (root.val <= p.val) {
	            root = root.right;
	        }
	        else{
	        	succ = root;
	        	root = root.left;
	        }
	            
	    }
	    return succ;
	
	}
	
	public TreeNode predecessor(TreeNode root, TreeNode p) {
		  if (root == null)
		    return null;

		  if (root.val >= p.val) {
		    return predecessor(root.left, p);
		  } else { 
		    TreeNode right = predecessor(root.right, p);
		    return (right != null) ? right : root;
		  }
		}
	public TreeNode inorderPredecessor(TreeNode root, TreeNode p){
		TreeNode pred = null;
		
		while(root!=null){
			
			if(root.val >= p.val){
			
			root = root.left;	
			}
			else{
				pred = root;
				root = root.right;
			}
			
		}
		
		return pred;
	}
	
	private TreeNode search(int searchval, TreeNode root){
	    if(root != null)
	    {
	        	if(root.val == searchval)
	        		{
	        			return root;
	        		} 
	        	else 
	        		{
	        			TreeNode foundNode = search(searchval, root.left);
	            		if(foundNode == null) 
	            		{
	            			foundNode = search(searchval, root.right);
	            		}
	            		return foundNode;
	        		}
	    }
	    else 
	    {
	        return null;
	    }
	}
	
	public static void main(String args[]){
		
		BinaryTree tree = new BinaryTree();
		
		tree.root = new TreeNode(20);
	
		tree.root.left = new TreeNode(8);
		
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(12);
		tree.root.left.right.left = new TreeNode(10);
		tree.root.left.right.right = new TreeNode(14);
		
		
		tree.root.right = new TreeNode(22);
		tree.root.right.left = new TreeNode(21);
		tree.root.right.right =new TreeNode(25);
		
		
		SuccessorPredecessor sp = new SuccessorPredecessor();
		TreeNode node  = sp.search(14, tree.root);
		//TreeNode Resultnode = sp.inorderSuccessor(tree.root, node);
		TreeNode Resultnode = sp.inorderPredecessor(tree.root, node);
		
		System.out.println(Resultnode.val);
	}
}
