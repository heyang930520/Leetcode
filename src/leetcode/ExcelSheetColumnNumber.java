package leetcode;

import java.util.Scanner;

public class ExcelSheetColumnNumber {
	public static int titleToNumber(String s) {
		int output = 0;
		for(int i=0; i<s.length(); i++){
			output += Math.pow(26, s.length()-i-1) * ((int)s.charAt(i)-64);
		}
		return output;
    }
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int out = titleToNumber(in.next());
		in.close();
		System.out.println(out);
	}
}
