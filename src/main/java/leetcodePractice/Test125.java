package leetcodePractice;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/5/12 22:11
 * @description： 125. 验证回文串
 * @modified By：
 * @version: 1.0
 */

/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 示例 1:
 *
 * 输入: "A man, a plan, a canal: Panama" 输出: true 示例 2:
 *
 * 输入: "race a car" 输出: false
 */
public class Test125 {

  public static void main(String[] args) {
    String str = "A man, a plan, a canal: Panama";
    boolean b = isPalindrome(str);
    System.out.println(b);
  }

  public static boolean isPalindrome(String s) {
    if (s.length() == 0) {
      return true;
    }

    String low = s.toLowerCase();
    int i = 0;
    int j = low.length() - 1;

    while (i < j) {
      if (!Character.isLetterOrDigit(low.charAt(i))) {
        i++;
        continue;
      }
      if (!Character.isLetterOrDigit(low.charAt(j))) {
        j--;
        continue;
      }
      if (low.charAt(i) != low.charAt(j)) {
        return false;
      } else {
        i++;
        j--;
      }
    }
    return true;
  }
}
