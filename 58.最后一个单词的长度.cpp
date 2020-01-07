/*
 * @lc app=leetcode.cn id=58 lang=cpp
 *
 * [58] 最后一个单词的长度
 */

// @lc code=start
class Solution {
public:
    int lengthOfLastWord(string s) {
        reverse_iterator it = s.end();
        bool start = false;
        int len = 0;
        while(it++ != s.begin()){
            start = *it != ' ' ? true : false;
            if(start){
                if(*it != ' '){
                    len ++;
                }else{
                    break;
                }
            }
        }
        return len;

    }
};
// @lc code=end

