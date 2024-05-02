package io.github.ayechanaungthwin.java_basic.list;

public class SinglyLinkedList<T> {
	
	private Node<T> header;
	private int size;
	
	private class Node<T> {
		private T data;
		private Node<T> next;
		
		private Node(T data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public SinglyLinkedList() {
		header = null;
		size = 0;
	}
	
	public void add(T data) {
		size++;
		Node<T> temp = header;
		if (header==null) {
			header = new Node<T>(data);
		}
		else {
			while (temp.next!=null) {
				temp = temp.next;
			}
			temp.next = new Node<T>(data);
		}
	}
	
	public void showOutput() {
		Node<T> temp = header;
		while(temp.next!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
	
	public int size() {
		int size = 0;
		Node<T> temp = header;
		while(temp.next!=null) {
			size++;
			temp = temp.next;
		}
		size++;
		return size;
	}
}
