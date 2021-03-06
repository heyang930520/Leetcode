import random
class Solution(object):

    def __init__(self, nums):
        """
        :type nums: List[int]
        """
        self.nums = nums

    def reset(self):
        """
        Resets the array to its original configuration and return it.
        :rtype: List[int]
        """
        return self.nums

    def shuffle(self):
        """
        Returns a random shuffling of the array.
        :rtype: List[int]
        """
        shuff = self.nums[:]
        for i in range(len(shuff)-1, 0, -1):
            j = random.randint(0, i+1)
            shuff[i], shuff[j] = shuff[j], shuff[i]
            return shuff
if __name__ == "__main__":
    print 1
