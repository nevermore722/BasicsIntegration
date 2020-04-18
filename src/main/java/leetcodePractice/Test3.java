package leetcodePractice;

import java.util.HashMap;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/4/18 23:01
 * @description： 3. 无重复字符的最长子串
 * @modified By：
 * @version: 1.0
 */
public class Test3 {

  public static void main(String[] args) {
    int length = lengthOfLongestSubstring("abcabcbb");
    System.out.println(length);
  }

  public static int lengthOfLongestSubstring(String s) {
    char[] ss = s.toCharArray() ;
    int left = 0 , right = 0 , n = ss.length ;
    int max = Integer.MIN_VALUE ;
    HashMap<Character,Integer> map = new HashMap<>() ;
    while(right < n){
      if(map.containsKey(ss[right])){      //当前字符已在滑动窗口内
        max = Math.max(max,right - left) ;  //记录遍历至此最长的符合题意的字符串。right-left为当前窗口大小
        int temp = map.get(ss[right]) ;
        for(int i = left ; i <= temp ; i++){
          map.remove(ss[i]) ;     // 清除部分map记录
        }
        left = temp + 1 ;   // 调整滑动窗口的左端点
      }
      map.put(ss[right],right) ;
      right++ ;
    }
    return Math.max(max,right - left) ;
  }
}
