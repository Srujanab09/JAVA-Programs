package crackcodingLinkedlist;

public class Node {

	Node next = null;
	
	int data;
	Node(){
		
	}
	
	public Node(int d){
		data =d;
	}
	
	void appendtoTail(int d){
		Node end = new Node(d);
		
		Node n = this;
		System.out.println(n.data);
		while(n.next != null){
			n = n.next;
		System.out.println("in while" + n.data);
		}
		n.next = end;
		System.out.println(end.data);
	}
	
	public static void main(String args[]){
		Node n = new Node(1);
		n.appendtoTail(2);	
		n.appendtoTail(3);
		n.appendtoTail(4);
	}
	
}
