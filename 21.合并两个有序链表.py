#
# @lc app=leetcode.cn id=21 lang=python3
#
# [21] 合并两个有序链表
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        if l1 == None:
            return l2
        if l2 == None:
            return l1
        node = ListNode(None)
        preHead = node
        i, j = l1, l2
        while True:
            if i != None and j != None:
                if i.val <= j.val:
                    node.next, i = i, i.next
                else:
                    node.next, j = j, j.next
            node = node.next

            #其中任意一个链表结束，则只要把另一个补上就行
            if i == None:
                node.next = j
                break
            if j == None:
                node.next = i
                break
        
        return preHead.next
        
# @lc code=end

