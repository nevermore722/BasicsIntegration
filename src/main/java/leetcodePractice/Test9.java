package leetcodePractice;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/4/19 22:58
 * @description： 9. 回文数 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * @modified By：
 * @version: 1.0
 */
public class Test9 {

  public static void main(String[] args) {
    boolean flag = isPalindrome(-121);
    System.out.println(flag);
  }

  public static boolean isPalindrome(int x) {
    char[] chars = String.valueOf(x).toCharArray();
    boolean flag = true;
    for (int i = 0; i <= chars.length / 2; i++) {
      if (chars[i] != chars[chars.length - i - 1]) {
        flag = false;
      }
    }
    return flag;
  }
}
