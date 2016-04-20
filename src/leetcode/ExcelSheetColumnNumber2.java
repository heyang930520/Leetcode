package leetcode;

import java.util.Scanner;

public class ExcelSheetColumnNumber2 {
    public static int titleToNumber(String s) {
    	int output = 0;
    	for(int i=0; i<s.length(); i++){
    		output *= 26;
    		output += (s.charAt(i) - 'A') + 1;
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
