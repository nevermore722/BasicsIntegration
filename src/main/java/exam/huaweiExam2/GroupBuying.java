package exam.huaweiExam2;

import com.alibaba.fastjson.JSON;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/5/7 12:16
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class GroupBuying {

  public static final String GROUPBUYING = "GroupBuying";
  public static final String JOIN = "join";
  public static final String REMOVEFROM = "removeFrom";
  public static final String REMOVELAST = "removeLast";

  public static void main(String[] args) {
    /*GroupBuying group = new GroupBuying(2);
    group.join(1);
    group.join(1);
    group.join(1);
    group.join(4);
    group.join(5);
    group.removeFrom(0);
    group.join(20);
    group.join(21);
    group.removeFrom(0);
    group.removeFrom(2);
    int a1 = group.removeLast();
    int a2 = group.removeLast();
    int a3 = group.removeLast();
    int a4 = group.removeLast();
    int a5 = group.removeLast();

    System.out.println(a1);
    System.out.println(a2);
    System.out.println(a3);
    System.out.println(a4);
    System.out.println(a5);

    System.out.println(group.list);*/

    /**
     * 两遍输入的参数：
     * ["GroupBuying","join","join","join","join","join","removeFrom","join","join","removeFrom","removeFrom","removeLast","removeLast","removeLast","removeLast","removeLast"]
     *
     * [ [2], [1], [1], [1], [4], [5], [0], [20], [21], [0], [2], [], [], [], [], [] ]
     */
    Scanner scanner = new Scanner(System.in);
    if (scanner.hasNextLine()) {
      String next1 = scanner.nextLine();
      String next2 = scanner.nextLine();

      String regexp1 = "\"";
      String regexp2 = "\\[";
      String regexp3 = "\\]";
      String substring1 = next1.substring(1, next1.length() - 1).replaceAll(regexp1, "");
      String substring2 = next2.substring(1, next2.length() - 1).replaceAll(" ", "")
          .replaceAll(regexp2, "").replaceAll(regexp3, "");

      String[] split1 = substring1.split(",");
      String[] split2 = substring2.split(",");

      Integer[] returnInts = new Integer[split1.length];
      GroupBuying group = new GroupBuying(0);
      for (int i = 0; i < split1.length; i++) {
        if (GROUPBUYING.equals(split1[i])) {
          group = new GroupBuying(Integer.parseInt(split2[i]));
          returnInts[i] = null;
        } else if (JOIN.equals(split1[i])) {
          group.join(Integer.parseInt(split2[i]));
          returnInts[i] = null;
        } else if (REMOVEFROM.equals(split1[i])) {
          int removeFrom = group.removeFrom(Integer.parseInt(split2[i]));
          returnInts[i] = removeFrom;
        } else if (REMOVELAST.equals(split1[i])) {
          int removeLast = group.removeLast();
          returnInts[i] = removeLast;
        }
      }
/*
      System.out.println(JSON.toJSONString(split1));
      System.out.println(JSON.toJSONString(split2));*/

      /**
       * 输出的参数 [null,null,null,null,null,null,1,null,null,20,21,5,4,1,1,-1]  符合案例
       */
      System.out.println(JSON.toJSONString(returnInts));
    }


  }

  public int ptSize;
  //定义拼团数据结构
  List<Stack> list = new ArrayList<>();


  public GroupBuying(int eachSize) {
    //定义每个团的配额
    this.ptSize = eachSize;
  }

  //加入拼团
  public void join(int id) {
    boolean newStackFlag = true;
    for (Stack s : list) {
      if (s.size() < ptSize) {
        s.push(id);
        newStackFlag = false;
        break;
      }
    }
    if (newStackFlag) {
      Stack stack = new Stack();
      stack.push(id);
      list.add(stack);
    }
  }

  public int removeFrom(int groupIndex) {
    Stack stack = list.get(groupIndex);
    if (stack.size() == 0) {
      return -1;
    } else {
      return (int) stack.pop();
    }
  }

  public int removeLast() {
    int pop = -1;
    for (int i = list.size() - 1; i >= 0; i--) {
      if (list.get(i).size() != 0) {
        pop = (int) list.get(i).pop();
        if (list.get(i).size() == 0) {
          list.remove(i);
        }
        break;
      }
    }
    return pop;
  }
}
