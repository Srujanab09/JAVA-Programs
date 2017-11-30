package crackcodingLinkedlist;

public class DeleteMiddleNode {

	boolean deletenode(Node n){
		
		if(n == null || n.next == null){
			return false;
		}
		Node nn = n.next;
		n.data = nn.data;
		n.next = nn.next;
		
		return true;
	}
}
