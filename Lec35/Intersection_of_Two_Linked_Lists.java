package Lec35;

public class Intersection_of_Two_Linked_Lists {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public class Solution {
		public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
			ListNode ved = headA;
			ListNode vgf = headB;
			while (ved != vgf) {
				if (ved == null) {
					ved = headB;
				} else {
					ved = ved.next;
				}
				if (vgf == null) {
					vgf = headA;
				} else {
					vgf = vgf.next;
				}

			}
			return ved;

		}
	}
}
