/*
 * @lc app=leetcode.cn id=58 lang=cpp
 *
 * [58] 最后一个单词的长度
 */

// @lc code=start
class Solution
{
public:
    int lengthOfLastWord(string s)
    {
        string::reverse_iterator it;
        bool start = false;
        int len = 0;
        for (it = s.rbegin(); it != s.rend(); it++)
        {
            if (!start && isalpha(*it))
                start = true;
            if (start)
            {
                if (isalpha(*it))
                    len++;
                else
                    break;
            }
        }
        return len;
    }
};
// @lc code=end
