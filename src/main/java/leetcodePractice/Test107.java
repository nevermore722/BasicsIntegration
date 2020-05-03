package leetcodePractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/5/3 23:05
 * @description： 107. 二叉树的层次遍历 II
 * @modified By：
 * @version: 1.0
 */

/**
 * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 *
 * 例如： 给定二叉树 [3,9,20,null,null,15,7],
 *
 * 3 / \ 9  20 /  \ 15   7 返回其自底向上的层次遍历为：
 *
 * [ [15,7], [9,20], [3] ]
 */
public class Test107 {

  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    List<List<Integer>> ans = new ArrayList<>();
    if (root == null) {
      return ans;
    }
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    while (!q.isEmpty()) {
      List<Integer> tmp = new ArrayList<>();
      int len = q.size();
      for (int i = 0; i < len; i++) {
        TreeNode node = q.poll();
        tmp.add(node.val);
        if (node.left != null) {
          q.add(node.left);
        }
        if (node.right != null) {
          q.add(node.right);
        }
      }
      // 在索引 0 的位置加入一维数组 tmp
      // 每次新的数组进来都会被放在开始的位置
      ans.add(0, tmp);
    }
    return ans;
  }
}
