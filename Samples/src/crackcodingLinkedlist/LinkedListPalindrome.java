package crackcodingLinkedlist;

import java.util.Stack;

public class LinkedListPalindrome {

	boolean checkPlaindrome(Node head){
		
		if(head == null || head.next == null){
			return true;
		}
		
		Stack<Integer> stack = new Stack<>();
		
		Node Current = head;
		Node Runner = head;
		
		while(Runner!=null && Runner.next!=null)
		{
				stack.push(Current.data);
				Current = Current.next;
				Runner = Runner.next.next;
		}
		
		if(Runner!=null){
					Current = Current.next;
			}
	
			while(Current!=null){
		
				if(Current.data == stack.peek()){
					stack.pop();
					}
				else{
					
					return false;
				}
			Current =Current.next;
			}

	 return true;
	}
	
public static void main(String args[]){
		
		Node l = new Node(1);
		l.appendtoTail(2);
		l.appendtoTail(3);
		l.appendtoTail(4);
		//l.appendtoTail(5);
		l.appendtoTail(3);
		l.appendtoTail(2);
		l.appendtoTail(1);
		//l.appendtoTail(5);
		LinkedListPalindrome ll = new LinkedListPalindrome();
		if(ll.checkPlaindrome(l))
			System.out.println("true");
		else
			System.out.println("false");
	}
}
