package leetcode;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestDivisibleSubset2 {
	public static List<Integer> Solution(int[] nums){
		List<Integer> out = new ArrayList<Integer>();
		if(nums.length == 0){			
			return out;
		}
		Arrays.sort(nums, 0, nums.length);
		int len = nums.length;
		int[] parent = new int[len];
		int[] count = new int[len];
		int max = 0, maxind = -1;
		for(int i=0; i<len; i++){
			for(int j=i; j>=0; j--){				
				if(nums[i]%nums[j] == 0 && count[i] < count[j]+1 ){
					count[i] = count[j] + 1;
					parent[i] = j;
					if(count[i] > max){
						max = count[i];
						maxind = i;
					}
				}
			}
		}
		for(int i=0; i<max; i++){
			out.add(nums[maxind]);
			maxind = parent[maxind];
		}
		Collections.sort(out);
		return out;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		List<Integer> input = new ArrayList<Integer>();
		while(in.hasNextInt()){
			int i = in.nextInt();
			input.add(i);
		}
		int[] nums = new int[input.size()];
		for(int i=0; i<input.size();i++){
			nums[i] = input.get(i);
		}
		List<Integer> out = Solution(nums);
		System.out.println(out);
	}
}
