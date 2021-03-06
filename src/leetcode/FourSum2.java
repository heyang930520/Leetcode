package leetcode;

import java.util.*;

public class FourSum2 {
	public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
		Map<Integer,Integer> sums = new HashMap<>();
		int count = 0;
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<B.length; j++) {
				int sum = A[i] + B[j];
				if(sums.containsKey(sum))
					sums.put(sum, sums.get(sum)+1);
				else
					sums.put(sum, 1);
			}
		}
		for(int i=0; i<C.length; i++) {
			for(int j=0; j<D.length; j++){
				int sum = -(C[i] + D[j]);
				if(sums.containsKey(sum))
					count += sums.get(sum);
			}
		}
		return count;
    }
	public static void main(String[] args) {
		int[] A = new int[]{1, 2};
		int[] B = new int[]{-2,-1};
		int[] C = new int[]{-1, 2};
		int[] D = new int[]{0, 2};
		int result = fourSumCount(A, B, C, D);
		System.out.println(result);
		
	}
}
