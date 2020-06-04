package leetcodePractice;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/6/4 22:37
 * @description： 190. 颠倒二进制位
 * @modified By：
 * @version: 1.0
 */

/**
 * 颠倒给定的 32 位无符号整数的二进制位。
 *
 *  
 *
 * 示例 1：
 *
 * 输入: 00000010100101000001111010011100 输出: 00111001011110000010100101000000 解释: 输入的二进制串
 * 00000010100101000001111010011100 表示无符号整数 43261596， 因此返回 964176192，其二进制表示形式为
 * 00111001011110000010100101000000。 示例 2：
 *
 * 输入：11111111111111111111111111111101 输出：10111111111111111111111111111111 解释：输入的二进制串
 * 11111111111111111111111111111101 表示无符号整数 4294967293，      因此返回 3221225471 其二进制表示形式为
 * 10111111111111111111111111111111 。  
 *
 * 提示：
 *
 * 请注意，在某些语言（如 Java）中，没有无符号整数类型。在这种情况下，输入和输出都将被指定为有符号整数类型，并且不应影响您的实现，因为无论整数是有符号的还是无符号的，其内部的二进制表示形式都是相同的。
 * 在 Java 中，编译器使用二进制补码记法来表示有符号整数。因此，在上面的 示例 2 中，输入表示有符号整数 -3，输出表示有符号整数 -1073741825。  
 *
 * 进阶: 如果多次调用这个函数，你将如何优化你的算法？
 */
public class Test190 {

  public int reverseBits(int n) {
    //将int转化为二进制字符串
    String binaryString = Integer.toBinaryString(n);
    int length = binaryString.length();
    StringBuilder sb = new StringBuilder();
    //对不够32位的二进制进行补齐
    if (length < 32) {
      int dfs = 32 - length;
      for (int i = 0; i < dfs; i++) {
        sb.append('0');
      }
    }
    sb.append(binaryString);
    String result = sb.reverse().toString();
    int reverse = Integer.parseUnsignedInt(result, 2);
    return reverse;

  }

}
