package testNiuKe;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/3/26 11:15
 * @description：
 * @modified By：
 * @version: 1.0
 */

/**
 * 题目描述
 * 编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)，换行表示结束符，不算在字符里。不在范围内的不作统计。
 *
 * 输入描述:
 * 输入N个字符，字符在ACSII码范围内。
 *
 * 输出描述:
 * 输出范围在(0~127)字符的个数。
 */
public class Main11 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    if (scanner.hasNextLine()) {
      String nextLine = scanner.nextLine();
      //字符串转字符数组
      char[] chars = nextLine.toCharArray();

      int count = 0;
      Set set = new HashSet();
      for (int i = 0; i < chars.length; i++) {
        set.add(chars[i]);
      }
      System.out.println(set.size());
    }
    scanner.close();
  }

}
