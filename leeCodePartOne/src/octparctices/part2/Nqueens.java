package octparctices.part2;

/*
 *
 *     @author Qmh
 *     @Date 2019/10/16 9:49
 *
 *
 */

import java.util.*;
import java.util.stream.Collectors;

public class Nqueens {
    /**
     * n 皇后问题研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
     * <p>
     * <p>
     * <p>
     * 上图为 8 皇后问题的一种解法。
     * <p>
     * 给定一个整数 n，返回所有不同的 n 皇后问题的解决方案。
     * <p>
     * 每一种解法包含一个明确的 n 皇后问题的棋子放置方案，该方案中 'Q' 和 '.' 分别代表了皇后和空位。
     * <p>
     * 示例:
     * <p>
     * 输入: 4
     * 输出: [
     * [".Q..",  // 解法 1
     * "...Q",
     * "Q...",
     * "..Q."],
     * <p>
     * ["..Q.",  // 解法 2
     * "Q...",
     * "...Q",
     * ".Q.."]
     * ]
     * 解释: 4 皇后问题存在两个不同的解法。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/n-queens
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */


    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();

        int[] queen = new int[n];
        search(0, n, queen, result);

        return result;
    }

    private void search(int start, int n, int[] queen, List<List<String>> result) {
        if (n == 0) {
            int2List(queen, result);
            return;
        }

        for (int i = 0; i < queen.length; i++) {
            queen[start] = i;
            boolean flag = true;
            for (int j = 0; j < start; j++) {
                if (checkIsNotMatch(start, j, queen)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                search(start + 1, n - 1, queen, result);
            }
        }
    }

    private void int2List(int[] queen, List<List<String>> result) {
        List<String> list = new ArrayList<String>();

        for (int i = 0; i < queen.length; i++) {
            int num = queen[i];
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < queen.length; j++) {
                if (num == j) {
                    stringBuilder.append("Q");
                } else {
                    stringBuilder.append(".");
                }
            }
            list.add(stringBuilder.toString());
        }

        result.add(list);
    }

    private boolean checkIsNotMatch(int i, int j, int[] queen) {
        if (queen[i] == queen[j] || Math.abs(i - j) == Math.abs(queen[i] - queen[j])) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Nqueens().solveNQueens(4));
    }
}