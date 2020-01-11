#
# @lc app=leetcode.cn id=14 lang=python3
#
# [14] 最长公共前缀
#

# @lc code=start
class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        cmPrefix = ''
        if len(strs) == 0:
            return ''
        elif len(strs) == 1:
            return strs[0]
        
        maxLen = len(min(strs, key=len))
        diff = False
        for i in range(maxLen):
            letter = strs[0][i]
            for s in strs[1:]:
                if s[i] != letter:
                    diff = True
                    break
            if diff:
                break
            cmPrefix += letter
        return cmPrefix
            
        
# @lc code=end

