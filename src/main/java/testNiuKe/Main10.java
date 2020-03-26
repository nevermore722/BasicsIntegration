package testNiuKe;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/3/25 22:43
 * @description：
 * @modified By：
 * @version: 1.0
 */

/**
 * 题目描述
 * 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 *
 * 输入描述:
 * 输入一个int型整数
 *
 * 输出描述:
 * 按照从右向左的阅读顺序，返回一个不含重复数字的新的整数
 */
public class Main10 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    if (scanner.hasNextInt()) {
      int nextInt = scanner.nextInt();
      String str = String.valueOf(nextInt);

      char[] chars = str.toCharArray();
      int index = chars.length;
      Set set = new HashSet();
      for (int i = index - 1; i >= 0; i--) {
        //如果不包含，打印
        if (!set.contains(chars[i])) {
          System.out.print(chars[i]);
        }
        set.add(chars[i]);
      }
    }
    scanner.close();
  }
}
