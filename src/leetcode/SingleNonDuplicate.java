package leetcode;

public class SingleNonDuplicate {
	public static int singleNonDuplicate(int[] nums) {
		int len=nums.length - 1, start=0;
        while (start < len) {
            int middle = start + (len - start) / 2;
            if (nums[middle]!=nums[middle+1] && nums[middle]!=nums[middle-1])
            	return nums[middle];
            else if(nums[middle]==nums[middle+1] && middle%2==0)
            	start = middle + 1;
            else if(nums[middle]==nums[middle-1] && middle%2==1)
            	start = middle + 1;
            else  len = middle - 1;
        }
        return nums[start];
    }
	public static void main(String[] args) {
		int nums[] = new int[]{0,1,1};
		int result = singleNonDuplicate(nums);
		System.out.println(result);
	}
	/*
	int n=nums.length, lo=0, hi=n/2;
    while (lo < hi) {
        int m = (lo + hi) / 2;
        if (nums[2*m]!=nums[2*m+1]) hi = m;
        else lo = m+1;
    }
    return nums[2*lo];
    */
}
