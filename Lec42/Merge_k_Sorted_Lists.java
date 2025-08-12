package Lec42;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Merge_k_Sorted_Lists {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {
		public ListNode mergeKLists(ListNode[] lists) {
			PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
				@Override
				public int compare(ListNode o1, ListNode o2) {
					return o1.val - o2.val;
				}
			});
			for (int i = 0; i < lists.length; i++) {
				if (lists[i] != null) {
					pq.add(lists[i]);
				}
			}
			ListNode Dummy = new ListNode();
			ListNode temp = Dummy;
			while (!pq.isEmpty()) {
				ListNode node = pq.poll();
				Dummy.next = node;
				Dummy = Dummy.next;// Move krega
				if (node.next != null) {
					pq.add(node.next);
				}
			}
			return temp.next;

		}
	}

}
