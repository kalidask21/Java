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

	public int findMiddle() {
		Node onejumpHead = head;
		Node twojumpHead = head;
		
		while (twojumpHead != null && twojumpHead.next !=null ) {
			twojumpHead = twojumpHead.next.next;
			onejumpHead = onejumpHead.next;
		}
		return onejumpHead.data;
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
	
	
	public void deleteValue(int value) {
		if(head.data == value) {
			head = head.next;
		}
		while (head != null && null != head.next) {
			System.out.println("Data : " + head.data);
			if(head.next.data == value) {
				//System.out.println("Data : " + head.next.data);
				head = head.next.next;				
			}else {
				head = head.next;
			}
		}
	}

	public static class Node {

		private Node next;
		private int data;

		public Node(int data) {
			this.data = data;
		}


	}

	public static void main(String[] args) {
		CustomLinkedList culLinkedList = new CustomLinkedList(19);
		culLinkedList.add(new Node(20));
		culLinkedList.add(new Node(40));
		culLinkedList.add(new Node(55));
		culLinkedList.add(new Node(72));
		culLinkedList.add(new Node(79));
		culLinkedList.add(new Node(90));

		//
		culLinkedList.deleteValue(79);
		culLinkedList.printvalue();
		// System.out.println("Head : "+culLinkedList.head().data());
		// System.out.println("Tail : "+culLinkedList.tail().data());

	}
}
