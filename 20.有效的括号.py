#
# @lc app=leetcode.cn id=20 lang=python3
#
# [20] 有效的括号
#

# @lc code=start
class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        if len(s) & 1 == 1:
            return False

        for b in s:
            if b == '(':
                stack.append(1)
            elif b == '[':
                stack.append(2)
            elif b ==  '{':
                stack.append(3)
            
            elif len(stack) == 0:
                return False

            if b == ')':
                if stack.pop() != 1:
                    return False
            elif b == ']':
                if stack.pop() != 2:
                    return False
            elif b == '}':
                if stack.pop() != 3:
                    return False
        
        if len(stack) != 0:
            return False
        else:
            return True

        
# @lc code=end

