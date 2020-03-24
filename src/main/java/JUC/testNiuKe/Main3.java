package JUC.testNiuKe;

import java.util.Scanner;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/3/23 23:57
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class Main3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String sixTeenNum = scanner.nextLine();
    String newSixTeenNum = sixTeenNum.substring(2, sixTeenNum.length());
    long tenNum = Long.parseLong(newSixTeenNum, 16);
    System.out.println(tenNum);
  }
}
