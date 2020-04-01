package exam.hauWeiExam;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/4/1 10:24
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class Select {

  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5};
    int i = selectIndex(a, 6, 0, a.length);
    System.out.println(i);
  }

  public static int selectIndex(int[] i, int num, int begin, int end) {
    int midel = (begin + end) / 2;

    int returnValue = 0;

    if (num == i[midel]) {
      return midel;
    } else if (num > i[midel]) {
      if (midel == ((midel + end) / 2) && i[midel] != num) {
        return -1;
      }
      returnValue = selectIndex(i, num, midel, end);
    } else if (num < i[midel]) {
      if (midel == ((midel + begin) / 2) && i[midel] != num) {
        return -1;
      }
      returnValue = selectIndex(i, num, begin, midel);
    }
    return returnValue;
  }

}
