package leetcodePractice;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/6/26 22:57
 * @description： 226. 翻转二叉树
 * @modified By：
 * @version: 1.0
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 *
 * 翻转一棵二叉树。
 *
 * 示例：
 *
 * 输入：
 *
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * 输出：
 *
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 *
 */
public class Test226 {
  public TreeNode invertTree(TreeNode T) {
    TreeNode tmp;
    if(T!=null) {
      if(T.left==null&&T.right==null) {//只有根节点，直接返回
        return T;
      }
      invertTree(T.left);	//翻转左子树，方法会一直调用，直到最左边的叶子结点
      invertTree(T.right);//翻转右子树，类比上面
      //交换两个叶子结点位置，并返回其双亲结点
      tmp=T.left;
      T.left=T.right;
      T.right=tmp;
      return T;
    }
    return null;
  }
}
