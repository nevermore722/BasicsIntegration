package leetcodePractice;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/5/4 22:50
 * @description： 108. 将有序数组转换为二叉搜索树
 * @modified By：
 * @version: 1.0
 */

/**
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 *
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 *
 * 示例:
 *
 * 给定有序数组: [-10,-3,0,5,9],
 *
 * 一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
 *
 * 0 / \ -3   9 /   / -10  5
 */
public class Test108 {

  public TreeNode sortedArrayToBST(int[] nums) {
    int lo = 0, hi = nums.length - 1;
    return create(nums, lo, hi);
  }

  private TreeNode create(int[] nums, int lo, int hi) {
    if (lo > hi) {
      return null;
    }
    if (lo == hi) {
      return new TreeNode(nums[lo]);
    }
    int mid = (hi - lo) / 2 + lo;
    TreeNode temp = new TreeNode(nums[mid]);
    temp.left = create(nums, lo, mid - 1);
    temp.right = create(nums, mid + 1, hi);
    return temp;
  }
}
