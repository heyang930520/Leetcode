class Solution(object):
    def circularArrayLoop(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        length = len(nums);
        for i in range(length):
            startPosition = i;
            direction = 1 if nums[i]>0 else -1
            visited = [i]
            travel = [i]
            while travel:
                location = travel.pop(0)
                value = nums[location]
                flag = 1 if value>0 else -1
                if not direction== flag:
                    break
                startPosition = (startPosition+value)%length
                if startPosition < 0:
                    statrPosition += length
                if startPosition in visited:
                    if not visited[-1] == startPosition:
                        return True
                    else:
                        break
                visited.append(startPosition)
                travel.append(startPosition)
        return False


if __name__ == "__main__":
    nums = [-1, 2]
    solution = Solution()
    result = solution.circularArrayLoop(nums)
    print result
