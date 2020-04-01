package exam.hauWeiExam;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/4/1 10:18
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class Node {

  public int value;

  public Node next;

  public Node(int value) {
    this.value = value;
  }


  @Override
  public String toString() {
    return "Node{" +
        "value=" + value +
        ", next=" + next +
        '}';
  }
}

