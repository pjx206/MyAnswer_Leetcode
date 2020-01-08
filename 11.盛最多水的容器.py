#
# @lc app=leetcode.cn id=11 lang=python3
#
# [11] 盛最多水的容器
#

# @lc code=start
class Solution:
    def maxArea(self, height: List[int]) -> int:
        minH = min(height)
        if len(height) == 2:
            return minH
        maxH = max(height)

        maxArea = 0
        # give a lid from bottom(minH) to the top
        for lid in range(minH, maxH + 1):
            left, right = 0, len(height) - 1
            while height[left] < lid:
                left += 1
            while height[right] < lid:
                right -= 1
            if left == right:
                break
            lid = min(height[left], height[right])
            maxArea = max(maxArea, (right-left)*lid)
        
        return maxArea
            

        
        
# @lc code=end

