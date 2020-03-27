package testNiuKe;

import static java.util.regex.Pattern.*;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/3/27 11:34
 * @description：
 * @modified By：
 * @version: 1.0
 */

/**
 * 题目描述
 * 开发一个坐标计算工具， A表示向左移动，D表示向右移动，W表示向上移动，S表示向下移动。从（0,0）点开始移动，从输入字符串里面读取一些坐标，并将最终输入结果输出到输出文件里面。
 *
 * 输入：
 *
 * 合法坐标为A(或者D或者W或者S) + 数字（两位以内）
 *
 * 坐标之间以;分隔。
 *
 * 非法坐标点需要进行丢弃。如AA10;  A1A;  $%$;  YAD; 等。
 *
 * 下面是一个简单的例子 如：
 *
 * A10;S20;W10;D30;X;A1A;B10A11;;A10;
 *
 * 处理过程：
 *
 * 起点（0,0）
 *
 * +   A10   =  （-10,0）
 *
 * +   S20   =  (-10,-20)
 *
 * +   W10  =  (-10,-10)
 *
 * +   D30  =  (20,-10)
 *
 * +   x    =  无效
 *
 * +   A1A   =  无效
 *
 * +   B10A11   =  无效
 *
 * +  一个空 不影响
 *
 * +   A10  =  (10,-10)
 *
 * 结果 （10， -10）
 *
 * 注意请处理多组输入输出
 *
 * 输入描述:
 * 一行字符串
 *
 * 输出描述:
 * 最终坐标，以,分隔
 */
public class Main18 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNextLine()) {
      //横坐标
      int abscissa = 0;
      //纵坐标
      int ordinate = 0;
      String nextLine = scanner.nextLine();
      String[] split = nextLine.split(";");
      Pattern pattern = compile("[0-9]*");
      for (int i = 0; i < split.length; i++) {
        String str = split[i];
        if (str.length() <= 3 && str.length() > 0) {
          String firstStr = str.substring(0, 1);
          if (firstStr.equals("A") && pattern.matcher(str.substring(1, str.length())).matches()) {
            abscissa = abscissa - Integer.parseInt(str.substring(1, str.length()));
          }
          if (firstStr.equals("D") && pattern.matcher(str.substring(1, str.length())).matches()) {
            abscissa = abscissa + Integer.parseInt(str.substring(1, str.length()));
          }
          if (firstStr.equals("W") && pattern.matcher(str.substring(1, str.length())).matches()) {
            ordinate = ordinate + Integer.parseInt(str.substring(1, str.length()));
          }
          if (firstStr.equals("S") && pattern.matcher(str.substring(1, str.length())).matches()) {
            ordinate = ordinate - Integer.parseInt(str.substring(1, str.length()));
          }
        }
      }
      System.out.println(abscissa + "," + ordinate);
    }
    scanner.close();

  }

}