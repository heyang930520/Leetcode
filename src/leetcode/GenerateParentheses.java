package leetcode;

import java.util.*;

public class GenerateParentheses {
    public static List<String> generateParenthesis(int n) {
    	List<String> result = new ArrayList<>();
    	backtrack(result,"", 0, 0, n);
    	return result;
	}
    public static void backtrack(List<String> result,String str, int open, int close, int max) {
    	if(str.length() == max*2) {
    		result.add(str);
    		return;
    	}
    	if(open < max) 
    		backtrack(result, str+"(", open+1, close, max);
    	if(close < open)
    		backtrack(result, str+")", open, close+1, max);
    }
    public static void main(String[] args) {
    	int n = 3;
    	List<String> result = generateParenthesis(n);
    	System.out.println(result);
    }
}

/*
 * public static List<String> generateParenthesis(int n) {
    	List<String> result = new ArrayList<>();
    	int openCount = 0, closeCount = 0;
    	createStrings(result,"", openCount, closeCount, n);
    	for(int i=0; i<result.size(); i++) {
    		String str = result.get(i);
    		int flag = 0;
    		for(int j=0; j<str.length(); j++) {
    			if(str.charAt(j) == '(')
    				flag += 1;
    			if(str.charAt(j) == ')')
    				flag -= 1;
    			if(flag < 0) {
    				result.remove(i);
    				i -= 1;
    				break;
    			}    			
    		}
    	}
    	return result;
	}
    public static void createStrings(List<String> result,String str, int openCount, int closeCount, int max) {
    	if(str.length() == max*2) {
    		result.add(str);
    		return;
    	}
    	if(openCount < max) 
    		createStrings(result, str+"(", openCount+1, closeCount, max);
    	if(closeCount < max)
    		createStrings(result, str+")", openCount, closeCount+1, max);
    }
 */
