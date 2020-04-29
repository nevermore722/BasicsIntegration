package leetcodePractice;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/4/29 23:06
 * @description：
 * @modified By：
 * @version: 1.0
 */

/**
 * 实现 int sqrt(int x) 函数。
 *
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 *
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 *
 * 示例 1:
 *
 * 输入: 4
 * 输出: 2
 * 示例 2:
 *
 * 输入: 8
 * 输出: 2
 * 说明: 8 的平方根是 2.82842...,
 *      由于返回类型是整数，小数部分将被舍去。
 *
 */
public class Test69 {

  public int mySqrt(int x) {
    long temp = 1, i = 1;

    while (temp < x) {
      i = i * 2;
      temp = i * i;
      if (temp != (int) temp) {
        break;
      }
    }

    i /= 2;
    while ((++i) * (i) <= x) {
      ;
    }

    return (int) --i;

  }

}
