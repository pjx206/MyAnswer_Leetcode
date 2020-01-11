#
# @lc app=leetcode.cn id=225 lang=python3
#
# [225] 用队列实现栈
#

# @lc code=start
class MyStack:

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self._allocatedSize = 24
        self._stack = [0] * self._allocatedSize
        self._sp = 0

    def push(self, x: int) -> None:
        """
        Push element x onto stack.
        """
        self._sp += 1
        if self._sp < self._allocatedSize:
            self._stack[self._sp] = x
        else:
            self._stack += [0] * self._allocatedSize
            self._stack[self._sp] = x
            self._allocatedSize <<= 1
        
        

    def pop(self) -> int:
        """
        Removes the element on top of the stack and returns that element.
        """
        _topEle = self._stack[self._sp]
        self._sp -= 1
        return _topEle
        

    def top(self) -> int:
        """
        Get the top element.
        """
        return self._stack[self._sp]
        

    def empty(self) -> bool:
        """
        Returns whether the stack is empty.
        """
        return True if self._sp == 0 else False
        


# Your MyStack object will be instantiated and called as such:
# obj = MyStack()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.top()
# param_4 = obj.empty()
# @lc code=end

