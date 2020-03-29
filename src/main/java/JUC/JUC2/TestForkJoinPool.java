package JUC.JUC2;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.stream.LongStream;
import org.junit.jupiter.api.Test;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/3/29 22:25
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class TestForkJoinPool {

  public static void main(String[] args) {
    Instant start = Instant.now();

    ForkJoinPool pool = new ForkJoinPool();

    ForkJoinTask<Long> task = new ForkJoinSumCalculate(0L, 100000000L);

    long sum = pool.invoke(task);
    System.out.println(sum);

    Instant end = Instant.now();

    System.out.println("耗费时间为：" + Duration.between(start, end).toMillis());

  }

  @Test
  public void test1() {
    Instant start = Instant.now();

    long sum = 0L;

    for (long i = 0L; i <= 100000000L; i++) {
      sum += i;
    }

    System.out.println(sum);

    Instant end = Instant.now();

    System.out.println("耗费时间为：" + Duration.between(start, end).toMillis());

  }

  //java8新特性
  @Test
  public void test2() {
    Instant start = Instant.now();

    Long sum = LongStream.rangeClosed(0L, 100000000L)
        .parallel()
        .reduce(0L, Long::sum);

    Instant end = Instant.now();

    System.out.println("耗费时间为：" + Duration.between(start, end).toMillis());

  }

}

class ForkJoinSumCalculate extends RecursiveTask<Long> {

  private static final long serialVersionUID = -7905165671471197543L;

  private long start;
  private long end;

  //临界值
  private static final long THURSHOLD = 10000L;

  public ForkJoinSumCalculate(long start, long end) {
    this.start = start;
    this.end = end;
  }

  @Override
  protected Long compute() {
    long length = end - start;

    if (length <= THURSHOLD) {
      long sum = 0L;

      for (long i = start; i <= end; i++) {
        sum += i;
      }
      return sum;
    } else {
      long middle = (start + end) / 2;
      ForkJoinSumCalculate left = new ForkJoinSumCalculate(start, middle);
      //进行拆分，同时压入线程队列
      left.fork();

      ForkJoinSumCalculate right = new ForkJoinSumCalculate(middle + 1, end);
      //进行拆分，同时压入线程队列
      right.fork();

      return left.join() + right.join();
    }
  }
}