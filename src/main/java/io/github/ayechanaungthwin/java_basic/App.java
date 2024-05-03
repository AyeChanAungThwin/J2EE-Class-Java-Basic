package io.github.ayechanaungthwin.java_basic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

import io.github.ayechanaungthwin.java_basic.list.DoublyLinkedList;
import io.github.ayechanaungthwin.java_basic.list.Node;
import io.github.ayechanaungthwin.java_basic.list.SinglyLinkedList;

public class App {
	
    public static void main( String[] args ) {
    	//HashMapTest();
    	//HashSetTest();
    	//SinglyLinkedListTest();
    	DoublyLinkedListTest();
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
    
    public static void NodeTest() {
    	Node<Character> head = new Node<Character>('A');
    	
    	head.next = new Node<Character>('B');
    	head.next.next = new Node<Character>('C');
    	head.next.next.next = new Node<Character>('D');
    	head.next.next.next.next = new Node<Character>('E');
    	
    	System.out.println(head.data);
    	System.out.println(head.next.data);
    	System.out.println(head.next.next.data);
    	System.out.println(head.next.next.next.data);
    	System.out.println(head.next.next.next.next.data);
    }
    
    public static void SinglyLinkedListTest() {
    	SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
    	singlyLinkedList.add("A");
    	singlyLinkedList.add("B");
    	singlyLinkedList.add("C");
    	singlyLinkedList.add("D");
    	singlyLinkedList.add("E");
    	
    	singlyLinkedList.showOutput();
    	System.out.println("Size: "+singlyLinkedList.size());
    }
    
    public static void DoublyLinkedListTest() {
    	DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<>();
    
    	doublyLinkedList.add("A");
    	doublyLinkedList.add("B");
    	doublyLinkedList.add("C");
    	doublyLinkedList.add("D");
    	doublyLinkedList.add("E");
    	
    	System.out.println("Popped: "+doublyLinkedList.pop());
    	
    	doublyLinkedList.showOutput();
    }
}
