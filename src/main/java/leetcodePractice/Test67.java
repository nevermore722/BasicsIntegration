package leetcodePractice;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/4/29 22:38
 * @description： 67. 二进制求和
 * @modified By：
 * @version: 1.0
 */

/**
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 *
 * 输入为 非空 字符串且只包含数字 1 和 0。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 *
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 *  
 *
 * 提示：
 *
 * 每个字符串仅由字符 '0' 或 '1' 组成。
 * 1 <= a.length, b.length <= 10^4
 * 字符串如果不是 "0" ，就都不含前导零。
 *
 */
public class Test67 {

  public String addBinary(String a, String b) {
    StringBuilder sb = new StringBuilder();
    int aLength = a.length();
    int bLength = b.length();
    int max = Math.max(aLength, bLength);
    StringBuilder ar = new StringBuilder(a).reverse();
    StringBuilder br = new StringBuilder(b).reverse();
    //是否进位
    boolean isCarry = false;
    for (int i = 0; i < max; i++) {
      char aChar = i >= aLength ? '0' : ar.charAt(i);
      char bChar = i >= bLength ? '0' : br.charAt(i);
      if (aChar == '1' && bChar == '1') {
        sb.append(isCarry ? '1' : '0');
        isCarry = true;
      } else if (aChar == '0' && bChar == '0') {
        sb.append(isCarry ? '1' : '0');
        isCarry = false;
      } else {
        sb.append(isCarry ? '0' : '1');
      }
    }
    if (isCarry) {
      sb.append("1");
    }
    return sb.reverse().toString();
  }


}
