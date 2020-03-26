package testNiuKe;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/3/25 18:29
 * @description：
 * @modified By：
 * @version: 1.0
 */

/**
 * 题目描述
 * 数据表记录包含表索引和数值（int范围的整数），请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
 *
 * 输入描述:
 * 先输入键值对的个数
 * 然后输入成对的index和value值，以空格隔开
 *
 * 输出描述:
 * 输出合并后的键值对（多行）
 */
public class Main9 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    if (scanner.hasNextLine()) {
      //定义TreeMap对象
      Map<Integer, Integer> map = new HashMap<>();
      //输入的键值对的个数
      int num = Integer.parseInt(scanner.nextLine());
      for (int i = 0; i < num; i++) {
        String nextline = scanner.nextLine();
        String[] split = nextline.split(" ");
        if (map.containsKey(Integer.parseInt(split[0]))) {
          map.put(Integer.parseInt(split[0]), (map.get(Integer.parseInt(split[0])) + Integer.parseInt(split[1])));
        } else {
          map.put(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
        }
      }

      //对map按key进行排序
      Map<Integer, Integer> sortedMap = map.entrySet().stream()
          .sorted(Map.Entry.comparingByKey())
          .collect(
              Collectors.toMap(
                  Map.Entry::getKey,
                  Map.Entry::getValue,
                  (o1, o2) -> o1, LinkedHashMap::new
              )
          );
      //打印
      for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
        System.out.println(entry.getKey() + " " + entry.getValue());
      }
    }

    scanner.close();

  }
}
