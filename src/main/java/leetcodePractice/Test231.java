package leetcodePractice;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/7/2 22:52
 * @description： 231. 2的幂
 * @modified By：
 * @version: 1.0
 */

/**
 * 给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
 *
 * 示例 1:
 *
 * 输入: 1 输出: true 解释: 20 = 1 示例 2:
 *
 * 输入: 16 输出: true 解释: 24 = 16 示例 3:
 *
 * 输入: 218 输出: false
 */
public class Test231 {

  public boolean isPowerOfTwo(int n) {
    if (n == 0) {
      return false;
    }
    long x = (long) n;
    return (x & (-x)) == x;

  }
}
