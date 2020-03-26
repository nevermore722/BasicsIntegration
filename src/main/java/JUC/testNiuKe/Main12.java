package JUC.testNiuKe;

import java.util.Scanner;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/3/26 11:45
 * @description：
 * @modified By：
 * @version: 1.0
 */

/**
 * 题目描述
 * 描述：
 *
 * 输入一个整数，将这个整数以字符串的形式逆序输出
 *
 * 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 *
 *
 * 输入描述:
 * 输入一个int整数
 *
 * 输出描述:
 * 将这个整数以字符串的形式逆序输出
 */
public class Main12 {

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
