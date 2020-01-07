#
# @lc app=leetcode.cn id=1 lang=python3
#
# [1] 两数之和
#ls


# @lc code=start
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        sortedIndex = sorted(list(range(len(nums))), key=lambda i: nums[i])
        for i in sortedIndex:
            for j in sortedIndex:
                if i == j:
                    continue
                else:
                    if nums[i] + nums[j] == target:
                        return [i, j] if i < j else [j, i]
        
# @lc code=end

