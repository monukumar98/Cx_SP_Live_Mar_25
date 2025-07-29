package Lec39;

public class Validate_Binary_Search_Tree {
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
		public boolean isValidBST(TreeNode root) {
			return ValidBST(root).isBST;

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
			sbp.isBST = lbp.isBST && rbp.isBST && lbp.max < root.val && rbp.min > root.val;
			return sbp;
		}

		class BSTPair {
			boolean isBST = true;
			long max = Long.MIN_VALUE;
			long min = Long.MAX_VALUE;
		}
	}
}
