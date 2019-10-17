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
        List<List<String>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(checkAndSet(i, new Stack(), new ArrayList<>()));
        }
        return list;
    }

    private List<String> checkAndSet(int i, Stack stack, List valueList) {
        stack.push(i);
        return null;
    }

}
