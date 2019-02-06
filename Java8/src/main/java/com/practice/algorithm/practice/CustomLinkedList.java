package com.practice.algorithm.practice;

public class CustomLinkedList {

	private Node head;
	private Node tail;

	public CustomLinkedList(int value) {
		this.head = new Node(value);
		tail = head;
	}

	public void add(Node node) {
		tail.next = node;
		tail = node;
	}

	public void printvalue(){
       while(head != null) {
    	   System.out.println("Data : "+head.data);
    	   head = head.next;
       }   
    }

	public boolean findValue(int value) {
		while (head != null) {
			System.out.println("Data : " + head.data);
			if(head.data == value) {
				return true;
			}
			head = head.next;
		}
		return false;
	}

	public static class Node {

		private Node next;
		private int data;

		public Node(int data) {
			this.data = data;
		}

		public int data() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node next() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

	public static void main(String[] args) {
		CustomLinkedList culLinkedList = new CustomLinkedList(19);
		culLinkedList.add(new Node(20));
		culLinkedList.add(new Node(40));
		culLinkedList.add(new Node(55));
		culLinkedList.add(new Node(72));

		//culLinkedList.printvalue();
		System.out.println(culLinkedList.findValue(40));
		// System.out.println("Head : "+culLinkedList.head().data());
		// System.out.println("Tail : "+culLinkedList.tail().data());

	}
}
