package leetcode;

import java.util.*;
/*
 * https://discuss.leetcode.com/topic/46162/a-general-approach-to-backtracking-questions-in-java-subsets-permutations-combination-sum-palindrome-partioning
 */
public class Permutations {
	public static List<List<Integer>> permute(int[] nums) {
		LinkedList<List<Integer>> res = new LinkedList<List<Integer>>();
		res.add(new ArrayList<Integer>());
		for(int n: nums){
			int size = res.size();
			for(; size>0; size--) {
				List<Integer> temp = res.pollFirst();
				for(int i=0; i<=temp.size(); i++) {
					List<Integer> list= new ArrayList<>(temp);
					list.add(i, n);
					res.add(list);
				}
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int[] nums = {1, 2, 3};
		List<List<Integer>> res = permute(nums);
		System.out.println(res);
	}
}

