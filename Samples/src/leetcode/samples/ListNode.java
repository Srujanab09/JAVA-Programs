package leetcode.samples;

import crackcodingLinkedlist.Node;

public class ListNode {

	ListNode next = null;
	
	int data;
	ListNode(){
		
	}
	
	public ListNode(int d){
		data =d;
	}
	
	void appendtoTail(int d){
		ListNode end = new ListNode(d);
		
		ListNode n = this;
		//System.out.println(n.data);
		while(n.next != null){
			n = n.next;
	//		System.out.println("in while" + n.data);
		}
		n.next = end;
//		System.out.println(end.data);
	}
	
}
