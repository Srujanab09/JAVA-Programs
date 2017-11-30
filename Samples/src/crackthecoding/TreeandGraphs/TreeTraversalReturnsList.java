package crackthecoding.TreeandGraphs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public class TreeTraversalReturnsList {
	
	public List<Integer> inorderTraversal(TreeNode root) {

	   List<Integer> list = new ArrayList<Integer>();

	    Stack<TreeNode> stack = new Stack<TreeNode>();
	    TreeNode cur = root;

	    while(cur!=null || !stack.empty()){
	        while(cur!=null){
	            stack.add(cur);
	            cur = cur.left;
	        }
	        cur = stack.pop();
	        list.add(cur.val);
	        cur = cur.right;
	    }

	    return list;

	}
	
	
	  public List<Integer> preorderTraversal(TreeNode root) {

		  List<Integer> list = new ArrayList<Integer>();
		  
		  Stack<TreeNode> stack = new Stack<TreeNode>();
		  
		  TreeNode curr = root;
		  
		  while(curr!=null)
		  {
			  list.add(curr.val);
		  			
			  if(curr.right != null){
			  
				  	stack.push(curr.right);
				  	
			  	}
			curr = curr.left;
			if(curr==null && !stack.isEmpty()){
					curr = stack.pop();
				}
		  }
		  return list;
			
	    }
	  
	  List<Integer> postOrderTraversal(TreeNode root){
		  List<Integer> list = new ArrayList<Integer>();
		
		    Stack<TreeNode> stack = new Stack<TreeNode>();
		    
		  if(root==null) {
		        return list;
		  }
		
		    stack.push(root);
		 
		    while(!stack.isEmpty()) {
		        TreeNode temp = stack.peek();
		        if(temp.left==null && temp.right==null) {
		            TreeNode pop = stack.pop();
		            list.add(pop.val);
		        }
		        else {
		            	if(temp.right!=null) {
		            		stack.push(temp.right);
		            		temp.right = null;
		            		}
		 
		            	if(temp.left!=null) {
		            		stack.push(temp.left);
		            		temp.left = null;
		            	}
		        	}
		    }
			return list;
		 
	  }
	
	void displayList(List<Integer> ll){
	    	 
	    	 for(Integer obj : ll)
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
		tree.root.right.right =new TreeNode(20);
	
		
		TreeTraversalReturnsList tt = new TreeTraversalReturnsList();
		// List<Integer> ll = tt.inorderTraversal(tree.root);
	 
		//tt.displayList(ll);
		
		// List<Integer> lll =	tt.preorderTraversal(tree.root);
//		System.out.println("============");
	//	 tt.displayList(lll);
		 
	List<Integer> llll = tt.postOrderTraversal(tree.root);
		tt.displayList(llll);
	} 
 }	
