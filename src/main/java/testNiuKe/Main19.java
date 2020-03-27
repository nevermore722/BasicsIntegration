package testNiuKe;

import java.util.Scanner;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/3/27 12:19
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class Main19 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int addressA = 0;
    int addressB = 0;
    int addressC = 0;
    int addressD = 0;
    int addressE = 0;
    int errorAddress = 0;
    int privateAddressE = 0;
    while (scanner.hasNextLine()) {
      String nextLine = scanner.nextLine();
      if (nextLine.equals("")) {
        break;
      }
      String[] addressArr = nextLine.split("~");
      String ipAddress = addressArr[0];
      String maskAddress = addressArr[1];
      String[] ipSplit = ipAddress.split("\\.");

      if (Integer.parseInt(ipSplit[0]) >= 1 && Integer.parseInt(ipSplit[0]) <= 126) {
        if (checkIpRange(ipSplit[1]) && checkIpRange(ipSplit[2]) && checkIpRange(ipSplit[3])) {
          if (checkMask(maskAddress)) {
            addressA += 1;
            if (Integer.parseInt(ipSplit[0]) == 10) {
              privateAddressE += 1;
            }
          } else {
            errorAddress += 1;
          }
        } else {
          errorAddress += 1;
        }

      }
      if (Integer.parseInt(ipSplit[0]) >= 128 && Integer.parseInt(ipSplit[0]) <= 191) {
        if (checkIpRange(ipSplit[1]) && checkIpRange(ipSplit[2]) && checkIpRange(ipSplit[3])) {
          if (checkMask(maskAddress)) {
            addressB += 1;
            if (Integer.parseInt(ipSplit[0]) == 172 && Integer.parseInt(ipSplit[1]) >= 16
                && Integer.parseInt(ipSplit[1]) <= 31) {
              privateAddressE += 1;
            }
          } else {
            errorAddress += 1;
          }
        } else {
          errorAddress += 1;
        }

      }
      if (Integer.parseInt(ipSplit[0]) >= 192 && Integer.parseInt(ipSplit[0]) <= 223) {
        if (checkIpRange(ipSplit[1]) && checkIpRange(ipSplit[2]) && checkIpRange(ipSplit[3])) {
          if (checkMask(maskAddress)) {
            addressC += 1;
            if (Integer.parseInt(ipSplit[0]) == 192 && Integer.parseInt(ipSplit[1]) == 168) {
              privateAddressE += 1;
            }
          } else {
            errorAddress += 1;
          }
        } else {
          errorAddress += 1;
        }

      }
      if (Integer.parseInt(ipSplit[0]) >= 224 && Integer.parseInt(ipSplit[0]) <= 239) {
        if (checkIpRange(ipSplit[1]) && checkIpRange(ipSplit[2]) && checkIpRange(ipSplit[3])) {
          if (checkMask(maskAddress)) {
            addressD += 1;
          } else {
            errorAddress += 1;
          }
        } else {
          errorAddress += 1;
        }

      }
      if (Integer.parseInt(ipSplit[0]) >= 240 && Integer.parseInt(ipSplit[0]) <= 255) {
        if (checkIpRange(ipSplit[1]) && checkIpRange(ipSplit[2]) && checkIpRange(ipSplit[3])) {
          if (checkMask(maskAddress)) {
            addressE += 1;
          } else {
            errorAddress += 1;
          }
        } else {
          errorAddress += 1;
        }

      }
      if (Integer.parseInt(ipSplit[0]) == 127) {
        errorAddress += 1;
      }
    }

    System.out.println(
        "" + addressA + " " + addressB + " " + addressC + " " + addressD + " " + addressE + " "
            + errorAddress + " " + privateAddressE);
  }

  public static boolean checkIpRange(String ip) {

    if (ip != "" && (!ip.isEmpty())) {
      if (0 <= Integer.parseInt(ip) && Integer.parseInt(ip) <= 255) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }

  //校验掩码
  public static boolean checkMask(String maskAddress) {
    String[] maskSplot = maskAddress.split("\\.");
    if (maskSplot[0].equals("0") && maskSplot[1].equals("0") && maskSplot[2].equals("0")
        && maskSplot[3].equals("0")) {
      return false;
    }
    if (maskSplot[0].equals("255") && maskSplot[1].equals("255") && maskSplot[2].equals("255")
        && maskSplot[3].equals("255")) {
      return false;
    }
    if (!(checkIpRange(maskSplot[0]) && checkIpRange(maskSplot[1]) && checkIpRange(maskSplot[2])
        && checkIpRange(maskSplot[3]))) {
      return false;
    }

    //转成补0的str
    String newStr =  String.format("%08d",Integer.parseInt(Integer.toBinaryString(Integer.parseInt(maskSplot[0]))))
                  + String.format("%08d",Integer.parseInt(Integer.toBinaryString(Integer.parseInt(maskSplot[1]))))
                  + String.format("%08d",Integer.parseInt(Integer.toBinaryString(Integer.parseInt(maskSplot[2]))))
                  + String.format("%08d",Integer.parseInt(Integer.toBinaryString(Integer.parseInt(maskSplot[3]))));

    char[] chars = newStr.toCharArray();

    //判断是否遇到0
    boolean flag = false;
    //返回是否是正确的掩码的标识
    boolean returnFlag = true;
    for (int i = 0; i < chars.length; i++) {
      if (chars[0] == '0') {
        returnFlag = false;
      }
      if (chars[i] == '1') {
        if (flag == false) {
          continue;
        } else {
          returnFlag = false;
        }
      } else {
        flag = true;
      }
    }

    return returnFlag;
  }

}
