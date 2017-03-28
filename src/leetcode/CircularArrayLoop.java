package leetcode;
import java.util.*;

public class CircularArrayLoop {
    public static boolean circularArrayLoop(int[] nums) {
    	int len = nums.length;
    	for(int i=0; i<len; i++) {
    		int startPosition = i;
    		int direction = (nums[startPosition]>0)? 1 : -1; //-1 backward, 1 forward
    		LinkedList<Integer> visited = new LinkedList<>();
    		LinkedList<Integer> travel = new LinkedList<>();
    		
    		visited.offer(startPosition);
    		travel.offer(startPosition);
    		while(!travel.isEmpty()) {
    			int location = travel.poll();
    			int value = nums[location];
    			int flag = (value>0)? 1 : -1;
    			if(flag != direction)
    				break;
    			startPosition = (startPosition+value)%len;
    			if(startPosition < 0)
    				startPosition += len;
    			if(visited.contains(startPosition)){
    				if(visited.get(visited.size()-1) != startPosition)
    				    return true;
    				else
    					break;
    			}
    			visited.offer(startPosition);
    			travel.offer(startPosition);
    			
    		}
    	}
        return false;
    }
    public static void main(String[] args) {
    	int[] nums = new int[]{-1, -2, -3, -4, -5};
    	boolean result = circularArrayLoop(nums);
    	System.out.println(result);
    }
}
