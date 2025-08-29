package Lec47;

import java.util.*;

public class BellManFord_Algorithm {

	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public BellManFord_Algorithm(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
	}

	public List<EdgePair> getallEdge() {
		List<EdgePair> ll = new ArrayList<>();
		for (int e1 : map.keySet()) {// [1,2,3,4,5]
			for (int e2 : map.get(e1).keySet()) {
				int cost = map.get(e1).get(e2);
				ll.add(new EdgePair(e1, e2, cost));
			}
		}
		return ll;

	}

	public void BellManFord(int src) {
		int v = map.size();
		int[] dis = new int[v + 1];
		for (int i = 1; i < dis.length; i++) {
			if (i != src) {
				dis[i] = 9999999;
			}
		}
		List<EdgePair> ll = getallEdge();
		for (int i = 1; i <= v; i++) {
			for (EdgePair e : ll) {
				if (i == v && dis[e.e2] > dis[e.e1] + e.cost) {
					System.out.println("-ve wt Cycle");
					return;
				}
				if (dis[e.e2] > dis[e.e1] + e.cost) {
					dis[e.e2] = dis[e.e1] + e.cost;
				}
			}
		}
		for (int i = 1; i < dis.length; i++) {
			System.out.println(i + " " + dis[i]);
		}

	}

	class EdgePair {
		int e1, e2, cost;

		public EdgePair(int e1, int e2, int cost) {
			// TODO Auto-generated constructor stub
			this.e1 = e1;
			this.e2 = e2;
			this.cost = cost;

		}

	}

	public static void main(String[] args) {
		BellManFord_Algorithm bf = new BellManFord_Algorithm(5);
		bf.AddEdge(1, 2, 8);
		bf.AddEdge(1, 3, 4);
		bf.AddEdge(1, 4, 5);
		bf.AddEdge(2, 5, 2);
		bf.AddEdge(5, 2, 1);
		bf.AddEdge(3, 4, -3);
		bf.AddEdge(4, 5, 4);
		bf.BellManFord(1);

	}
}
