package leetcode;

public class CoinChange2 {
	public static int change(int amount, int[] coins) {
		int[] dp = new int[amount+1];
		dp[0] = 1;
		for(int coin: coins) {
			for(int i = coin; i < amount+1; i++) {
				dp[i] += dp[i - coin];
			}
		}
        return dp[amount];
    }
	public static void main(String[] args) {
		int amount = 5;
		int[] coins = new int[]{1, 2, 5};
		int result = change(amount, coins);
		System.out.println(result);
	}
}
