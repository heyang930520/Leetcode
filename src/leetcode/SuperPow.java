package leetcode;

public class SuperPow {
	public static int superPow(int a, int[] b){
		int num = 0, mul = 1, modula = 1337;
		for(int i = b.length - 1; i >= 0; i--){
			num += b[i] * mul;
			mul *= 10;
		}
		String bin = Integer.toBinaryString(num);
		System.out.println(bin);
		long temp = 1;
		for(int i = 0; i < bin.length(); i++){
			temp = (long) Math.pow(temp, 2) % modula;
			System.out.println(temp);
			if(String.valueOf(bin.charAt(i)).equals("1")){				
				temp = (temp * a) % modula;
				System.out.println(temp);
				
			}
			System.out.println(i);
		}
		return (int)temp;
	}
	public static void main(String[] args){
		int a = 2147483647;
		int[] b = new int[3];
		b[0] = 2;
		b[1] = 0;
		b[2] = 0;
		int res = superPow(a, b);
		System.out.println(res);
	}
}
