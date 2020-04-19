package leetcodePractice;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/4/19 23:22
 * @description： 14. 最长公共前缀
 * @modified By：
 * @version: 1.0
 */

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 */
public class Test14 {

  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) {
      return "";
    }
    if (strs.length == 1) {
      return strs[0];
    }
    String min = strs[0];
    for (int i = 0; i < strs.length; i++) {
      if (strs[i].isEmpty()) {
        return "";
      }
      if (strs[0].charAt(0) != strs[i].charAt(0)) {
        return "";
      }
      if (strs[i].length() <= min.length()) {
        min = strs[i];
      }
    }
    for (int i = 0; i < strs.length; i++) {
      if (min.equals(strs[i])) {
        continue;
      }
      for (int j = min.length() - 1; j > 0; j--) {
        if (min.charAt(j) != strs[i].charAt(j)) {
          min = min.substring(0, j);
        }
      }
    }
    return min;
  }
}
