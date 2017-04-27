package leetcode;

import java.util.*;

public class LargestValueInEachTreeRow {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        if(root == null)
        	return result;
        queue.add(root);
        while(!queue.isEmpty()) {
        	int size = queue.size();
        	int max = Integer.MIN_VALUE;
        	for(int i=0; i<size; i++) {
        		TreeNode node = queue.poll();
        		max = Math.max(max, node.val);
        		if(node.left != null)
        			queue.add(node.left);
        		if(node.right != null)
        			queue.add(node.right);
        	}
        	result.add(max);
        }
        
        return result;
    }
}

/* DFS
 * public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        helper(root, res, 0);
        return res;
    }
    private void helper(TreeNode root, List<Integer> res, int d){
        if(root == null){
            return;
        }
       //expand list size
        if(d == res.size()){
            res.add(root.val);
        }
        else{
        //or set value
            res.set(d, Math.max(res.get(d), root.val));
        }
        helper(root.left, res, d+1);
        helper(root.right, res, d+1);
    }
 * 
 */

