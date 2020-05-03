package leetcodePractice;

import java.util.ArrayList;
import java.util.List;

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
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其自底向上的层次遍历为：
 *
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 *
 */
public class Test107 {

  public List<List<Integer>> levelOrderBottom(TreeNode root) {

    List<List<Integer>> list = new ArrayList<>();
    if (root == null) {
      return list;
    }
    //深搜
    dfs(root, 0, list);
    return list;
  }

  private void dfs(TreeNode root, int lelve, List<List<Integer>> list) {
    if (root == null) {
      return;
    }
    if (list.size() <= lelve) {
      //说明当前层，还没有开始存数据，进行初始化
      list.add(lelve, new ArrayList<Integer>());
    }
    //将当前节点的数据存储到当前层
    list.get(lelve).add(root.val);

    //继续遍历遍历下一层的数据
    dfs(root.left, lelve + 1, list);
    dfs(root.right, lelve + 1, list);
  }
}
