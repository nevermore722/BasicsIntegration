package leetcodePractice;

import java.util.Stack;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/5/16 23:22
 * @description： 155. 最小栈
 * @modified By：
 * @version: 1.0
 */
public class Test155 {

  private Node head;
  private int min;

  /**
   * initialize your data structure here.
   */
//  public MinStack() {
  public Test155() {
    min = Integer.MAX_VALUE;
  }

  public void push(int x) {
    Node temp = new Node(x);
    temp.next = head;
    head = temp;
    if (x < min) {
      min = x;
    }
  }

  public void pop() {
    if (head.val == min) {
      int temp = Integer.MAX_VALUE;
      Node tempNode = head.next;
      while (tempNode != null) {
        if (tempNode.val < temp) {
          temp = tempNode.val;
        }
        tempNode = tempNode.next;
      }
      min = temp;
    }
    head = head.next;
  }

  public int top() {
    return head.val;
  }

  public int getMin() {
    return min;
  }

  class Node {

    public int val;
    public Node next;

    public Node(int val) {
      this.val = val;
    }
  }


}
