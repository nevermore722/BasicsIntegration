package leetcodePractice;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/6/17 23:10
 * @description： 205. 同构字符串
 * @modified By：
 * @version: 1.0
 */

import java.util.HashMap;
import org.junit.jupiter.api.Test;

/**
 * 给定两个字符串 s 和 t，判断它们是否是同构的。
 *
 * 如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
 *
 * 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。
 *
 * 示例 1:
 *
 * 输入: s = "egg", t = "add" 输出: true 示例 2:
 *
 * 输入: s = "foo", t = "bar" 输出: false 示例 3:
 *
 * 输入: s = "paper", t = "title" 输出: true 说明: 你可以假设 s 和 t 具有相同的长度。
 */
public class Test205 {

  @Test
  public void test(){
    boolean isomorphic = isIsomorphic("foo","bar");
    System.out.println(isomorphic);
  }


  public boolean isIsomorphic(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    //关于A->B的映射
    HashMap<Character, Character> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      char sc = s.charAt(i);
      char tc = t.charAt(i);
      if (map.get(sc) == null) {
        if (map.containsValue(tc)) {
          return false;
        }
        map.put(sc, tc);  // 建立映射关系
      } else if (map.get(sc) != tc) {
        return false;
      }
    }
    return true;
  }
}
