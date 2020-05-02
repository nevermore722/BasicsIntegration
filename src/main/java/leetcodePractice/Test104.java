package leetcodePractice;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/5/2 22:25
 * @description： 104. 二叉树的最大深度
 * @modified By：
 * @version: 1.0
 */

/**
 * 给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回它的最大深度 3 。
 *
 */
public class Test104 {

  public int maxDepth(TreeNode root) {

    if (root == null) {
      return 0;
    }
    int left = maxDepth(root.left);
    int right = maxDepth(root.right);
    return 1 + Math.max(left, right);
  }
}
