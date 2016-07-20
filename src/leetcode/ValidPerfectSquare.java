package leetcode;

import java.util.Scanner;

public class ValidPerfectSquare {
	public static boolean isPerfectSquare(int num){
		int root = 0, bit = 1 << 15;
		while(bit > 0){
			root |= bit;
			if(root > num / root){
				root ^= bit;
			}
			bit >>= 1;
		}
		return root * root == num;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		boolean res = isPerfectSquare(in.nextInt());
		in.close();
		System.out.println(res);
	}
}
