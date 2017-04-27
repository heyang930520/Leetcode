package leetcode;

import java.util.Random;

public class ShuffleAnArray {
	public int nums[];
	public Random random;
	
	public void Solution(int[] nums) {
        this.nums = nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] random = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
        	int r = (int) (Math.random() * (i + 1));
        	random[i] = random[r];
        	random[r] = nums[i];
        }
        return random;
    }
}
