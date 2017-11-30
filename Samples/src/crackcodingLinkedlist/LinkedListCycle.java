package crackcodingLinkedlist;

public class LinkedListCycle {

	boolean checkForCycle(Node head){
		
		Node slower= head;
		Node runner = head;
		
		while(runner.next!=null && runner.next.next !=null){
		
			slower = slower.next;
			runner= runner.next.next;
			if(runner == slower){
				System.out.println(runner.data);
				System.out.println(slower.data);
				return true;
			}
			
		
		}
		
		
		return false;
	}
	
	public static void main(String args[]){
		
		Node l = new Node(3);
		l.appendtoTail(5);
		l.appendtoTail(8);
		l.appendtoTail(5);
		l.appendtoTail(10);
		l.appendtoTail(2);
		l.appendtoTail(1);
		l.appendtoTail(l.data);
	
		LinkedListCycle ll = new LinkedListCycle();
		if(ll.checkForCycle(l))
			System.out.println("true");
		else
			System.out.println("false");
	}
}
