package com.practice.thread;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//This class has a list, producer (adds items to list
// and consumber (removes items).
public class PCLockInterface
{
    // Create a list shared by producer and consumer
    // Size of list is 2.
    LinkedList<Integer> list = new LinkedList<>();
    int capacity = 2;
    private Lock lockObj = new ReentrantLock();
    private Condition condition = lockObj.newCondition();

    // Function called by producer thread
    public void produce() throws InterruptedException
    {
        int value = 0;
        while (true)
        {
        	
            try{
            	lockObj.lock();
                // producer thread waits while list
                // is full
                while (list.size()==capacity)
                	condition.await();

                System.out.println("Producer produced-"
                                              + value);

                // to insert the jobs in the list
                list.add(value++);

                // notifies the consumer thread that
                // now it can start consuming
                condition.signal();

                // makes the working of program easier
                // to  understand
                Thread.sleep(1000);
           }
           finally {
			   lockObj.unlock();	
           }
        }
    }

    // Function called by consumer thread
    public void consume() throws InterruptedException
    {
        while (true)
        {
           
        	 try{
              	lockObj.lock();
                // consumer thread waits while list
                // is empty
                while (list.size()==0)
                	condition.await();

                //to retrive the ifrst job in the list
                int val = list.removeFirst();

                System.out.println("Consumer consumed-"
                                                + val);

                // Wake up producer thread
                condition.signal();

                // and sleep
                Thread.sleep(1000);
            }finally {
 			   lockObj.unlock();	
            }
        }
    }
}
