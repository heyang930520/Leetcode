package leetcode;

import java.util.*;

public class BotomLeftTreeValue {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	int height = 0, result = 0;
	public int findBottomLeftValue(TreeNode root) {
		findLeftValue(root, 1);
		return result;
		
	}
	public void findLeftValue(TreeNode node, int depth) {
		if(height < depth) {
			result = node.val;
			height = depth;
		}
		if(node.left != null) 
			findLeftValue(node.left, depth+1);
		if(node.right != null)
			findLeftValue(node.right, depth+1);
	}
}

/*
 * Queue<TreeNode> queue = new LinkedList<>();
		int depth = 0;
		queue.add(root);
		while(!queue.isEmpty()) {
			root = queue.poll();
			if(root.right != null)
				queue.add(root.right);
			if(root.left != null)
				queue.add(root.left);
		}
		return root.val;
 */
