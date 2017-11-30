package crackcodingLinkedlist;

public class SumNumLinkedList {

	Node AdditionLists(Node l1, Node l2){
		
        Node prev = new Node(0);
        Node head = prev;
        int carry = 0;
        int size1 = checkSize(l1);
        int size2 = checkSize(l2);
        		
       
        if(size1 != size2){
        	int diff = Math.abs(size1-size2);
        //	System.out.println(diff);
        	 if(size1 < size2)
        	  apppendDummyNodes(l1, diff);
        	 else
        		 apppendDummyNodes(l2, diff);
        	
        }
        while (l1 != null || l2 != null || carry != 0) {
            Node cur = new Node(0);
            int sum = ((l2 == null) ? 0 : l2.data) + ((l1 == null) ? 0 : l1.data) + carry;
            cur.data = sum % 10;
            carry = sum / 10;
            prev.next = cur;
            prev = cur;
            
            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }
        return head.next;
	}
	
	int checkSize(Node ll){
		
		int size =0;
		while(ll !=null){
			size++;
			ll =ll.next;
		}
		
		return size;
	}
	
	void apppendDummyNodes(Node ll, int size){
		while(ll.next !=null){
			ll =ll.next;
		}
		
		while(size !=0){
			Node n = new Node(0);
			size--;
			ll.next = n;
			ll= ll.next;
		}
	}
	
	public static void main(String args[]){
		Node n1 = new Node(8);
		int carry= 0;
		n1.appendtoTail(9);
	//	n1.appendtoTail(3);
	//	n1.appendtoTail(4);
	//	n1.appendtoTail(5);
		
		
		Node n2 = new Node(9);
	//	n2.appendtoTail(1);
	//	n2.appendtoTail(8);
	//	n2.appendtoTail(9);
	
		SumNumLinkedList sum = new SumNumLinkedList();
		Node n = sum.AdditionLists(n1, n2);
		System.out.println(n.data);
		System.out.println(n.next.data);
		System.out.println(n.next.next.data);
	//	System.out.println(n.next.next.next.data);
	//	System.out.println(n.next.next.next.next.data);
	}
}
