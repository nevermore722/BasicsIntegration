package leetcodePractice;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/4/19 23:41
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class Test21 {

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if (l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }

    if (l1.val < l2.val) {
      l1.next = mergeTwoLists(l1.next, l2);
      return l1;
    } else {
      l2.next = mergeTwoLists(l1, l2.next);
      return l2;
    }
  }
}
