package leetcode;

public class FindTheDuplicateNumber {
	public static int findDuplicate(int[] nums) {
		//Similar to find loop in linkedlist
		//https://discuss.leetcode.com/topic/25685/java-o-n-time-and-o-1-space-solution-similar-to-find-loop-in-linkedlist
		int slow = 0, fast = 0;
	    do{
	        slow = nums[slow];
	        fast = nums[nums[fast]];
	    }while(slow != fast);
	    slow = 0;
	    while(slow != fast){
	        slow = nums[slow];
	        fast = nums[fast];
	    }
	    return slow;
    }
	public static void main(String[] args) {
		int[] nums = {1, 2, 2};
		int result = findDuplicate(nums);
		System.out.println(result);
	}
}

/*
 * Binary Search
 * int lo = 0, hi = nums.length - 1;
		while(lo <= hi) {
			int mid = lo + (hi-lo)/2;
			int count = 0;
			for(int num: nums) {
				if(num <= mid)
					count += 1;
			}
			if(count<=mid) 
				lo = mid + 1;
			else
				hi = mid - 1;
		}
		return lo;
 */
/*
 * int len = nums.length;
 * 	for(int i=0; i<len; i++) {
 * 		for(int j=len-1; j>i; j--) {
 * 			if(nums[i] == nums[j])
 * 				return nums[i];
 * 		}
 * 	}
 */