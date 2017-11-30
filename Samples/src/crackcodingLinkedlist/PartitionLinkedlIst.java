package crackcodingLinkedlist;

import leetcode.samples.ListNode;
import leetcode.samples.ReverseLinkedList;

public class PartitionLinkedlIst {

 /*
  *  input : 3- > 5- > 8 -> 5 -> 10 -> 2 -> 1
  *  output: 3- > 1 -> 2 -> 10 -> 5 -> 5 ->8
  * 	
  */
	Node partition(Node node, int x){
		Node head = node;
		Node tail = node;
		
		while(node != null){
			Node nextt = node.next;
			if(node.data < x){
				node.next = head; 
				head = node;
			}
			if(node.data >= x){
			
				tail.next = node;
				tail = node;
			}
			node = nextt;
		}
		tail.next = null;
		
		return head;
	}

public static void main(String args[]){
		
		Node l = new Node(3);
		l.appendtoTail(5);
		l.appendtoTail(8);
		l.appendtoTail(5);
		l.appendtoTail(10);
		l.appendtoTail(2);
		l.appendtoTail(1);
		
		PartitionLinkedlIst rl = new PartitionLinkedlIst();
		Node ll = rl.partition(l, 4);
		
		System.out.println(ll.data);
		System.out.println(ll.next.data);
		System.out.println(ll.next.next.data);
		System.out.println(ll.next.next.next.data);
		System.out.println(ll.next.next.next.next.data);
		System.out.println(ll.next.next.next.next.next.data);
		System.out.println(ll.next.next.next.next.next.next.data);
	}

	
}
