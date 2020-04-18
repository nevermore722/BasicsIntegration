package leetcodePractice;

import com.alibaba.fastjson.JSON;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/4/18 21:43
 * @description： 1. 两数之和
 * @modified By：
 * @version: 1.0
 */
public class Test1 {

  public static void main(String[] args) {
    int[] nums = {2, 7, 11, 15};
    int[] returnValue = twoSum(nums, 9);
    System.out.println(JSON.toJSONString(returnValue));
  }

  public static int[] twoSum(int[] nums, int target) {

    int[] returnValue = new int[2];
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          returnValue[0] = i;
          returnValue[1] = j;
        }
      }
    }
    return returnValue;
  }
}
