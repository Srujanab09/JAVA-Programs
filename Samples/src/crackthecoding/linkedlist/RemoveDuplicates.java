package crackthecoding.linkedlist;

import java.util.HashSet;

public class RemoveDuplicates {

	void remDup(Node n){
		HashSet<Integer> hs = new HashSet<Integer>();
		Node previous = null;
		while(n!=null){
			if(hs.contains(n.getData())){
				previous.next = n.next;
			}
			else{
				hs.add(n.data);
				 previous =n;
			}
			n = n.next;
		}	
	}
	void remDupNoBuffer(Node n){
		Node current = n;
		while(current!= null){
			Node runner = current;
			while(runner.next != null){
				if(runner.next.data == current.data){
					runner.next = runner.next.next;
				}
				else{
					runner = runner.next;
				}
				
			}
			current= current.next;
		}
		
	}
}
