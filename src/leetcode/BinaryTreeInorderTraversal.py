class TreeNode(object):
    def __init__(self, x):
    self.val = x
    self.left = None
    self.right = None

class Solution(object):
    def inorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        # iteratively
        result = []
        stack = []
        while True:
            while root:
                stack.append(root)
                root = root.left
            if not stack:
                return result
            node = stack.pop()
            result.append(node.val)
            root = node.right
        return result
    # recursively
    """
    def inorderTraversal(self, root):
        res = []
        self.helper(root, res)
        return res
    def helper(self, root, res):
        if root:
            self.helper(root.left, res)
            res.append(res)
            self.helper(root.right, res)
    """
