package Lec40;

public class LinkedList<T> {
	private class Node {
		T val;
		Node next;

	}

	private Node head;
	private Node tail;
	private int size;

	// O(1)
	public int size() {
		return size;
	}

	// O(1)
	public void addFirst(T item) {
		Node nn = new Node();
		nn.val = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;

		}

	}

	// O(1)
	public void addLast(T item) {
		if (size == 0) {
			addFirst(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;
		}

	}

	// O(N)
	public void addatindex(T item, int idx) {
		if (idx == 0) {
			addFirst(item);
		} else if (idx == size) {
			addLast(item);

		} else {
			Node nn = new Node();
			nn.val = item;
			Node prev = getNode(idx - 1);
			nn.next = prev.next;
			prev.next = nn;
			size++;
		}

	}

	// O(1)
	public T getfirst() {
		return head.val;
	}

	// O(1)
	public T getlast() {
		return tail.val;
	}

	// O(N)
	public T getatindex(int idx) {
		return getNode(idx).val;
	}

	// O(1)
	public T removefirst() {
		Node nn = head;
		if (size == 1) {
			head = null;
			tail = null;
			size--;
		} else {
			head = head.next;
			nn.next = null;
			size--;
		}
		return nn.val;
	}

	// O(N)
	public T removelast() {
		if (size == 1) {
			return removefirst();
		} else {
			Node sl = getNode(size - 2);
			T val = tail.val;// 50
			sl.next = null;
			tail = sl;
			size--;
			return val;
		}

	}

	// O(N)
	public T removeatindex(int k) {
		if (k == 0) {
			return removefirst();
		} else if (k == size - 1) {
			return removelast();
		} else {
			Node prev = getNode(k - 1);
			Node curr = prev.next;
			prev.next = curr.next;
			curr.next = null;
			size--;
			return curr.val;
		}

	}

	// O(N)
	private Node getNode(int k) {
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.println(".");
	}
	
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.addLast("Raj");
		ll.addLast("Kunal");
		ll.addLast("Ankita");
		ll.Display();
	}

}