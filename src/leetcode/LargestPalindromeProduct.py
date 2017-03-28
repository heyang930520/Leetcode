class Solution(object):
    def largestPalindrome(self, n):
        """
        :type n: int
        :rtype: int
        """
        if(n == 1):
            return 9
        modular = 1337
        max = 10**n - 1
        min = 10**(n-1)
        left_max = max
        tmp = left_max
        while tmp >= min:
            result = long(str(tmp) + str(tmp)[::-1])
            for i in range(max, (int(result))/max, -1):
                if result % i == 0:
                    return result % 1337
            tmp -= 1
        print result % 1337


if __name__ == "__main__":
    n = 8
    solution = Solution()
    result = solution.largestPalindrome(n)
    print result
