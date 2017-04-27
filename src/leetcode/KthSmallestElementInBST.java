package leetcode;

import java.util.*;


public class KthSmallestElementInBST {
	public class TreeNode {
		int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	public int kthSmallest(TreeNode root, int k) {
		int count = countNodes(root.left);
		if(k <= count) 
			return kthSmallest(root.left, k);
		else if(k > count + 1)
			return kthSmallest(root.right, k-count-1);
		return root.val;
	}
	public int countNodes(TreeNode node) {
		if(node == null)
			return 0;
		return 1 + countNodes(node.left) + countNodes(node.right);
	}
}

/*
	public int kthSmallest(TreeNode root, int k) {
		List<Integer> values = new ArrayList<>();
		addValue(values, root);
		Collections.sort(values);
		return values.get(k-1);
	}
	public void addValue(List<Integer> list, TreeNode node) {
		list.add(node.val);
		if(node.left != null)
			addValue(list, node.left);
		if(node.right != null)
			addValue(list, node.right);
	}
*/