package leetcode;

public class PoorPigs {
    public static int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
    	int numberOfPigs = 0;
    	while (Math.pow(minutesToTest / minutesToDie + 1, numberOfPigs) < buckets) {
    	    numberOfPigs += 1;
    	}
	    return numberOfPigs;
	}
    
    public static void main(String[] args) {
    	int buckets = 1000;
    	int minutesToDie = 15;
    	int minutesToTest = 60;
    	int result = poorPigs(buckets, minutesToDie, minutesToTest);
    	System.out.print(result);
    }
}
