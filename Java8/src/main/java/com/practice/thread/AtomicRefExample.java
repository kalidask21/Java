package com.practice.thread;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicRefExample {

	public static void main(String[] args) {
		
		String initialReference = "initial value referenced";

		AtomicReference<String> atomicStringReference = new AtomicReference<String>(initialReference);

		String newReference = "new value referenced";
		boolean exchanged = atomicStringReference.compareAndSet(initialReference, newReference);
		System.out.println("Value now is "+atomicStringReference.get());
		System.out.println("exchanged: " + exchanged);

		String newReference2 = "One More NEW";
		exchanged = atomicStringReference.compareAndSet(newReference, newReference2);
		System.out.println("Value now is "+atomicStringReference.get());
		System.out.println("exchanged: " + exchanged);
	}
}
