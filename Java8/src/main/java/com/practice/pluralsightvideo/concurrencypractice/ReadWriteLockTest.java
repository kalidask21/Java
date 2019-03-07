package com.practice.pluralsightvideo.concurrencypractice;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockTest {

	public static void main(String[] args) {
		ReadWriteLockMap<String, String> safelyMap = new ReadWriteLockMap();
		safelyMap.add("1", "EMP1");
		safelyMap.add("2", "EMP2");
		System.out.println(safelyMap.get("2"));
		safelyMap.add("3", "EMP3");
		safelyMap.add("4", "EMP4");
		System.out.println(safelyMap.get("4"));

	}
}

class ReadWriteLockMap<K, V> {

	private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
	private Lock ReadLock = readWriteLock.readLock();
	private Lock WriteLock = readWriteLock.writeLock();
	private final Map<K, V> map = new HashMap<K, V>();

	public void add(K key, V value) {
		try {
			WriteLock.lock();
			map.put(key, value);
		} finally {
			WriteLock.unlock();
		}
	}

	public V get(K key) {
		try {
			ReadLock.lock();
			return map.get(key);
		} finally {
			ReadLock.unlock();
		}
	}

}
