package JUC.testNiuKe;

import java.util.Scanner;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/3/26 11:54
 * @description：
 * @modified By：
 * @version: 1.0
 */

/**
 * 输入描述:
 * 将一个英文语句以单词为单位逆序排放。
 *
 * 输出描述:
 * 得到逆序的句子
 */
public class Main14 {

  public static void main(String[] args) {
    //这不也是一回事吗
    Scanner scanner = new Scanner(System.in);
    if (scanner.hasNextLine()) {
      String nextLine = scanner.nextLine();
      String[] split = nextLine.split(" ");
      for (int i = split.length - 1; i >= 0; i--) {
        System.out.print(split[i] + " ");
      }
    }
    scanner.close();
  }
}
