package com.practice.pluralsightvideo.concurrencypractice;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class CollectionTest {

	public static void main(String[] args) {
     
		List<String> l1 = new ArrayList<>();
		List<String> l2 = new LinkedList<>();
		Set<String> s1 = new HashSet<>();
		Set<String> s2 = new LinkedHashSet<>();
	    Map<String,String> map1 = new HashMap<>();
	    Map<String,String> map2 = new LinkedHashMap<>();
	    
	    // Concurrent
	    Queue<String> q = new LinkedList<>();
	    Deque<String> dq = new LinkedList<>();
	    
	    List<String> l3 = new CopyOnWriteArrayList<>();
	    Set<String> s3 = new CopyOnWriteArraySet<>();
	    Queue<String> l4 = new ConcurrentLinkedQueue();
	    ConcurrentHashMap<String,String> map3 = new ConcurrentHashMap<>();
	   // map3
	    
	    
		new TestDoubleEndedQueue().TestQueue();
	}
	
	
	
	
}
class TestDoubleEndedQueue{
	
	private Deque<String> deque = new LinkedList<String>();
	
	public void TestQueue() {
		
		
		 deque.add("B");
		 deque.addFirst("A");
		 deque.addLast("Z");
		 deque.offer("C");
		 deque.offerFirst("AA");
		 deque.offerLast("ZZ");
		 
		 deque.forEach(System.out::println);
		
	}
	
	
}