package leetcode;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubset {
	public static List<Integer> Solution(int[] nums){
		List<Integer> out = new ArrayList<Integer>();
		if(nums.length == 0){			
			return out;
		}
		Arrays.sort(nums);
		Integer len = nums.length;
		Integer[][] record = new Integer[len][len];
		Integer[] recordLen = new Integer[len];
		record[0][0] = nums[0];
		recordLen[0] = 1;
		for(Integer i=1; i<len; i++){
			record[i][0] = nums[i];
			recordLen[i] = 1;
			Integer flag = 1;
			for(Integer j=i-1; j>=0; j--){				
				if(nums[i]%nums[j] == 0){
					if(recordLen[j]+1 > flag){
						record[i] = record[j].clone();
						recordLen[i] = recordLen[j] + 1;
						flag = recordLen[i];
						record[i][recordLen[i]-1] = nums[i];
					}
				}
			}
		}
		Integer flag = 0;
		for(Integer i=1; i<len; i++){
			if(recordLen[i]>recordLen[flag]){
				flag = i;
			}
		}
		for(Integer i=0; i< recordLen[flag]; i++){
			out.add(record[flag][i]);
		}
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
