package Lec37;

import java.util.*;

public class Binary_Tree_Right_Side_View {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		int max_depth = -1;

		public List<Integer> rightSideView(TreeNode root) {
			List<Integer> ll = new ArrayList<>();
			rightView(root, 0, ll);// ll data add kr diya 
			return ll;
		}

		public void rightView(TreeNode root, int curr_level, List<Integer> ll) {
			if (root == null) {
				return;
			}

			if (max_depth < curr_level) {
				// data store
				ll.add(root.val);
				max_depth = curr_level;
			}

			rightView(root.right, curr_level + 1, ll);
			rightView(root.left, curr_level + 1, ll);

		}
	}
}
