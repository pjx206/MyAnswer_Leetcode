#
# @lc app=leetcode.cn id=58 lang=python3
#
# [58] 最后一个单词的长度
#

# @lc code=start
class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        _startFlag = False
        _len = 0
        for c in s[::-1]:
            if c != ' ':
                _startFlag = True
            if _startFlag:
                if c == ' ':
                    break
                else:
                    _len += 1
            
        return _len
        
# @lc code=end

