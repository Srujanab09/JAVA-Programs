package crackthecoding.linkedlist;
import crackthecoding.linkedlist.RemoveDuplicates;
	public class LinkedListCreationDeletion{
		Node head;
		Node tail;
		int size =0;
		
		Node returnHead(){
			return head;
		}
		void insertAtStart(int data){
			Node newnode = new Node();
			newnode.setData(data);
			size++;
			if(head == null){
				head = newnode;
				tail = newnode;
			}
			else{
				newnode.next =head;
				head = newnode;
			}	
		}
		void insertAtEnd(int data){
			Node newnode = new Node();
			size++;
			newnode.setData(data);
			if(head== null){
				  head = newnode;
				 tail = newnode;
			
			}
			else{
				tail.next = newnode;
				tail = newnode;
				//newnode.next = null;
			}
 		}
		
		void insertAtPosition(int at, int data){
			Node traverse;
			traverse= head;
			Node newnode = new Node();
			newnode.setData(data);
			int count=1;
			if(at==0 )
				System.out.println("Cannot be inserted");
			else if( at==1){
				insertAtStart(data);
			}
			else if(at==size+1){
				insertAtEnd(data);
			}
			else if(at <= size){
				while(count+1!=at){
					count++;
					traverse= traverse.next;
				}
				System.out.println(traverse.data);
				newnode.next = traverse.next;
				traverse.next = newnode;
			}
			else{
				System.out.println("Canot be inserted at that position");
			}
			
		}
		
		boolean deleteAtStart(){
			
			
			if(head == null){
		//		System.out.println("dddd");
				return false;
			}
			else{
				size--;
			head = head.next;
			return true;
			}
		}
		
		boolean deleteAtEnd(){
			
			if(head == null || tail ==null){
			
				return false;
			}
			else if(head == tail){
				head = null;
				tail = null;
				size--;
				return true;
			}
			else{
			Node traverse;
			traverse = head;
			while( traverse.next != tail || head== tail){
				 traverse = traverse.next;
			}			
			size--;
			tail = traverse;
			tail.next = null;
			
			return true;
			}
		}
		
		void display(){
		Node traverse;
		traverse = head;
		//System.out.println(size);
		while(traverse != null){
			System.out.println("traversing " + traverse.data);
			traverse= traverse.next;
		}
	}
	
	public static void main(String args[]){
		
		LinkedListCreationDeletion ll = new LinkedListCreationDeletion();
		
		ll.insertAtStart(1);
		ll.insertAtStart(2);
		ll.insertAtStart(3);
		ll.insertAtStart(4);
		//ll.insertAtEnd(3);
		//ll.display();
		ll.insertAtEnd(0);
		ll.insertAtEnd(-1);
		ll.insertAtEnd(-2);
		
		ll.insertAtStart(3);
		ll.insertAtStart(2);
		ll.insertAtStart(1);
		//ll.insertAtPosition(1, 0);
		ll.display();
		RemoveDuplicates rd = new RemoveDuplicates();
		
		//rd.remDup(ll.returnHead());
		rd.remDupNoBuffer(ll.returnHead());
		System.out.println("=====");
		ll.display();
	}
}
