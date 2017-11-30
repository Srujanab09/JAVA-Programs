package crackthecoding.TreeandGraphs;

import java.util.ArrayList;
import java.util.List;

public class TreeTraversals {

	  List<Integer> result = new ArrayList<Integer>();
	public int inOrderTraversal(TreeNode root){
              
		 int count=0; 
	        while(root!=null){
	        	inOrderTraversal(root.left);
	    		System.out.println(root.val+ count++);
	            inOrderTraversal(root.right);
	        }
	        return count;
        
        
	}
	
	public void preOrderTraversal(TreeNode root){
		
		
		if(root !=null){
			result.add(root.val);
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
	
     void displayList(){
    	 
    	 for(Integer obj : result)
    		 System.out.println(obj);
    	 System.out.println("=============");
     }

	public static void main(String args[]){
	
		BinaryTree tree = new BinaryTree();
		
		tree.root = new TreeNode(8);
	
		tree.root.left = new TreeNode(4);
		tree.root.right = new TreeNode(10);
		tree.root.left.left = new TreeNode(2);
		tree.root.left.right = new TreeNode(6);
		
		tree.root.right.left = new TreeNode(9);
		tree.root.right.right =new TreeNode(20);
		
		TreeTraversals tt = new TreeTraversals();
		int count=  tt.inOrderTraversal(tree.root);
	 
		System.out.println(count);
		//tt.displayList();
		
		//tt.preOrderTraversal(tree.root);
		//System.out.println("============");
	//	tt.displayList();
	//	tt.postOrderTraversal(tree.root);
	}
}
