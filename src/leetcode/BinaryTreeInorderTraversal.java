package leetcode;

import java.util.*;

public class BinaryTreeInorderTraversal {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result= new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root;
        while(current != null || !stack.isEmpty()) {
        	while(current != null) {
        		stack.add(current);
        		current = current.left;
        	}
        	current = stack.pop();
        	result.add(current.val);
        	current = current.right;
        }
		return result;
    }
	public static void main(String[] args) {
	}
}
