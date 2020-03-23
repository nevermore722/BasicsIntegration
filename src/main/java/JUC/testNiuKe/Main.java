package JUC.testNiuKe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/3/23 22:30
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    List list = new ArrayList();
    while (scan.hasNextInt()) {
      int inputNum = scan.nextInt();
//      if (inputNum != 0) {
//        list.add(inputNum);
//      }else {
//        for (int i = 0;i<list.size();i++){
//          int allDringNum = calculateNum(0, (Integer) list.get(i));
          int allDringNum = calculateNum(0, inputNum);
          System.out.println(allDringNum);
//        }
//      }
    }
    scan.close();
  }

  public static int calculateNum(Integer allDringNum, Integer emptyNum) {
    //当前喝掉的瓶数
    Integer nowDrinkNum = 0;
    Integer allNum = allDringNum;
    nowDrinkNum = emptyNum / 3;
    //喝掉的总瓶数
    allNum += nowDrinkNum;
    emptyNum = emptyNum % 3 + nowDrinkNum;
    if (emptyNum >= 3) {
      allNum = calculateNum(allNum, emptyNum);
    } else if (emptyNum == 2) {
      allNum = allNum + 1;
    }
    return allNum;
  }
}
