package JUC.JUC2;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/3/21 10:36
 * @description：
 * @modified By：
 * @version: 1.0
 */

/**
 * 生产者和消费者案例
 */
public class TestProductAndConsumer {

  public static void main(String[] args) {
    Clerk clerk = new Clerk();

    Productor pro = new Productor(clerk);
    Consumer cus = new Consumer(clerk);

    new Thread(pro, "生产者A").start();
    new Thread(pro, "生产者B").start();

    new Thread(cus, "消费者C").start();
    new Thread(cus, "消费者D").start();
  }

}

//店员
class Clerk {

  private int product = 0;

  //进货
  public synchronized void get() {
    //使用while判断当前product数量，防止虚假唤醒
    while (product >= 3) {
      System.out.println("产品已满！");
      try {
        this.wait();
      } catch (InterruptedException e) {

      }
    }
    System.out.println(Thread.currentThread().getName() + " : " + ++product);

    this.notifyAll();

  }

  //卖货
  public synchronized void sale() {//product=0;循环次数1
    while (product <= 0) {
      System.out.println("缺货！");
      try {
        this.wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println(Thread.currentThread().getName() + " : " + --product);
    this.notifyAll();
  }
}

//生产者
class Productor implements Runnable {

  private Clerk clerk;

  public Productor(Clerk clerk) {
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
class Consumer implements Runnable {

  private Clerk clerk;

  public Consumer(Clerk clerk) {
    this.clerk = clerk;
  }

  @Override
  public void run() {
    for (int i = 0; i < 20; i++) {
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      clerk.sale();
    }
  }
}
