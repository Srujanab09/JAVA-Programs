package crackcodingLinkedlist;

public class PrinthKthToLastRecursion {

	int printkthToLast(Node head, int k){
		if(head == null){
			return 0;
		}
		int index = printkthToLast(head.next, k) +1;
		if(index == k){
			System.out.println(k + "th to last node is "+ head.data);
		}
		
		return index;
	}
	
	Node nthToLast(Node head, int k){
		Node n1 = head;
		Node n2 = head;
		
		for(int i=0; i< k; i++){
			if(n1==null)
				return null;
			n1 = n1.next;
		}
		
		while(n1 != null){
			n1= n1.next;
			n2= n2.next;
		}
		
		return n2;
	}
	
	public static void main(String args[]){
		Node n = new Node(1);
		n.appendtoTail(2);
		n.appendtoTail(3);
		n.appendtoTail(4);
		n.appendtoTail(5);
		n.appendtoTail(6);
		
		PrinthKthToLastRecursion print = new PrinthKthToLastRecursion();
	int data= print.printkthToLast(n, 4);
	System.out.println(data);
	}
}
