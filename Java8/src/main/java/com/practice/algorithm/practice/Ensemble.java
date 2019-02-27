package com.practice.algorithm.practice;

public enum Ensemble {

	SOLO(1),
	TRIO(3),
	DUET("HHH"),
	SIXTET(6);
	
	public final int sizeOf;
	
	private Ensemble(int size) {
		this.sizeOf = size;
	}
	
	private Ensemble(String size) {
		this.sizeOf = 5;
		System.out.println(size);
	}
	
	public int numberOfMus() {
		return sizeOf;
	}
}
