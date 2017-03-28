class Solution(object):
    def change(self, amount, coins):
        """
        :type amount: int
        :type coins: List[int]
        :rtype: int
        """
        dp = [0] * (amount + 1)
        dp[0] = 1
        for coin in coins:
            for j in range(1, amount + 1):
                if j >= coin:
                    dp[j] += dp[j - coin]
        return dp[amount]


if __name__ == "__main__":
    amount = 5
    coins = [1, 2, 5]
    solution = Solution()
    result = solution.change(amount, coins)
    print result
