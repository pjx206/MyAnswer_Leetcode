#
# @lc app=leetcode.cn id=125 lang=python3
#
# [125] 验证回文串
#

# @lc code=start
class Solution:
    def isPalindrome(self, s: str) -> bool:
        ns = ''
        for c in s:
            if (c >= 'A' and c <= 'Z') or (c >= '0' and c <= '9'):
                ns += c
            elif c >= 'a' and c <= 'z':
                ns += chr(ord(c) - 32)
        l, r = 0, len(ns) - 1
        while l < r:
            if ns[l] != ns[r]:
                return False
            l += 1
            r -= 1
        return True
        

# @lc code=end

