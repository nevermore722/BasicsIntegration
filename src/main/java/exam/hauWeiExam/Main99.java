package exam.hauWeiExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/4/1 12:03
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class Main99 {

  public static void main(String[] args) {
    int[] arr = {-3, 0, -6, 2, 4, 3};
    int maxMuti = getMaxMuti(arr);
    System.out.println(maxMuti);
  }

  public static int getMaxMuti(int[] arr) {

    //正数list
    List<Integer> zsList = new ArrayList();
    //负数list
    List<Integer> fsList = new ArrayList();

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > 0) {
        zsList.add(arr[i]);
      } else {
        fsList.add(arr[i]);
      }
    }
    Collections.sort(zsList);
    Collections.sort(fsList);

    int returnNum = 1;
    //若负数的数量为偶数
    if (fsList.size() % 2 == 0) {
      for (int i = 1; i < zsList.size(); i++) {
        returnNum = returnNum * zsList.get(i);
      }
      for (int i = 0; i < fsList.size(); i++) {
        returnNum = returnNum * fsList.get(i);
      }
    } else {
      //若负数的数量为基数
      if (fsList.size() % 2 != 0) {
        for (int i = 0; i < zsList.size(); i++) {
          returnNum = returnNum * zsList.get(i);
        }
        for (int i = 0; i < fsList.size() - 1; i++) {
          returnNum = returnNum * fsList.get(i);
        }
      }
    }
    return returnNum;
  }

}
