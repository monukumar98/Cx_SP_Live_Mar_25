package Lec42;

import java.util.*;

public class Heap {
	private List<Integer> ll = new ArrayList<>();

	public void add(int item) {
		ll.add(item);
		upheapify(ll.size() - 1);
	}

	private void upheapify(int ci) {
		// TODO Auto-generated method stub
		int pi = (ci - 1) / 2;
		if (ll.get(pi) > ll.get(ci)) {
			swap(pi, ci);
			upheapify(pi);
		}

	}

	private void swap(int pi, int ci) {
		int pith = ll.get(pi);
		int cith = ll.get(ci);
		ll.set(pi, cith);
		ll.set(ci, pith);
	}

	public int get() {
		return ll.get(0);
	}

	public int size() {
		return ll.size();
	}

	public void Display() {
		System.out.println(ll);
	}

	public int remove() {
		swap(0, ll.size() - 1);
		int v = ll.remove(ll.size() - 1);
		downheapify(0);
		return v;
	}

	private void downheapify(int pi) {
		// TODO Auto-generated method stub
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int mini = pi;
		if (lci < ll.size() && ll.get(mini) > ll.get(lci)) {
			mini = lci;
		}
		if (rci < ll.size() && ll.get(mini) > ll.get(rci)) {
			mini = rci;
		}
		if (mini != pi) {
			swap(pi, mini);
			downheapify(mini);

		}

	}
}

