package octparctices.part1;

/*
 *
 *     @author Qmh
 *     @Date 2019/10/14 10:04
 *
 *
 */


import java.util.Arrays;

public class maximumBT {
    /**Given an integer array with no duplicates. A maximum tree building on this array is defined as follow:

     The root is the maximum number in the array.
     The left subtree is the maximum tree constructed from left part1 subarray divided by the maximum number.
     The right subtree is the maximum tree constructed from right part1 subarray divided by the maximum number.
     Construct the maximum tree by the given array and output the root node of this tree.

     Example 1:
     Input: [3,2,1,6,0,5]
     Output: return the tree root node representing the following tree:
     6
     /   \
     3     5
     \    /
     2   0
     \
     1
      
      
     Note:
     The size of the given array will be in the range [1,1000].
     给定一个不含重复元素的整数数组。一个以此数组构建的最大二叉树定义如下：

     二叉树的根是数组中的最大元素。
     左子树是通过数组中最大值左边部分构造出的最大二叉树。
     右子树是通过数组中最大值右边部分构造出的最大二叉树。
     通过给定的数组构建最大二叉树，并且输出这个树的根节点。

      

     示例 ：

     输入：[3,2,1,6,0,5]
     输出：返回下面这棵树的根节点：

     6
     /   \
     3     5
     \    /
     2   0
     \
     1
      

     提示：

     给定的数组的大小在 [1, 1000] 之间。

     来源：力扣（LeetCode）
     链接：https://leetcode-cn.com/problems/maximum-binary-tree
     著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        public TreeNode constructMaximumBinaryTree(int[] nums) {
            return null;
        }
    }


    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int x) {
            this.val = x;
        }
    }

}



