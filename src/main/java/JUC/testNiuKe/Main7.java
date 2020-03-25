package JUC.testNiuKe;

import java.util.Scanner;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/3/25 17:40
 * @description：
 * @modified By：
 * @version: 1.0
 */

/**
 * 题目描述
 * 功能:输入一个正整数，按照从小到大的顺序输出它的所有质因子（如180的质因子为2 2 3 3 5 ）
 *
 * 最后一个数后面也要有空格
 *
 * 详细描述：
 *
 *
 * 函数接口说明：
 *
 * public String getResult(long ulDataInput)
 *
 * 输入参数：
 *
 * long ulDataInput：输入的正整数
 *
 * 返回值：
 *
 * String
 *
 *
 *
 * 输入描述:
 * 输入一个long型整数
 *
 * 输出描述:
 * 按照从小到大的顺序输出它的所有质数的因子，以空格隔开。最后一个数后面也要有空格。
 */
public class Main7 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    if (scanner.hasNextInt()) {
      long nextLong = scanner.nextLong();
      System.out.println(getResult(nextLong));
    }
    scanner.close();
  }

  public static String getResult(long ulDataInput) {
    //被除数
    long dividend = ulDataInput;

    //将要返回的字符串
    String retrunValue = "";

    for (int i = 2; i < Integer.MAX_VALUE; i++) {
      while (dividend % i == 0) {
        retrunValue = retrunValue + String.valueOf(i) + " ";
        dividend = dividend / i;
      }
      if (dividend == 1) {
        break;
      }
    }
    return retrunValue;
  }
}
