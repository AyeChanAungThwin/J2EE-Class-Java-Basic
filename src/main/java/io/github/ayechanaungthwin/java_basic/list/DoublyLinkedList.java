package io.github.ayechanaungthwin.java_basic.list;

public class DoublyLinkedList<T> {

	private Node<T> head, tail;
	private int size;

	private class Node<T> {
		private T data;
		private Node<T> prev;
		private Node<T> next;

		private Node(T data) {
			this.data = data;
			this.prev = null;
			this.next = null;
		}
	}

	public DoublyLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}

	public void add(T data) {
		size++;
		if (this.head == null) {
			this.head = new Node<>(data);
			this.tail = head;
		} 
		else {
			Node<T> newNode = new Node<>(data);
			newNode.prev = tail;
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public T pop() {
		T data = tail.data;
		Node<T> prevNode = tail.prev;
		if (prevNode!=null) {
			prevNode.next = null;
			this.tail = prevNode;
		}
		else {
			this.head = null;
		}
		return data;
	}

	public void showOutput() {
		Node<T> temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public int size() {
		int size = 0;
		Node<T> temp = head;
		while (temp != null) {
			size++;
			temp = temp.next;
		}
		return size;
	}
}
