import java.util.*;

public class Solutions {
    public static boolean JudgeRouteCircle(String moves) {
        char[] a = moves.toCharArray();
        int x = 0, y = 0;
        for (char item : a) {
            switch (item) {
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
            }
        }
        if (x == 0 & y == 0)
            return true;
        else
            return false;
    }

    /*----------------------------------------------------------------------------*/

    /*
     * 理解错了题意，原题意思是J里每一个元素都是一种宝石，
     *此做法是把J整个作为了一块宝石
     *
     *However，it's a way to compare String arrays
     * (calculate how many times string A appears in string B)
     */
    public static int numJewelsInStones_StringComparison(String J, String S) {
        char[] JJ = J.toCharArray();
        char[] SS = S.toCharArray();
        int jewels = 0;
        if (JJ.length <= SS.length) {
            for (int i = 0; i <= SS.length - JJ.length; i++) {
                if (SS[i] == JJ[0]) {
                    boolean isJ = true;
                    for (int j = 1; j < JJ.length; j++) {
                        if (SS[i + j] != JJ[j]) {
                            isJ = false;
                            break;
                        }
                    }
                    if (isJ)
                        jewels++;
                }
            }
            return jewels;
        } else {
            return 0;
        }
    }

    /*-----------------------------------------------------------------------------*/

    /*宝石和石头问题正解
     *the string Jewels may contents more chars than the Stone
     */
    public static int numJewelsInStones(String J, String S) {
        char[] JJ = J.toCharArray();
        char[] SS = S.toCharArray();
        int jewels = 0;
        for (char j : JJ) {
            for (int i = 0; i < SS.length; i++) {
                if (SS[i] == j) {
                    jewels++;
                }
            }
        }
        return jewels;
    }



    /*-----------------------------------------------------------------------------*/

    public static void rotate(int[] nums, int k) {
        if (k >= nums.length)
            k = k - nums.length;
        for (int i = 0; i < k; i++)//notice that if k=0, the lines below will not be executed
        {
            for (int j = 1; j < nums.length; j++) {
                int temp = nums[nums.length - j];
                nums[nums.length - j] = nums[nums.length - j - 1];
                nums[nums.length - j - 1] = temp;
            }
        }
    }

    public static void betterRotate(int[] nums, int k) {
        k %= nums.length;
        reverseElements(nums, 0, nums.length - 1);
        reverseElements(nums, 0, k - 1);
        reverseElements(nums, k, nums.length - 1);
    }

    public static void reverseElements(int[] nums, int from, int to) {
        while (from < to) {
            int temp = nums[to];
            nums[to] = nums[from];
            nums[from] = temp;
            from++;
            to--;
        }
    }

    /*-----------------------------------------------------------------------------*/
    // https://leetcode-cn.com/problems/remove-element/description/
    public static int removeElement(int[] nums, int val) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val)
                n++;
        }

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }

        return nums.length - n;
    }

    /*------------------------------------------------------------------*/
    public static int removeDuplicates(int[] nums) {
        int pointer = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[pointer]) {
                pointer++;
                nums[pointer] = nums[i];
            }
        }
        return pointer + 1;
    }

    /*-----------------------------------------------------------------*/
    public static boolean isValidSudoku(char[][] board) {
        //Horizontal validity
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char checking = board[i][j];
                for (int k = 1; k < 8; k++) {
                    if (checking == board[i][j]) {
                        return false;
                    }
                }
            }
        }

        //Vertically validity
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char checking = board[i][j];
                for (int k = 1; k < 9; k++) {
                    if (checking == board[j][i]) {
                        return false;
                    }
                }
            }
        }


        return true;
    }
    //Validity in matrix of 9*9
    /*I think there is a way to Optimize*/

    public static void moveZeroes(int[] nums) {
        int temp = 0;
        int zeroNums = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[temp] = nums[i];
                temp++;
            } else {
                zeroNums++;
            }
        }//遍历数组对元素进行是否为0的判断

        while (zeroNums > 0) {
            nums[nums.length - zeroNums] = 0;
            zeroNums--;
        }//对数组末尾加上零
    }

    /*----------------------------------------------------------------------------------------------*/
    private static int[] plusOne(int[] digits) {
        boolean allNine = true;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 9) {
                allNine = false;
            }
        }
        if (allNine) {
            int[] newDigit = new int[digits.length + 1];
            newDigit[0] = 1;
            return newDigit;
        } else {
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                } else {
                    digits[i] += 1;
                    break;
                }
            }
            return digits;
        }
    }
    /*----------------------------------------------------------------------------------------------*/
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }else{
            int temp = x;
            int[] digits = new int[sizeOfInt(x)];
            for (int i = digits.length-1;i >=0 ; i--) {
                digits[i]=temp%10;
                temp/=10;
            }
        }
    }
    public static void sizeOfInt(int a){
        final int[] sizeTable = {9,99,999,9999,99999,999999,9999999,
                99999999,999999999,Integer.MAX_VALUE}
        for (int i = 0;;i++){
            if(x<=sizeTable[i])
            {
                return i+1;
            }
        }
    }
}

}//keep this "}"