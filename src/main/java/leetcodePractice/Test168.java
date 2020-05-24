package leetcodePractice;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/5/24 23:16
 * @description： 168. Excel表列名称
 * @modified By：
 * @version: 1.0
 */

/**
 * 给定一个正整数，返回它在 Excel 表中相对应的列名称。
 *
 * 例如，
 *
 * 1 -> A 2 -> B 3 -> C ... 26 -> Z 27 -> AA 28 -> AB ... 示例 1:
 *
 * 输入: 1 输出: "A" 示例 2:
 *
 * 输入: 28 输出: "AB" 示例 3:
 *
 * 输入: 701 输出: "ZY"
 */
public class Test168 {

  public String convertToTitle(int n) {
    StringBuilder ans = new StringBuilder();
    while (n > 0) {
      n--;
      char c = (char) ((n % 26) + 'A');
      n /= 26;
      ans.append(c);
    }
    return ans.reverse().toString();
  }

}
