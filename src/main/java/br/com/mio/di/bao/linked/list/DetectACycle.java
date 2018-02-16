package br.com.mio.di.bao.linked.list;

public class DetectACycle {

	public static boolean hasCycle(Node head) {
	    if(head == null || head.next == null) {
	        return false;
	    }
	    Node actual = head;
	    Node next = head.next;
	    while(actual != next) {
	        if(next == null || next.next == null) {
	            return false;
	        }
            actual = actual.next;
            next = next.next.next;
	    }
	    return true;
	}
	
	public static void main(String[] args) {
		Node node = new Node(1);
		Node n2 = node.next = new Node(2);
		Node n3 = n2.next = new Node(3);
		n3.next = n2;
		System.out.println(hasCycle(n3));
	}
	
}


class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
    
}