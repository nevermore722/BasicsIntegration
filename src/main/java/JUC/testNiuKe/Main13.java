package JUC.testNiuKe;

import java.util.Scanner;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/3/26 11:49
 * @description：
 * @modified By：
 * @version: 1.0
 */

/**
 * 题目描述
 * 写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串。（字符串长度不超过1000）
 *
 * 输入描述:
 * 输入N个字符
 *
 * 输出描述:
 * 输出该字符串反转后的字符串
 *
 *
 * ！！！！！！！！！和上一道题目一样
 */
public class Main13 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    if (scanner.hasNextLine()) {
      String nextLine = scanner.nextLine();
      char[] chars = nextLine.toCharArray();
      for (int i = chars.length - 1; i >= 0; i--) {
        System.out.print(chars[i]);
      }

    }
  }
}
