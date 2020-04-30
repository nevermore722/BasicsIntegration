package mianshi;

import com.alibaba.fastjson.JSON;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/4/30 15:42
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class GetRandom {

  public static void main(String[] args) {
    int[] rands = getRands(5, 6);
    System.out.println(JSON.toJSONString(rands));
  }

  static int[] getRands(int m, int n) {
    int[] returnInts = new int[m];

    Map map = new HashMap<>();
    boolean flag = true;
    int index = 0;
    while (flag) {
      int tempValue = (int) (n * Math.random());
      if (map.containsKey(tempValue)) {
        continue;
      } else {
        map.put(tempValue, tempValue);
        returnInts[index] = tempValue;
        index++;
      }
      if (map.size() == m) {
        flag = false;
      }
    }
    return returnInts;
  }

}
