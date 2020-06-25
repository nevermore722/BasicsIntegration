package leetcodePractice;

import java.util.LinkedList;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/6/25 23:30
 * @description： 225. 用队列实现栈
 * @modified By：
 * @version: 1.0
 */

/**
 * 使用队列实现栈的下列操作：
 *
 * push(x) -- 元素 x 入栈
 * pop() -- 移除栈顶元素
 * top() -- 获取栈顶元素
 * empty() -- 返回栈是否为空
 * 注意:
 *
 * 你只能使用队列的基本操作-- 也就是 push to back, peek/pop from front, size, 和 is empty 这些操作是合法的。
 * 你所使用的语言也许不支持队列。 你可以使用 list 或者 deque（双端队列）来模拟一个队列 , 只要是标准的队列操作即可。
 * 你可以假设所有操作都是有效的（例如, 对一个空的栈不会调用 pop 或者 top 操作）。
 *
 */
public class Test225 {

  LinkedList<Integer> queue1 = new LinkedList<Integer>();

  public void push(int x) {
    queue1.add(x);
  }

  public int pop() {
    LinkedList<Integer> queue2 = new LinkedList<Integer>();//声明辅助队列
    int count = 0;//记录queue1的长度
    //这里我的处理比较麻烦，可以用官方给的queue1.size()判断，如果长度等于1了，说明只剩下一个元素，即为栈顶元素，可以省略这个while循环
    while (true) {
      count += 1;
      queue2.add(queue1.poll());
      if (queue1.isEmpty()) {
        break;
      }
    }
    int res = 0;
    for (int i = 0; i < count - 1; i++) {
      queue1.add(queue2.poll());
      //把queue2里的元素再次转入queue1，但是剩余一个，就是栈里的栈顶元素
    }
    res = queue2.peek();
    return res;
  }

  public int top() {//类似pop()，比pop少一个while循环，只用记录最后一个元素即可
    LinkedList<Integer> queue2 = new LinkedList<Integer>();
    int res;
    while (true) {
      res = queue1.peek();
      queue2.add(queue1.poll());
      if (queue1.isEmpty()) {
        break;
      }
    }
    queue1 = queue2;
    return res;
  }

  public boolean empty() {
    if (queue1.isEmpty()) {
      return true;
    }
    return false;
  }
}
