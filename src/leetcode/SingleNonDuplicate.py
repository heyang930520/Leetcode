class Solution(object):
    def singleNonDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        for i in range(0, len(nums), 2):
            if (i+1) == len(nums):
                return nums[i]
            elif nums[i] == nums[i+1]:
                next
            else:
                return nums[i]
        return 0
if __name__ == "__main__":
    solution = Solution()
    nums = [1,1,2]
    output = solution.singleNonDuplicate(nums)
    print output
