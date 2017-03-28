class Solution(object):
    def fourSumCount(self, A, B, C, D):
        """
        :type A: List[int]
        :type B: List[int]
        :type C: List[int]
        :type D: List[int]
        :rtype: int
        """
        map = {}
        count = 0
        for a in A:
            for b in B:
                sum = a + b
                if not sum in map:
                    map[sum] = 1
                else:
                    map[sum] += 1
        for c in C:
            for d in D:
                sum = -(c + d)
                if sum in map:
                    count += map[sum]
        return count
if __name__ == "__main__":
    A = [ 1, 2]
    B = [-2,-1]
    C = [-1, 2]
    D = [ 0, 2]
    solution = Solution()
    result = solution.fourSumCount(A, B, C, D)
    print result
