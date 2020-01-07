#
# @lc app=leetcode.cn id=121 lang=python3
#
# [121] 买卖股票的最佳时机
#

# @lc code=start
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        restMax = 0
        #* find initial max
        for i in range(len(prices)):
            if prices[i] > prices[restMax]:
                restMax = i
        Max = 0
        i = 0
        while i < len(prices) - 1:
            i += 1
            if prices[i] > prices[i - 1]:
                i -= 1
                if i > restMax:
                    restMax = i
                    for j in range(i, len(prices)):
                        if prices[j] > prices[restMax]:
                            restMax = j
                profit = prices[restMax] - prices[i]
                Max = profit if profit > Max else Max
                i += 1
        
        return Max
        
        
# @lc code=end

  