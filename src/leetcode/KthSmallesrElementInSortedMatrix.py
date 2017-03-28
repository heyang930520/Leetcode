
class Solution(object):
    def kthSmallest(self, matrix, k):
        """
        :type matrix: List[List[int]]
        :type k: int
        :rtype: int
        """
        sortlist = []
        for row in matrix:
            for element in row:
                sortlist.append(element)
        return sorted(sortlist)[k-1]
        # return sorted([element for row in matrix for element in row])[k-1 ]

if __name__ == "__main__":
    matrix = [
        [ 1,  5,  9],
        [10, 11, 13],
        [12, 13, 15]
    ]
    k = 8
    solution = Solution()
    res = solution.kthSmallest(matrix, k)
    print res

    """
    class Solution(object):
    def kthSmallest(self, matrix, k):
    lo, hi = matrix[0][0], matrix[-1][-1]
    while lo<hi:
        mid = (lo+hi)//2
        if sum(bisect.bisect_right(row, mid) for row in matrix) < k:
            lo = mid+1
        else:
            hi = mid
    return lo
    https://docs.python.org/2/library/bisect.html
    """
