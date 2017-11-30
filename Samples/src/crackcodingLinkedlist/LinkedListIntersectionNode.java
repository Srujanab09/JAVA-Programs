package crackcodingLinkedlist;

public class LinkedListIntersectionNode {

	 public Node getIntersectionNode(Node headA, Node headB) {
	     int size1=0, size2=0;
	     
	     Node trav1 = headA;
	     Node trav2 = headB;
	     
	     while(trav1!=null){
	        size1++;
	        trav1=trav1.next;
	     }   
	    
	    while(trav2!=null){
	        size2++;
	        trav2=trav2.next;
	     }   
	     
	     if(size1> size2){
	         
	         int diff = size1 -size2;
	              trav1 = headA;
	         trav2 =headB;
	         for(int i=0; i<diff;i++){
	            
	                trav1 =trav1.next;
	         }
	         
	         while(trav1!=null && trav2!=null){
	             if(trav1.data == trav2.data)
	                return trav1;
	            trav1 = trav1.next;
	            trav2 = trav2.next;
	         }
	      return null;   
	         
	     }
	     
	     else if(size2> size1){
	         int diff = Math.abs(size2 - size1);
	         trav1 = headA;
	         trav2 =headB;
	         for(int i=0; i<diff;i++){
	            
	                trav2 =trav2.next;
	         }
	         
	         while(trav2!=null && trav1!=null){
	             if(trav2.data == trav1.data)
	                return trav1;
	            trav1 = trav1.next;
	            trav2 = trav2.next;
	         }
	      return null;   
	         
	         
	     }
	     
	     else{
	        
	        trav1 = headA;
	         trav2 =headB;
	         while(trav2!=null && trav1!=null){
	             if(trav2.data == trav1.data)
	                return trav1;
	            trav1 = trav1.next;
	            trav2 = trav2.next;
	         }
	      return null;   
	     }
	        
	    }
}
