package JUC.testNiuKe;

import java.util.Scanner;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/3/25 12:39
 * @description：
 * @modified By：
 * @version: 1.0
 */

/**
 * 题目描述
 * •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 * •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 * 输入描述:
 * 连续输入字符串(输入2次,每个字符串长度小于100)
 *
 * 输出描述:
 * 输出到长度为8的新字符串数组
 */
public class Main6 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    if (scanner.hasNextLine()) {
      String nextLine1 = scanner.nextLine();
      String nextLine2 = scanner.nextLine();

      printStr(nextLine1);
      printStr(nextLine2);
    }
  }

  public static void printStr(String str) {
    if (str.length() <= 8) {
      System.out.print(str);
      for (int i = 0; i < (8 - str.length()); i++) {
        System.out.print(0);
      }
    } else {
      int eightTimes = str.length() / 8;
      for (int i = 0; i < eightTimes; i++) {
        String newStr = str.substring(i * 8, (i + 1) * 8);
        System.out.println(newStr);
      }
      if (str.length() > eightTimes * 8) {
        System.out.print(str.substring(8 * eightTimes, str.length()));
        for (int i = 0; i < ((8 * (eightTimes + 1)) - str.length()); i++) {
          System.out.print(0);
        }
        System.out.println();
      }
    }
  }

}
