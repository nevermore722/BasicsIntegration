package leetcodePractice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/5/25 22:34
 * @description： 169. 多数元素
 * @modified By：
 * @version: 1.0
 */

/**
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: [3,2,3] 输出: 3 示例 2:
 *
 * 输入: [2,2,1,1,1,2,2] 输出: 2
 */
public class Test169 {

  public int majorityElement(int[] nums) {
    Map<Integer, Integer> counter = new HashMap<>();
    // 遍历每个数统计次数
    for (int num : nums) {
      counter.put(num, counter.getOrDefault(num, 0) + 1);
      // 如果某个数次数超过了n/2就返回
      if (counter.get(num) > nums.length / 2) {
        return num;
      }
    }
    return -1;
  }
}
