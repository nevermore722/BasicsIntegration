package testNiuKe;

import java.util.Scanner;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/3/25 11:13
 * @description：
 * @modified By：
 * @version: 1.0
 */

/**
 * 题目描述
 * 写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
 *
 * 输入描述:
 * 第一行输入一个有字母和数字以及空格组成的字符串，第二行输入一个字符。
 *
 * 输出描述:
 * 输出输入字符串中含有该字符的个数。
 */
public class Main5 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    if (scanner.hasNextLine()) {
      String nextLine1 = scanner.nextLine();
      String nextLine2 = scanner.nextLine();
      int count = nextLine1.toLowerCase().length() - nextLine1.toLowerCase().replace(nextLine2.toLowerCase(), "").length();
      System.out.println(count);

    }
  }

}
