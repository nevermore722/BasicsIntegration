package exam.huaweiExam2;

import com.alibaba.fastjson.JSON;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/5/7 10:47
 * @description：
 * @modified By：
 * @version: 1.0
 *
 * *PriorityQueue
 */
public class Test1 {

  public static void main(String[] args) {
    int[] aaa = {5,7,3,2,6,8,9};
    int[] k = getK(aaa, 4);
    System.out.println(JSON.toJSONString(k));
  }

  public static int[] getK(int[] ints, int k) {
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

    int[] returnInts = new int[k];
    for (int i = 0; i < ints.length; i++) {
      if (i < k ) {
        priorityQueue.offer(ints[i]);
      } else {
        Integer poll = priorityQueue.poll();
        int maxValue = poll;
        if (poll < ints[i]) {
          maxValue = ints[i];
        }
        priorityQueue.offer(maxValue);
      }
    }

    for (int i = 0; i < k; i++) {
      returnInts[i] = priorityQueue.poll();
    }

    return returnInts;
  }

}
