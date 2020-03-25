package JUC.testNiuKe;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/3/25 18:14
 * @description：
 * @modified By：
 * @version: 1.0
 */

/**
 * 题目描述 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 *
 * 输入描述: 输入一个正浮点数值
 *
 * 输出描述: 输出该数值的近似整数值
 */
public class Main8 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    if (scanner.hasNextFloat()) {
      float nextFloat = scanner.nextFloat();
      BigDecimal bigDecimal = BigDecimal.valueOf(nextFloat);
      //BigDecimal四舍五入
      System.out.println(bigDecimal.setScale(0, BigDecimal.ROUND_HALF_UP));
    }
  }

}
