package leetcodePractice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/5/6 22:23
 * @description： 118. 杨辉三角
 * @modified By：
 * @version: 1.0
 */
public class Test118 {

  public static void main(String[] args) {
    List<List<Integer>> generate = generate(9);
    System.out.println(generate);
  }

  public static List<List<Integer>> generate(int numRows) {
    List<List<Integer>> lists = new ArrayList<>();

    if (numRows == 0) {
      return lists;
    }

    if (numRows == 1) {
      lists.add(new ArrayList<>());
      lists.get(0).add(1);
      return lists;
    }

    lists = generate(numRows - 1);
    List<Integer> row = new ArrayList<>();
    row.add(1);
    for (int j = 1; j < numRows - 1; j++) {
      row.add(lists.get(numRows - 2).get(j - 1) + lists.get(numRows - 2).get(j));
    }
    row.add(1);
    lists.add(row);
    return lists;

  }
}
