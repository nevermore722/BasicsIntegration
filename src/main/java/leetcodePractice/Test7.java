package leetcodePractice;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/4/18 23:52
 * @description： 7. 整数反转
 * @modified By：
 * @version: 1.0
 */
public class Test7 {

  public static void main(String[] args) {
    int returnValue = reverse(56789);
    System.out.println(returnValue);
  }

  public static int reverse(int x) {
    long n = 0;
    while (x != 0) {
      n = n * 10 + x % 10;
      x = x / 10;
    }
    return (int) n == n ? (int) n : 0;
  }
}
