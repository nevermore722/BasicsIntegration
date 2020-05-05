package leetcodePractice;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/5/4 23:00
 * @description： 110. 平衡二叉树
 * @modified By：
 * @version: 1.0
 */

/**
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 *
 * 本题中，一棵高度平衡二叉树定义为：
 *
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
 *
 * 示例 1:
 *
 * 给定二叉树 [3,9,20,null,null,15,7]
 *
 * 3 / \ 9  20 /  \ 15   7 返回 true 。
 *
 * 示例 2:
 *
 * 给定二叉树 [1,2,2,3,3,null,null,4,4]
 *
 * 1 / \ 2   2 / \ 3   3 / \ 4   4 返回 false 。
 */
public class Test110 {

  boolean res = true;

  public boolean isBalanced(TreeNode root) {

    helper(root);
    return res;

  }

  private int helper(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int left = helper(root.left) + 1;
    int right = helper(root.right) + 1;
    if (Math.abs(right - left) > 1) {
      res = false;
    }
    return Math.max(left, right);
  }
}
