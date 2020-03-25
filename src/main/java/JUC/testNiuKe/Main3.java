package JUC.testNiuKe;

import java.util.Scanner;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/3/23 23:57
 * @description：
 * @modified By：
 * @version: 1.0
 */

/**
 * 题目描述
 * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。（多组同时输入 ）
 *
 * 输入描述:
 * 输入一个十六进制的数值字符串。
 *
 * 输出描述:
 * 输出该数值的十进制字符串。
 */
public class Main3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNextLine()) {
      String sixTeenNum = scanner.nextLine();
      String newSixTeenNum = sixTeenNum.substring(2, sixTeenNum.length());
      long tenNum = Long.parseLong(newSixTeenNum, 16);
      System.out.println(tenNum);
    }
    scanner.close();
  }
}
