package com.edu.reverse_linked_list;

class Node {
	int data;
	Node next;
	Node (int data) {
		this.data =data;
	}
}

public class LinkedList {
	static Node head;

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(5);
		
		System.out.println("Given linked list");
	    list.printList(head);
		head = list.reverseLinkedList(head);
		System.out.println("");
        System.out.println("Reversed linked list ");
		list.printList(head);
		}
	
	private Node reverseLinkedList(Node node) {
		Node prev = null, curr = node;
		while (curr != null) { 
			Node currp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = currp;
		}
		node = prev;
		return node;
	}
	
	private void printList(Node node) {
		
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
}
