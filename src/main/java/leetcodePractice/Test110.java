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

  public boolean isBalanced(TreeNode root) {
    if (root == null) {
      return true;
    }
    if (Math.abs(check(root.left) - check(root.right)) > 1) {
      return false;
    }
    return isBalanced(root.right) && isBalanced(root.right);

  }

  public int check(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int longest = Math.max(check(root.left), check(root.right)) + 1;
    return longest;
  }
}
