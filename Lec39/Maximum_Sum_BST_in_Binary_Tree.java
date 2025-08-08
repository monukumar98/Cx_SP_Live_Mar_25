package Lec39;

import Lec39.Validate_Binary_Search_Tree.TreeNode;
import Lec39.Validate_Binary_Search_Tree.Solution.BSTPair;

public class Maximum_Sum_BST_in_Binary_Tree {
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
		public int maxSumBST(TreeNode root) {
			return ValidBST(root).ans;
		}

		public BSTPair ValidBST(TreeNode root) {
			if (root == null) {
				return new BSTPair();
			}
			BSTPair lbp = ValidBST(root.left);
			BSTPair rbp = ValidBST(root.right);
			BSTPair sbp = new BSTPair();
			sbp.min = Math.min(root.val, Math.min(lbp.min, rbp.min));
			sbp.max = Math.max(root.val, Math.max(lbp.max, rbp.max));
			sbp.sum = lbp.sum + rbp.sum + root.val;
			sbp.isBST = lbp.isBST && rbp.isBST && lbp.max < root.val && rbp.min > root.val;
			if (sbp.isBST) {
				sbp.ans = Math.max(sbp.sum, Math.max(lbp.ans, rbp.ans));

			} else {
				sbp.ans = Math.max(lbp.ans, rbp.ans);
			}
			return sbp;
		}

		class BSTPair {
			boolean isBST = true;
			long max = Long.MIN_VALUE;
			long min = Long.MAX_VALUE;
			int sum = 0;
			int ans = 0;
		}
	}

}
