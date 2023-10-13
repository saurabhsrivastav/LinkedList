package com.edu.add_at_first_position;

public class LinkedList {
	static Node head;

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addAtFront(6);
		list.addAtFront(5);
		
		System.out.print(
	            "After inserting nodes at their front: ");
	        list.printList();
	}

	public void addAtFront(int n) {
		
		Node newNode = new Node();
		if (head == null || n < head.data) {
			newNode.data = n;
			newNode.next = head;
			head = newNode;
		}
	}
	
	void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

}

class Node {
	int data;
	Node next;

}
