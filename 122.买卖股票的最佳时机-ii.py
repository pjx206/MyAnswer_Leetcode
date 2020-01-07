#
# @lc app=leetcode.cn id=122 lang=python3
#
# [122] 买卖股票的最佳时机 II
#

# @lc code=start
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0
        i = 0
        j = 0
        while j < len(prices):
            if prices[j] > prices[i]:
                profit += prices[j] - prices[i]
                i = j
            elif prices[j] < prices[i]:
                i = j
            j += 1
        return profit
        

# @lc code=end

