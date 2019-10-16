package octparctices.part2;

/*
 *
 *     @author Qmh
 *     @Date 2019/10/15 9:57
 *
 *
 */


public class ZigzagConversion {
    /**
     * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
     * <p>
     * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
     * <p>
     * L   C   I   R
     * E T O E S I I G
     * E   D   H   N
     * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
     * <p>
     * 请你实现这个将字符串进行指定行数变换的函数：
     * <p>
     * string convert(string s, int numRows);
     * 示例 1:
     * <p>
     * 输入: s = "LEETCODEISHIRING", numRows = 3
     * 输出: "LCIRETOESIIGEDHN"
     * 示例 2:
     * <p>
     * 输入: s = "LEETCODEISHIRING", numRows = 4
     * 输出: "LDREOEIIECIHNTSG"
     * 解释:
     * <p>
     * L     D     R
     * E   O E   I I
     * E C   I H   N
     * T     S     G
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/zigzag-conversion
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * <p>
     * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
     * <p>
     * P   A   H   N
     * A P L S I I G
     * Y   I   R
     * And then read line by line: "PAHNAPLSIIGYIR"
     * <p>
     * Write the code that will take a string and make this conversion given a number of rows:
     * <p>
     * string convert(string s, int numRows);
     * Example 1:
     * <p>
     * Input: s = "PAYPALISHIRING", numRows = 3
     * Output: "PAHNAPLSIIGYIR"
     * Example 2:
     * <p>
     * Input: s = "PAYPALISHIRING", numRows = 4
     * Output: "PINALSIGYAHRPI"
     * Explanation:
     * <p>
     * P     I    N
     * A   L S  I G
     * Y A   H R
     * P     I
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/zigzag-conversion
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    class Solution {
        public String convert(String s, int numRows) {
//            0,(numRows-1)*2,(numRows-1)*2*2
//            1,(numRows-1)*2-1 ,(numRows-1)*2+1,(numRows-1)*2*2-1,(numRows-1)*2*2+1
//            2,
            if(s.length()<=numRows||numRows==1)
                return s;
            int index = 0;
            int fin = (numRows - 1) * 2;
            StringBuilder resultString = new StringBuilder("");
            for (; index < numRows; index++) {
                resultString.append(s.charAt(index));
                for (int i = 1; i <s.length(); i++) {
                    if (index == 0 || index == (numRows - 1)) {
                        if (fin * i+index > s.length()-1)
                            break;
                        resultString.append(s.charAt(fin * i + index));
                    } else {
                        if (fin * i - index < s.length())
                            resultString.append(s.charAt(fin * i - index));
                        if (fin * i + index < s.length())
                            resultString.append(s.charAt(fin * i + index));
                        if (fin * i > s.length())
                            break;
                    }
                }
            }
            return resultString.toString();
        }
    }


}
