package leetcode.samples;

public class ReverseLinkedList {

	/*
	public ListNode reverseBetween(ListNode head, int m, int n) {
	    if(head == null) return null;
	    ListNode dummy = new ListNode(0); // create a dummy node to mark the head of this list
	    dummy.next = head;
	    ListNode pre = dummy; // make a pointer pre as a marker for the node before reversing
	    for(int i = 0; i<m-1; i++) 
	    	pre = pre.next;
	    
	    ListNode start = pre.next; // a pointer to the beginning of a sub-list that will be reversed
	    ListNode then = start.next; // a pointer to a node that will be reversed
	    
	    // 1 - 2 -3 - 4 - 5 ; m=2; n =4 ---> pre = 1, start = 2, then = 3
	    // dummy-> 1 -> 2 -> 3 -> 4 -> 5
	    
	    for(int i=0; i<n-m; i++)
	    {
	        start.next = then.next;
	        then.next = pre.next;
	        pre.next = then;
	        then = start.next;
	    }
	    
	    // first reversing : dummy->1 - 3 - 2 - 4 - 5; pre = 1, start = 2, then = 4
	    // second reversing: dummy->1 - 4 - 3 - 2 - 5; pre = 1, start = 2, then = 5 (finish)
	    
	    return head;
	    
	} */
	
	public ListNode reverseBetween(ListNode head) {
	    if(head == null) return null;
	    ListNode newhead = new ListNode(0); // create a dummy node to mark the head of this list
	    newhead.next = head;
	    ListNode pre = newhead; // make a pointer pre as a marker for the node before reversing
	    
	    ListNode start = pre.next; // a pointer to the beginning of a sub-list that will be reversed
	    ListNode then = start.next; // a pointer to a node that will be reversed
	       
	    while(start.next != null){
	    
	        start.next = then.next;
	        then.next = pre.next;
	        pre.next = then;
	        then = start.next;
	    }
	    	    
	    return newhead.next;
	    
	}
	
	public static void main(String args[]){
		
		ListNode l = new ListNode(1);
		l.appendtoTail(2);
		l.appendtoTail(3);
		l.appendtoTail(4);
		l.appendtoTail(5);
		l.appendtoTail(6);
		l.appendtoTail(7);
		
		ReverseLinkedList rl = new ReverseLinkedList();
		ListNode ll = rl.reverseBetween(l);
		
		System.out.println(ll.data);
		System.out.println(ll.next.data);
		System.out.println(ll.next.next.data);
		System.out.println(ll.next.next.next.data);
		System.out.println(ll.next.next.next.next.data);
		System.out.println(ll.next.next.next.next.next.data);
		System.out.println(ll.next.next.next.next.next.next.data);
	}
}
