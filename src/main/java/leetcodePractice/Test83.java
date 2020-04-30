package leetcodePractice;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/4/30 23:11
 * @description： 83. 删除排序链表中的重复元素
 * @modified By：
 * @version: 1.0
 */

import com.alibaba.fastjson.JSON;

/**
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 * 示例 1:
 *
 * 输入: 1->1->2 输出: 1->2 示例 2:
 *
 * 输入: 1->1->2->3->3 输出: 1->2->3
 */
public class Test83 {

  public static void main(String[] args) {
    ListNode l1 = new ListNode(1);
    ListNode l2 = new ListNode(2);
    ListNode l3 = new ListNode(2);
    ListNode l4 = new ListNode(4);
    ListNode l5 = new ListNode(4);
    ListNode head = new ListNode(0);
    l1.next = l2;
    l2.next = l3;
    l3.next = l4;
    l4.next = l5;
    head.next = l1;
    ListNode listNode = deleteDuplicates(head);
    System.out.println(listNode);
  }

  public static ListNode deleteDuplicates(ListNode head) {
    ListNode cur = head;
    while (cur != null && cur.next != null) {
      if (cur.val == cur.next.val) {
        cur.next = cur.next.next;
      } else {
        cur = cur.next;
      }
    }
    return head;
  }
}
