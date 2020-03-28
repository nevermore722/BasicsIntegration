package exam.hauWeiExam;

import java.util.Scanner;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/3/27 15:32
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class Main1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    if (scanner.hasNextLine()) {
      //计算出的数字的大小
      int calNum = 0;
      String nextLine = scanner.nextLine();

      int calculate = calculate(nextLine);
      calNum = calculate;

      System.out.println(calNum);
    }
    scanner.close();
  }

  public static int calculate(String str) {
    char[] chars = str.toCharArray();
    if (chars[0] != '-') {
      for (int i = 0; i < chars.length; i++) {
        if (chars[i] == '+' || chars[i] == '-' || chars[i] == '*' || chars[i] == '/') {
          //前面的字符串
          String before = "";
          //后面的字符串
          String after = "";
          for (int j = 0; j < i; j++) {
            before = before + chars[j];
          }
          for (int k = i + 1; k < chars.length; k++) {
            after = after + chars[k];
          }
          if (chars[i] == '+') {
            return Integer.parseInt(after) + Integer.parseInt(before);
          }
          if (chars[i] == '-') {
            return Integer.parseInt(after) - Integer.parseInt(before);
          }
          if (chars[i] == '*') {
            return Integer.parseInt(after) * Integer.parseInt(before);
          }
          if (chars[i] == '/') {
            return Integer.parseInt(after) / Integer.parseInt(before);
          }
        }
      }
    } else {
      for (int i = 1;i<chars.length;i++){
        if (chars[i] == '+' || chars[i] == '-' || chars[i] == '*' || chars[i] == '*') {
          //前面的字符串
          String before = "";
          //后面的字符串
          String after = "";
          for (int j = 1; j < i; j++) {
            before = before + chars[j];
          }
          for (int k = i + 1; k < chars.length; k++) {
            after = after + chars[k];
          }
          if (chars[i] == '+') {
            return -Integer.parseInt(after) + Integer.parseInt(before);
          }
          if (chars[i] == '-') {
            return -Integer.parseInt(after) - Integer.parseInt(before);
          }
          if (chars[i] == '*') {
            return -Integer.parseInt(after) * Integer.parseInt(before);
          }
          if (chars[i] == '/') {
            return -Integer.parseInt(after) / Integer.parseInt(before);
          }
        }
      }
    }
    return 0;
  }
}
