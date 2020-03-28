package exam.hauWeiExam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/3/27 16:11
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class Main2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
//    Map<String, Long> map = new TreeMap<>();
    List<RongLiang> list = new ArrayList<>();
    for (int i = 0; i < num; i++) {
      if (scanner.hasNext()) {
        String nextLine = scanner.next();
        //容量
        String m = nextLine.substring(0, nextLine.length() - 1);
        //单位
        String v = nextLine.substring(nextLine.length() - 1, nextLine.length());
        if (v.equals("T")) {
//          map.put(nextLine, Long.parseLong(m) * 1000000);
          RongLiang rongLiang = new RongLiang();
          rongLiang.setMv(nextLine);
          rongLiang.setCalNum(Long.parseLong(m) * 1000000);
          list.add(rongLiang);
        }
        if (v.equals("G")) {
//          map.put(nextLine, Long.parseLong(m) * 1000);
          RongLiang rongLiang = new RongLiang();
          rongLiang.setMv(nextLine);
          rongLiang.setCalNum(Long.parseLong(m) * 1000);
          list.add(rongLiang);
        }
        if (v.equals("M")) {
//          map.put(nextLine, Long.parseLong(m));
          RongLiang rongLiang = new RongLiang();
          rongLiang.setMv(nextLine);
          rongLiang.setCalNum(Long.parseLong(m) * 1);
          list.add(rongLiang);
        }
      }
    }
    list.stream().sorted(Comparator.comparing(RongLiang::getCalNum)).forEach(e ->
        System.out.println(e.getMv()));
//    map.entrySet().forEach((e) ->
//        System.out.println(e.getKey())
//    );

  }

}

class RongLiang {

  //容量大小
  private String mv;
  //计算出的大小
  private Long calNum;

  public String getMv() {
    return mv;
  }

  public void setMv(String mv) {
    this.mv = mv;
  }

  public Long getCalNum() {
    return calNum;
  }

  public void setCalNum(Long calNum) {
    this.calNum = calNum;
  }
}