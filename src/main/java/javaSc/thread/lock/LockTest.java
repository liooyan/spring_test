package javaSc.thread.lock;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * {@link Lock}
 * {@link java.util.concurrent.locks.ReentrantLock}
 * <p>
 * 测试例子： 打印机
 * 公平锁与非公平锁
 *
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/3/9 5:13 下午
 */
public class LockTest {

    public static void main(String[] args) {
        LockRun lockRun = new LockRun(true);
        for (int i = 0; i < 100; i++) {
            final Thread thread = new Thread(() -> lockRun.print());
            thread.start();
        }


    }

    public static class LockRun {

        private Lock lock;

        public LockRun(boolean lockType) {
            lock = new ReentrantLock(lockType);
        }

        public void print() {
            lock.lock();
            long during = (long) (Math.random() * 1000);
            System.out.println(Thread.currentThread().getName() + "__" + during);
            lock.unlock();

            lock.lock();
            during = (long) (Math.random() * 1000);
            System.out.println(Thread.currentThread().getName() + "__" + during);
            lock.unlock();
        }
    }
}
