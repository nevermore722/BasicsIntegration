package algorithmStudy;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/4/24 16:15
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class ReverseNode {

  public static void main(String[] args) {
    Node node1 = new Node(1);
    Node node2 = new Node(2);
    Node node3 = new Node(3);
    Node node4 = new Node(4);
    Node node5 = new Node(5);
    Node head = new Node(6);
    node4.next = node5;
    node3.next = node4;
    node2.next = node3;
    node1.next = node2;
    head.next = node1;
    reverseList(head);
    System.out.println(head);
  }

  public static void reverseList(Node head) {

    Node curNode = head.next;
    Node next = null;
    Node reversalNode = new Node(0);
    while (curNode != null) {
      next = curNode.next;
      curNode.next = reversalNode.next;
      reversalNode.next = curNode;
      curNode = next;
    }
    head.next = reversalNode.next;
  }
}
