package JUC.testNiuKe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/3/23 23:39
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class Main2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List list = new ArrayList<Integer>();
    while (scanner.hasNextInt()){
      int num = scanner.nextInt();
      list.add(num);
    }
    list.stream().distinct().sorted().forEach(System.out::println);

  }


}
