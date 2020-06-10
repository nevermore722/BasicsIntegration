package leetcodePractice;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/6/10 22:53
 * @description： 204. 计数质数
 * @modified By：
 * @version: 1.0
 */

/**
 * 统计所有小于非负整数 n 的质数的数量。
 *
 * 示例:
 *
 * 输入: 10 输出: 4 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 */
public class Test204 {

  public int countPrimes(int n) {
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = 1;
    }
    for (int i = 2; i < n; i++) {
      if (nums[i] == 1) {
        //将对应的倍数变为0
        for (int j = 2; i * j < n; j++) {
          nums[i * j] = 0;
        }
      }
    }
    //遍历数组，统计值为1的元素个数
    int res = 0;
    for (int i = 2; i < n; i++) {
      if (nums[i] == 1) {
        res++;
      }
    }
    return res;
  }
}
