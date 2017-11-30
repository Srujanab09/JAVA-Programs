package crackthecoding.TreeandGraphs;

public class LowestCommonAncestorinBST {

	/*
	 * We can solve this problem using BST properties. 
	 *	 We can recursively traverse the BST from root. The main idea of the solution is, while traversing from top to bottom,
	 *  the first node n we encounter with value between n1 and n2, i.e., 
	 *  n1 < n < n2 or same as one of the n1 or n2, is LCA of n1 and n2 (assuming that n1 < n2). 
	 *  So just recursively traverse the BST in, if node’s value is greater than both n1 and n2 then our LCA lies in left side of the node, if it’s is smaller than both n1 and n2, then LCA lies on right side. Otherwise root is LCA (assuming that both n1 and n2 are present in BST)
	 * 
	 */
	TreeNode findLCA(TreeNode root, int n1, int n2){
		
		if (root == null)
            return null;
  
        // If both n1 and n2 are smaller than root, then LCA lies in left
        if (root.val > n1 && root.val > n2)
            return findLCA(root.left, n1, n2);
  
        // If both n1 and n2 are greater than root, then LCA lies in right
        if (root.val < n1 && root.val < n2) 
            return findLCA(root.right, n1, n2);
  
        return root;
	}
	
	TreeNode findLCAWithOutRecurssion(TreeNode root, int n1, int n2){
		if(root ==null)
			return null;
		
		while(root!=null){
					
			if(root.val > n1 && root.val >n2){
				System.out.println("hii");
				root = root.left;
			}
			else if(root.val < n1 && root.val < n2){
				System.out.println("hello");
				root = root.right;
			}
			else
				return root;
			
		}
		
		return root;
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
		
		
	LowestCommonAncestorinBST lca = new LowestCommonAncestorinBST();
	TreeNode node = lca.findLCAWithOutRecurssion(tree.root, 12, 4);
	 System.out.println(node.val);
	}
}
