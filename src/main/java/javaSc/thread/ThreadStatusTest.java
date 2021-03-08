package javaSc.thread;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 线程状态说明 6种状态
 *
 *
 * NEW：线程已经创建完毕但未开始执行。
 * RUNNABLE：线程正在JVM中执行。
 * BLOCKED：线程处于阻塞状态，并且等待获取监视器。
 * WAITING：线程在等待另一个线程。
 * TIMED_WAITING：线程等待另一个线程一定的时间。
 * TERMINATED：线程执行完毕。
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/3/8 10:53 上午
 */
public class ThreadStatusTest {

    public static void main(String[] args) throws IOException {
        System.out.printf("MinimumPriority:%s\n", Thread.MIN_PRIORITY);
        System.out.printf("NormalPriority:%s\n", Thread.NORM_PRIORITY);
        System.out.printf("MaximunPriority:%s\n", Thread.MAX_PRIORITY);
        Thread threads[];

        Thread.State status[];
        threads = new Thread[10];
        status = new Thread.State[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(new Calculator());
            if ((i % 2) == 0) {
                threads[i].setPriority(Thread.MAX_PRIORITY);
            } else {
                threads[i].setPriority(Thread.MIN_PRIORITY);
            }
            threads[i].setName("MyThread" + i);
        }
        try (FileWriter file = new FileWriter("/Users/liyan/Downloads/spring_test/log.txt");
             PrintWriter pw = new PrintWriter(file);) {
            for (int i = 0; i < 10; i++) {
                pw.println("Main:StatusofThread" + i + ":" + threads[i].getState());
                status[i] = threads[i].getState();
            }
            for (int i = 0; i < 10; i++) {
                threads[i].start();

            }
            boolean finish = false;
            while (!finish) {
                for (int i = 0; i < 10; i++) {
                    if (threads[i].getState() != status[i]) {
                        writeThreadInfo(pw, threads[i], status[i]);
                        status[i] = threads[i].getState();
                    }
                }
                finish = true;
                for (int i = 0; i < 10; i++) {
                    finish = finish && (threads[i].getState() == Thread.State.TERMINATED);
                }
            }

        }

    }
    private static void writeThreadInfo (PrintWriter pw, Thread thread, Thread.State state){
        pw.printf("Main:Id%d%s\n", thread.getId(), thread.getName());
        pw.printf("Main:Priority:%d\n", thread.getPriority());
        pw.printf("Main:OldState:%s\n", state);
        pw.printf("Main:NewState:%s\n", thread.getState());
        pw.printf("Main:************************************\n");
    }

    public static class Calculator implements Runnable {

        @Override
        public void run() {
            long current = 1L;

            long max = 20000L;
            long numPrimes = 0L;
            System.out.printf("Thread'%s':START\n", Thread.currentThread().getName());
            while (current <= max) {
                if (isPrime(current)) {
                    numPrimes++;
                }
                current++;
            }
            System.out.printf("Thread'%s':END.NumberofPrimes:%d\n", Thread.currentThread().getName(), numPrimes);
        }

        private boolean isPrime(long number) {
            if (number <= 2) {
                return true;
            }
            for (long i = 2; i < number; i++) {
                if ((number % i) == 0) {
                    return false;


                }
            }
            return true;
        }
    }
}




