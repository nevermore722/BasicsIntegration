package testNiuKe;

import java.util.Scanner;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/3/26 12:33
 * @description：
 * @modified By：
 * @version: 1.0
 */

/**
 * 题目描述
 * 输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。
 *
 * 输入描述:
 *  输入一个整数（int类型）
 *
 * 输出描述:
 *  这个数转换成2进制后，输出1的个数
 */
public class Main16 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    if (scanner.hasNextInt()){
      int nextInt = scanner.nextInt();
      String binaryString = Integer.toBinaryString(nextInt);
      String newStr = binaryString.replace("1", "");
      System.out.println(binaryString.length()-newStr.length());
    }
  }
}
