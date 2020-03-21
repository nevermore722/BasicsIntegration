package JUC.JUC2;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/3/21 10:36
 * @description：
 * @modified By：
 * @version: 1.0
 */

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 生产者和消费者案例
 */
public class TestProductAndConsumerForLock {

  public static void main(String[] args) {
    Clerk clerk = new Clerk();

    Productor pro = new Productor(clerk);
    Consumer cus = new Consumer(clerk);

    new Thread(pro, "生产者A").start();
    new Thread(cus, "消费者B").start();

    new Thread(pro, "生产者C").start();
    new Thread(cus, "消费者D").start();
  }

}

//店员
class ClerkForLock {

  private int product = 0;

  private Lock lock = new ReentrantLock();

  private Condition condition = lock.newCondition();

  //进货
  public void get() {//循环次数2
    lock.lock();
    try {
      while (product >= 1) {//为了避免虚假唤醒问题，应该总是使用 在循环中
        System.out.println("产品已满！");
        try {
          condition.await();
        } catch (InterruptedException e) {

        }
      }
      System.out.println(Thread.currentThread().getName() + " : " + ++product);

      condition.signalAll();
    } finally {
      lock.unlock();
    }

  }

  //卖货
  public void sale() {//product=0;循环次数1
    lock.lock();
    try {
      while (product <= 0) {
        System.out.println("缺货！");
        try {
          condition.await();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      System.out.println(Thread.currentThread().getName() + " : " + --product);
      condition.signalAll();
    } finally {
      lock.unlock();
    }
  }
}

//生产者
class ProductorForLock implements Runnable {

  private Clerk clerk;

  public ProductorForLock(Clerk clerk) {
    this.clerk = clerk;
  }

  @Override
  public void run() {
    for (int i = 0; i < 20; i++) {

      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      clerk.get();
    }
  }
}

//消费者
class ConsumerForLock implements Runnable {

  private Clerk clerk;

  public ConsumerForLock(Clerk clerk) {
    this.clerk = clerk;
  }

  @Override
  public void run() {
    for (int i = 0; i < 20; i++) {
      clerk.sale();
    }
  }
}
