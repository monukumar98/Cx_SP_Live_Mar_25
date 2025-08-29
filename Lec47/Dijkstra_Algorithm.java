package Lec47;

import java.util.*;

public class Dijkstra_Algorithm {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Dijkstra_Algorithm(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public void Dijkstra(int src) {
		PriorityQueue<DijkstraPair> pq = new PriorityQueue<>(new Comparator<DijkstraPair>() {

			@Override
			public int compare(DijkstraPair o1, DijkstraPair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});

		HashSet<Integer> visited = new HashSet<>();
		pq.add(new DijkstraPair(src, "" + src, 0));
		while (!pq.isEmpty()) {
			// 1. remove
			DijkstraPair r = pq.poll();
			// 2. Ignore if Already visited
			if (visited.contains(r.vtx)) {
				continue;
			}
			// 3. Marked Visited
			visited.add(r.vtx);
			// 4. self work
			System.out.println(r);
			// 5. Add unvisited nbrs
			for (int nbrs : map.get(r.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					int cost = map.get(r.vtx).get(nbrs);
					pq.add(new DijkstraPair(nbrs, r.acqdjth + nbrs, r.cost + cost));
				}
			}
		}

	}

	class DijkstraPair {
		int vtx;
		String acqdjth;
		int cost;

		public DijkstraPair(int vtx, String acqdjth, int cost) {
			// TODO Auto-generated constructor stub
			this.vtx = vtx;
			this.acqdjth = acqdjth;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return vtx + " " + acqdjth + " @ " + cost;
		}

	}

	public static void main(String[] args) {
		Dijkstra_Algorithm dj = new Dijkstra_Algorithm(7);
		dj.AddEdge(1, 2, 2);
		dj.AddEdge(2, 3, 3);
		dj.AddEdge(1, 4, 10);
		dj.AddEdge(4, 5, 8);
		dj.AddEdge(3, 4, 1);
		dj.AddEdge(5, 6, 5);
		dj.AddEdge(5, 7, 6);
		dj.AddEdge(6, 7, 4);
		dj.Dijkstra(1);

	}
}
