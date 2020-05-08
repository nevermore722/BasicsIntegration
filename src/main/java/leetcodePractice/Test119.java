package leetcodePractice;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/5/8 22:02
 * @description： 119. 杨辉三角 II
 * @modified By：
 * @version: 1.0
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 *
 *
 *
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 *
 * 输入: 3 输出: [1,3,3,1] 进阶：
 *
 * 你可以优化你的算法到 O(k) 空间复杂度吗？
 */
public class Test119 {

  public List<Integer> getRow(int rowIndex) {
    List<Integer> res = new ArrayList<>();

    res.add(1);
    if (rowIndex == 0) {
      return res;
    }
    res.add(1);
    if (rowIndex == 1) {
      return res;
    }

    for (int i = 2; i <= rowIndex; i++) {
      res.add(1);
      for (int j = res.size() - 2; j > 0; j--) {
        res.add(j, res.get(j - 1) + res.remove(j));
      }
    }

    return res;
  }
}
