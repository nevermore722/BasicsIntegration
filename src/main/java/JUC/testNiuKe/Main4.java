package JUC.testNiuKe;

import java.util.Scanner;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/3/25 10:49
 * @description：
 * @modified By：
 * @version: 1.0
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
