package testNiuKe;

import java.util.Scanner;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/3/25 10:49
 * @description：
 * @modified By：
 * @version: 1.0
 */

/**
 * 题目描述
 * 计算字符串最后一个单词的长度，单词以空格隔开。
 * 输入描述:
 * 一行字符串，非空，长度小于5000。
 *
 * 输出描述:
 * 整数N，最后一个单词的长度。
 */
public class Main4 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    if (scanner.hasNextLine()) {
      String next = scanner.nextLine();
      String[] strs = next.split("\\s+");
      String lastStr = strs[strs.length - 1];
      System.out.println(lastStr.length());
    }
    scanner.close();
  }

}
