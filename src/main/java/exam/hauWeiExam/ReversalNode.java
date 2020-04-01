package exam.hauWeiExam;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/4/1 17:38
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class ReversalNode {

  public static void main(String[] args) {

    Node node1 = new Node(1);
    Node node2 = new Node(2);
    Node node3 = new Node(3);
    Node node4 = new Node(4);
    Node node5 = new Node(5);

    Node head = new Node(0);
    head.next = node1;
    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node5;
    System.out.println("反转前head:" + head);

    reversalList(head);

    System.out.println("反转后head:" + head);


  }

  public static void reversalList(Node head) {
    //若head为空或者第一个节点为空，则不用反转
    if (head.next == null || head.next.next == null) {
      return;
    }

    //当前node
    Node curNode = head.next;
    //下一个结点
    Node next = null;
    //reversalNode 反转的node
    Node reversalNode = new Node(0);

    while (curNode != null) {
      next = curNode.next;
      curNode.next = reversalNode.next;
      reversalNode.next = curNode;
      curNode = next;
    }
    //反转完成
    head.next = reversalNode.next;

  }

}
