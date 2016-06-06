package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class CountingBits {
	public static int[] countBits(int num) {       
        int[] out = new int[num+1];
        out[0] = 0;
        if(num == 0){
        	return out;
        }
        out[1] = 1;
        if(num == 1){
        	return out;
        }
        out[2] = 1;
        if(num == 2){
        	return out;
        }
        for(int i=3; i <= num; i++){
        	out[i] = out[i/2] + out[i%2];
        }
        return out;
    }
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] out = countBits(in.nextInt());
		in.close();
		System.out.println(Arrays.toString(out));
	}
}
