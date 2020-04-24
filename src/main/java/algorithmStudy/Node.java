package algorithmStudy;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/4/24 16:11
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class Node {

  //链表值
  int var;

  //指向下一结点
  Node next;

  Node(int x) {
    var = x;
  }


  @Override
  public String toString() {
    return "Node{" +
        "var=" + var +
        ", next=" + next +
        '}';
  }
}
