package leetcode;

public class KthSmallestElementInSortedMatrix {
	public static int kthSmallest(int[][] matrix, int k) {
		int len = matrix.length;
		int lo= matrix[0][0];
		int hi = matrix[len-1][len-1] + 1;
		while (lo < hi) {
			int mid = lo + (hi - lo)/2;
			int count = 0, j = len - 1;
			for(int i=0; i<len; i++) {
				while(j >= 0 && matrix[i][j] > mid) 
					j--;
				count += (j + 1);
			}
			if(count < k)
				lo = mid + 1;
			else
				hi = mid;
		}
        return lo;
    }
	public static void main(String[] args) {
		int[][] matrix = {
		                 {1,  5,  9},
		                 {10, 11, 13},
		                 {12, 13, 15}
		};
		int k = 8;
		int result = kthSmallest(matrix, k);
		System.out.println(result);
	}
}
