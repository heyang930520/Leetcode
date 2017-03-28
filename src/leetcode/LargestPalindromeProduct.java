package leetcode;

import java.util.Scanner;

public class LargestPalindromeProduct {
	public static int largestPalindrome(int n) {
        if(n == 1) return 9;
        int modular = 1337;
        int max = (int)Math.pow(10, n)-1;
        int min = (int)Math.pow(10, n-1);
        int left_max = max;	
        int temp = left_max;
        long result = 0;
        while(temp >= min){
        	result = (long)temp*(max+1) + (long)reverse(temp, n);
            for(int i = max;i>(int)result/i;i--){
                if(result%i == 0 ) {
                    return (int)(result%modular);
                }
            }
            temp--;
        }
        
        return (int)(result%modular);
    }
    
    private static int reverse(int n, int dig){
        int x = n;
        int res = 0;
        int ten = (int)Math.pow(10,dig-1);
        while(x != 0 ){
            int d = x%10;
            res+=ten*d;
            ten/=10;
            x/=10;
        }
        return res;
    }
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		System.out.println(largestPalindrome(n));
	}
}
