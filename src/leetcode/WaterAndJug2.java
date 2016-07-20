package leetcode;

public class WaterAndJug2 {
	public static boolean canMeasureWater(int x, int y, int z) {
		return z == 0 || x + y >= z && z % gcd(x, y) == 0;
	}
	public static int gcd(int x, int y){
		return y == 0 ? x : gcd(y, x % y);
	}
	public static void main(String[] args){
		int x = 2, y = 6, z = 5;
		boolean res = canMeasureWater(x, y, z);
		System.out.print(res);
	}
}
