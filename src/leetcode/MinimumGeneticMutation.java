package leetcode;

import java.util.*;

public class MinimumGeneticMutation {
	public static int minMutation(String start, String end, String[] bank) {
		if(start.equals(end)) 
			return 0;		
		Set<String> visited = new HashSet<>();
		Queue<String> queue = new LinkedList<>();
		
		queue.offer(start);
		queue.offer("#");
		int depth = 0;
		int min = Integer.MAX_VALUE;
		while(!queue.isEmpty()) {
			String current = queue.poll();
			System.out.println(queue);
			System.out.println(min);
			if(current.equals("#")) {
				depth++;
				System.out.println(depth);
				if(!queue.isEmpty())
					queue.offer("#");
			}
			else if(current.equals(end)) 
			   min = Math.min(depth, min);
			else{
			    for(String gene: bank) {
				    if(compareStrings(current, gene) == 1 && !visited.contains(gene)) {
					    visited.add(gene);
					    queue.offer(gene);
				    }
			    }
			}
		}		
        return min==Integer.MAX_VALUE? -1 : min;
    }
	public static int compareStrings(String stringA, String stringB) {
		int len = 8;
		int flag = 0;
		for(int i=0; i<len; i++){
			if(stringA.charAt(i) != stringB.charAt(i))
				flag += 1;
		}
		if(flag == 1)
			return flag;
		else
			return -1;
	}
	public static void main(String[] args) {
		String start = "AAAACCCC";
		String end = "CCCCCCCC";
		String[] bank = new String[]{"AAAACCCA","AAACCCCA","AACCCCCA","AACCCCCC","ACCCCCCC","CCCCCCCC","AAACCCCC","AACCCCCC"};
		int result = minMutation(start, end, bank);
		System.out.println(result);
	}
}
