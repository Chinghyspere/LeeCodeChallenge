package octparctices.part2;

/*
 *
 *     @author Qmh
 *     @Date 2019/10/16 9:49
 *
 *
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Nqueens {
    /**
     * 根据逻辑回溯法解决，动态维护链表
     *
     * @param n
     * @return
     */
    public List<List<String>> solveNQueens(int n) {
        char[][] queens = new char[n][n];
        char empty = '\u0000';
        int i = 0, j = 0;
        List<List<String>> answer = new ArrayList<>();
        Stack stack = new Stack();
        List<char[][]> result = new ArrayList<>();
        finishResult(result, stack, i, j, queens);
        result.forEach(qu -> {
            List<String> value = new ArrayList<>();
            value = Arrays.stream(qu).map(Arrays::toString).collect(Collectors.toList());
            answer.add(value);
        });
        return null;
    }

    private void finishResult(List<char[][]> expectArray, Stack stack, int i, int j, char[][] oldArray) {
        char[][] newArrays = Arrays.copyOf(oldArray, oldArray.length);
    }

    public static void main(String[] args) {
        char[][] queens = new char[1][1];
        System.out.println(queens[0][0] == '\u0000');
    }


}
