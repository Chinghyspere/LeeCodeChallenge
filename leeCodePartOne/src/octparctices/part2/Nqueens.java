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
     * n 皇后问题研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
     * <p>
     * <p>
     * <p>
     * 上图为 8 皇后问题的一种解法。
     * <p>
     * 给定一个整数 n，返回所有不同的 n 皇后问题的解决方案。
     * <p>
     * 每一种解法包含一个明确的 n 皇后问题的棋子放置方案，该方案中 'Q' 和 '.' 分别代表了皇后和空位。
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
     */
    List<List<String>> lists = new ArrayList<>();//返回集合
    List<String> ans = new ArrayList<>();//n皇后的解

    public List<List<String>> solveNQueens(int n) {
        Map<Integer, String> param = new HashMap<>();
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (j == i) sb.append("Q");
                else sb.append(".");
            }
            param.put(i, sb.toString());
        }
        //列的大小为n,主对角线和次对角线的大小为2n-1
        queens(n, new boolean[n], new boolean[2 * n - 1], new boolean[2 * n - 1], param, 0);
        return lists;
    }

    void queens(int n, boolean[] y, boolean[] w, boolean[] wc, Map<Integer, String> param, int i) {
        if (ans.size() == n) {//递归结束条件，即n皇后已放置所有的行中
            lists.add(new ArrayList<>(ans));
            return;
        }
        for (int j = 0; j < n; j++) {
            //判断当前位置是否可用，即列、主对角线、次对角线是否被使用
            if (y[j] || w[n - 1 - i + j] || wc[i + j]) continue;
            //如果可用，先标记该列、主对角线、次对角线已被使用
            y[j] = true;
            w[n - 1 - i + j] = true;
            wc[i + j] = true;
            ans.add(param.get(j));
            //递归下一行是否可以放置皇后，直到所有皇后都放到对应的位置或者该行无法放置皇后则结束
            queens(n, y, w, wc, param, i + 1);
            //递归完成之后，恢复现场
            ans.remove(i);
            y[j] = false;
            wc[i + j] = false;
            w[n - 1 - i + j] = false;
        }
    }

}
