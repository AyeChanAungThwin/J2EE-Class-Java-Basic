package io.github.ayechanaungthwin.java_basic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

import io.github.ayechanaungthwin.java_basic.list.SinglyLinkedList;

public class App {
	
    public static void main( String[] args ) {
    	//HashMapTest();
    	//HashSetTest();
    	SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
    	singlyLinkedList.add("A");
    	singlyLinkedList.add("B");
    	singlyLinkedList.add("C");
    	singlyLinkedList.add("D");
    	singlyLinkedList.add("E");
    	
    	singlyLinkedList.showOutput();
    	System.out.println(singlyLinkedList.size());
    	
    	//Stack : FILO
    }
    
    public static void HashMapTest() {
    	HashMap<Integer, String> hashMap = new HashMap<>();
    	
    	hashMap.put(1, "Aye Chan");
    	hashMap.put(2, "Aung Thwin");
    	
    	for(Map.Entry out: hashMap.entrySet()) {
    		System.out.println(out.getKey()+">"+out.getValue());
    	}
    }
    
    public static void HashSetTest() {
    	HashSet<Integer> hashSet = new HashSet<>(); 
    	
    	hashSet.add(1);
    	hashSet.add(1);
    	hashSet.add(2);
    	hashSet.add(3);
    	hashSet.add(2);
    	hashSet.add(3);
    	hashSet.add(2);
    	hashSet.add(3);
    	hashSet.add(2);
    	hashSet.add(3);
    	
    	Iterator<Integer> it = hashSet.iterator();
    	
    	while (it.hasNext()) {
    		System.out.println(it.next());
    	}
    }
}
