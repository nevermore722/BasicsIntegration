package leetcodePractice;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/5/1 22:47
 * @description： 88. 合并两个有序数组
 * @modified By：
 * @version: 1.0
 */

import com.alibaba.fastjson.JSON;

/**
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 *
 *  
 *
 * 说明:
 *
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。  
 *
 * 示例:
 *
 * 输入: nums1 = [1,2,3,0,0,0], m = 3 nums2 = [2,5,6],       n = 3
 *
 * 输出: [1,2,2,3,5,6]
 */
public class Test88 {

  public static void main(String[] args) {
    int[] nums1 = { 0};
    int[] nums2 = { 1};
    int[] merge = merge(nums1, 0, nums2, 1);
    System.out.println(JSON.toJSONString(merge));
  }

  public static int[] merge(int[] nums1, int m, int[] nums2, int n) {

    int a = m - 1;
    int b = n - 1;
    for (int i = m + n - 1; i >= 0; i--) {
      if (a == -1) {
        nums1[i] = nums2[b];
        b--;
        continue;
      }
      if (b == -1) {
        nums1[i] = nums1[a];
        a--;
        continue;
      }
      if (nums1[a] > nums2[b]) {
        nums1[i] = nums1[a];
        a--;
      } else {
        nums1[i] = nums2[b];
        b--;
      }
    }
    return nums1;
  }
}
