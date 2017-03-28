import sys
class Solution(object):
    def minMutation(self, start, end, bank):
        """
        :type start: str
        :type end: str
        :type bank: List[str]
        :rtype: int
        """
        if(start == end):
            return 0
        visited = []
        queue = []
        queue.append(start)
        queue.append("#")
        minValue = sys.maxint
        depth = 0
        while(queue):
            tmp = queue[0]
            queue.pop(0)
            if(tmp == "#"):
                depth += 1
                if(queue):
                    queue.append("#")
            elif(tmp == end):
                minValue = min(depth, minValue)
            else:
                for gene in bank:
                    if(solution.compareStrings(gene, tmp) and gene not in visited):
                        visited.append(gene)
                        queue.append(gene)
        return -1 if minValue==sys.maxint else minValue

    def compareStrings(self, gene, tmp):
        flag = 0
        for i in range(len(gene)):
            if not gene[i] == tmp[i]:
                flag += 1
        return flag if flag == 1 else 0


if __name__ == "__main__":
    solution = Solution()
    start = "AAAACCCC"
    end = "CCCCCCCC"
    bank = ["AAAACCCA","AAACCCCA","AACCCCCA","AACCCCCC","ACCCCCCC","CCCCCCCC","AAACCCCC","AACCCCCC"]
    result = solution.minMutation(start, end, bank)
    print result
