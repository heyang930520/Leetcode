package leetcode;

public class WaterAndJug {
	public static boolean canMeasureWater(int x, int y, int z) {
		
		if(z == 0){
			return true;
		}
		if(x == 0 && y == 0){
			return false;
		}
		if(x + y < z)
			return false;
		while(x > 0 && y > 0){
			if(x >= y)
				x -= y;
			else if(y > x)
				y -= x;
		}
		int div = (x > 0)?x:y;		
		return (z%div == 0);
	}
	public static void main(String[] args){
		int x = 3, y = 5, z = 4;
		boolean res = canMeasureWater(x, y, z);
		System.out.print(res);
	}
}
