package leetcodePractice;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/6/18 23:19
 * @description： 206. 反转链表
 * @modified By：
 * @version: 1.0
 */

/**
 * 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 *
 */
public class Test206 {

  public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode p = reverseList(head.next);
    head.next.next = head;
    head.next = null;
    return p;
  }
}
