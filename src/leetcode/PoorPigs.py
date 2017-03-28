class Solution(object):
    def poorPigs(self, buckets, minutesToDie, minutesToTest):
        """
        :type buckets: int
        :type minutesToDie: int
        :type minutesToTest: int
        :rtype: int
        """
        numberOfPigs = 0
        while (minutesToTest / minutesToDie + 1) ** numberOfPigs < buckets:
            numberOfPigs += 1
        return numberOfPigs


if __name__ == "__main__":
    buckets = 1000
    minutesToDie = 15
    minutesToTest = 60
    solution = Solution()
    numberOfPigs = solution.poorPigs(buckets, minutesToDie, minutesToTest)
    print numberOfPigs
