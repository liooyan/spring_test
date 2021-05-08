package javaSc.thread.lock;

import java.util.function.Supplier;

/**
 * 线程变量，
 * {@linkplain ThreadLocal#withInitial(Supplier)}
 * 可以声明线程变量。
 *
 * Thread  线程
 * Local 本地
 * with 和
 * Initial 最初的
 * Supplier 提供者
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/3/4 3:14 下午
 */
public class TestThreadLocal {
    private static ThreadLocal<String> local = ThreadLocal.withInitial(() -> "init");

    public static void main(String[] args) throws InterruptedException {
        Runnable r = new TT();
        new Thread(r, "thread1").start();
        new Thread(r, "thread2").start();
    }

    private static class TT implements Runnable {
        @Override
        public void run() {
            System.out.println(local.get());
            local.set(Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("set local name and get: "+ local.get());
        }
    }
}