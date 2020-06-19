package leetcodePractice;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/6/19 22:31
 * @description： 217. 存在重复元素
 * @modified By：
 * @version: 1.0
 */

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

/**
 * 给定一个整数数组，判断是否存在重复元素。
 *
 * 如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: [1,2,3,1] 输出: true 示例 2:
 *
 * 输入: [1,2,3,4] 输出: false 示例 3:
 *
 * 输入: [1,1,1,3,3,4,3,2,4,2] 输出: true
 */
public class Test217 {

  @Test
  public void test() {
    int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
    boolean b = containsDuplicate(nums);
    System.out.println(b);
  }

  public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>(nums.length);
    for (int x : nums) {
      if (set.contains(x)) {
        return true;
      } else {
        set.add(x);
      }
    }
    return false;

  }
}
