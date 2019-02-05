package com.practice.algorithm.practice;

public class BinaryNode {

	private BinaryNode left,right;
	private int data;
	
    public BinaryNode (int nData) {
    	this.data = nData;
    }
	
    public void add(int value) {
    	if(value > data) {
    		if(right == null) 
    			right = new BinaryNode(value);
    		else 
    			right.add(value);
    	}
    	else {
	        if(left == null) 
	    		left = new BinaryNode(value);
	    	else
	    		left.add(value);
    	}
    }
    
    public boolean find(int value) {
    	
    	if(value == data) return true;
    	
    	if(value > data ){
    		if(right == null) return false;
    		else  right.find(value);
    	}else {
    		if(left == null) return false;
    	    else  left.find(value);
    	}
    	return false;
    }
    
    
    public void PrintInOrder() {
    	if(left != null) {
    		left.PrintInOrder();
    	}
    	System.out.println(data);
    	
    	if(right != null) {
    		right.PrintInOrder();
    	}
    }
    
    
    public void PrintPreOrder() {
    	
    	System.out.println(data);
    	
    	if(left != null) {
    		left.PrintPreOrder();
    	}
    	if(right != null) {
    		right.PrintPreOrder();
    	}
    }
    
    public void PrintPostOrder() {
    	if(left != null) {
    		left.PrintPostOrder();
    	}
    	
    	if(right != null) {
    		right.PrintPostOrder();
    	}
    	System.out.println(data);
    	
    }
    
    public static void main(String[] args) {
		BinaryNode BNode = new BinaryNode(1);
		BNode.add(2);
		BNode.add(3);
	
		
		System.out.println("Is it available "+BNode.find(18));
		System.out.println("PrintInOrder ");
		BNode.PrintInOrder();
		System.out.println("PrintPreOrder");
		BNode.PrintPreOrder();
		System.out.println("PrintPostOrder");
		BNode.PrintPostOrder();
	}
}
