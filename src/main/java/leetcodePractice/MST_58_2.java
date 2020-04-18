package leetcodePractice;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/4/18 23:43
 * @description： 面试题58 - II. 左旋转字符串
 * @modified By：
 * @version: 1.0
 */
public class MST_58_2 {

  public static void main(String[] args) {
    String str = reverseLeftWords("abcdefg", 2);
    System.out.println(str);
  }

  public static String reverseLeftWords(String s, int n) {
    String preString = s.substring(0, n);
    String lastString = s.substring(n, s.length());
    return lastString + preString;
  }
}
