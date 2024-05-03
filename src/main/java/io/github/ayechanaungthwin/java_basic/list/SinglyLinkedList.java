package io.github.ayechanaungthwin.java_basic.list;

public class SinglyLinkedList<T> {
	
	private Node<T> head;
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
		head = null;
		size = 0;
	}
	
	public void add(T data) {
		size++;
		Node<T> temp = this.head;
		if (this.head==null) {
			this.head = new Node<T>(data);
		}
		else {
			while (temp.next!=null) {
				temp = temp.next;
			}
			temp.next = new Node<T>(data);
		}
	}
	
	public void showOutput() {
		Node<T> temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public int size() {
		int size = 0;
		Node<T> temp = head;
		while(temp!=null) {
			size++;
			temp = temp.next;
		}
		return size;
	}
}
