package Evision;

public class LLuseScratch {
	Node head;
	private int size = 0;
	LLuseScratch(){
		this.size = 0;
	}
	class Node{
		String data;
		Node next;
		Node(String data){
			this.data = data;
			this.next = null;
			size++;
		}
	}
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return ;
		}
		newNode.next = head;
		head = newNode;
	}
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node curNode = head;
		while(curNode.next != null) {
			curNode = curNode.next;
		}
		curNode.next = newNode;
	}
	public void removeFirst() {
		if(head == null) {
			System.out.println("empty");
			return;
		}
		size--;
		head = head.next;
	}
	public void removeLast() {
		if(head == null) {
			System.out.println("empty");
			return;
		}
		size--;
		if(head.next == null) {
			head = null;
			return;
		}
		Node last = head.next;
		Node secLast = head;
		while(last.next != null) {
			last = last.next;
			secLast = secLast.next;
		}
		secLast.next = null;
	}
	public void print() {
		if(head == null) {
			System.out.println("empty");
		}
		Node curNode = head;
		while(curNode != null) {
			System.out.print(curNode.data+" -> ");
			curNode =curNode.next;
		}
		System.out.println("null");
	}
	public int size() {
		return size;
	}
	public static void main(String[] args) {
		LLuseScratch l = new LLuseScratch();
		l.addFirst("manoj");
		l.print();
		l.addLast("prajapat");
		l.print();
		System.out.println(l.size());
		l.addLast("from");
		l.addLast("ujjian");
		l.addFirst("Ma.");
		l.print();
		System.out.println(l.size());
		l.removeFirst();
		l.print();
		l.removeLast();
		l.print();
		System.out.println(l.size());
	}
}
