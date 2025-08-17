package Lec44;

import java.util.ArrayList;

public class HashMap<K, V> {

	private class Node {
		K key;
		V value;
		Node next;
	}

	private ArrayList<Node> bukt;

	public HashMap() {
		// TODO Auto-generated constructor stub
		this(4);
	}

	public HashMap(int n) {
		// TODO Auto-generated constructor stub
		bukt = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			bukt.add(null);
		}
	}

	private int size;

	public void put(K key, V value) {
		int idx = hashfun(key);
		Node temp = bukt.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {
				temp.value = value;
				return;
			}
			temp = temp.next;
		}
		Node node = new Node();
		node.key = key;
		node.value = value;
		temp = bukt.get(idx);
		node.next = temp;
		bukt.set(idx, node);
		size++;
		double thf = 2.0;
		double lf = (1.0 * size) / bukt.size();
		if (lf > thf) {
			rehashing();
		}

	}

	private void rehashing() {
		// TODO Auto-generated method stub
		ArrayList<Node> new_bukt = new ArrayList<>();
		for (int i = 0; i < 2 * bukt.size(); i++) {
			new_bukt.add(null);
		}
		ArrayList<Node> oba = bukt;
		bukt = new_bukt;
		size = 0;
		for (Node nn : oba) {
			while (nn != null) {
				put(nn.key, nn.value);
				nn = nn.next;
			}
		}

	}

	@Override
	public String toString() {
		String s="{";
		for (Node nn : bukt) {
			while (nn != null) {
				s=s+nn.key+"="+nn.value+",";
				nn = nn.next;
			}
		}
		return s+"}";

	}

	public boolean containsKey(K key) {
		int idx = hashfun(key);
		Node temp = bukt.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public V get(K key) {
		int idx = hashfun(key);
		Node temp = bukt.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {

				return temp.value;
			}
			temp = temp.next;
		}
		return null;
	}

	public V remove(K key) {
		int idx = hashfun(key);
		Node curr = bukt.get(idx);
		Node prev = null;
		while (curr != null) {
			if (curr.key.equals(key)) {
				break;
			}
			prev = curr;
			curr = curr.next;
		}
		if (curr == null) {
			return null;
		}
		if (prev == null) {
			bukt.set(idx, curr.next);
		} else {
			prev.next = curr.next;
		}
		curr.next = null;
		size--;
		return curr.value;

	}

	public int hashfun(K key) {

		int idx = key.hashCode() % bukt.size();

		if (idx < 0) {
			idx += bukt.size();
		}
		return idx;
	}

}
