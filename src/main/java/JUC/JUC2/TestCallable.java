package JUC.JUC2;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/3/20 17:52
 * @description：
 * @modified By：
 * @version: 1.0
 */

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 一、创建执行线程的方式三：实现Callable接口。相较于实现Runnable接口的方式， 方法可以有返回值，并且可以抛出异常。
 *
 * 二、执行Callable方式，需要FutureTask实现类的支持，用于接收运算结果。FutureTask是Future接口的实现类
 */
public class TestCallable {

  public static void main(String[] args) {
    ThreadDemo td = new ThreadDemo();

    //执行Callable方式，需要FutureTask实现类的支持，用于接收运算结果。
    FutureTask<Integer> result = new FutureTask<>(td);

    new Thread(result).start();

//    System.out.println("--------------------");

    //2.接收线程运算后的结果
    try {
      Integer sum = result.get(); //FutureTask也可用于闭锁
      System.out.println(sum);
      System.out.println("--------------------");

    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }

  }

}

class ThreadDemo implements Callable<Integer> {

  @Override
  public Integer call() throws Exception {
    int sum = 0;
    for (int i = 0; i <= 10000; i++) {
//      System.out.println(i);
      sum += i;
    }

    return sum;
  }
}

/*class ThreadDemo implements Runnable{

  @Override
  public void run() {

  }
}*/
