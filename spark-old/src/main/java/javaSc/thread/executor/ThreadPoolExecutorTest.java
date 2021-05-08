package javaSc.thread.executor;

import java.util.Collection;
import java.util.concurrent.*;

import static java.lang.Integer.toBinaryString;


/**
 * {@linkplain ThreadPoolExecutor} 源码解析
 * {@linkplain Executor}
 * {@linkplain ExecutorService}
 * {@linkplain AbstractExecutorService}
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/3/14 11:44 上午
 */
public class ThreadPoolExecutorTest {
    /**
     * 只定义了{@linkplain Executor#execute(Runnable)}
     * execute 执行
     * 用于提交任务
     */
    public static class ExecutorStu {

    }

    /**
     * {@linkplain ExecutorService}
     * 一方面添加调用的状态控制，另一方面添加对Callable 任务的提交
     * <p>
     * 添加一下接口：
     * {@linkplain ExecutorService#shutdown()} 在已经提交的任务完成后关闭
     * {@linkplain ExecutorService#shutdownNow()}  立即关闭，并返回正在等待的任务
     * {@linkplain ExecutorService#isShutdown()} 判断执行器的状态是否在关闭状态
     * {@linkplain ExecutorService#isTerminated()} 判断执行器的状态是否在终止状态
     * {@linkplain ExecutorService#awaitTermination(long, TimeUnit)}   阻塞当前线程 x 时间
     * {@linkplain ExecutorService#submit(Runnable)}  提交 Runnable任务
     * {@linkplain ExecutorService#submit(Callable)}  提交 Callable任务
     * {@linkplain ExecutorService#submit(Runnable, Object)} 提交 Runnable任务 并返回Future
     * {@linkplain ExecutorService#invokeAll(Collection)} 提交 多个 Callable任务并 并返回所有结果
     * {@linkplain ExecutorService#invokeAny(Collection)}  提交 多个 Callable任务并 并返回其中一个结果
     */
    public static class ExecutorServiceStu {

    }

    /**
     * {@linkplain AbstractExecutorService}
     * 1、对于 submit相关方法，最终通过{@linkplain FutureTask} 对统一到了execute 方法上
     * 2、invokeAll 方法，首先提交任务，并记录结果，如果是阻塞，则调用所有Future 的get方法。如果不是，则累计调用get方法，并记录时间。
     * 3、invokeAny 有点复杂，之后看//TODO
     */
    public static class AbstractExecutorServiceStu {

    }

    /**
     * {@linkplain ThreadPoolExecutor}
     * 主要实现  execute 方法
     * 其中有一下几个比较重要的变量
     * int corePoolSize,
     * int maximumPoolSize,
     * long keepAliveTime,
     * TimeUnit unit,
     * BlockingQueue<Runnable> workQueue,
     * ThreadFactory threadFactory,
     * RejectedExecutionHandler handler
     * <p>
     * <p>
     * <p>
     * {@linkplain ThreadPoolExecutor#execute(Runnable)}
     * 1、如果 当前任务中线程小于 corePoolSize 则以 corePoolSize 判断 直接执行任务。
     * 2、否则加入到队列中。
     * 3、如果添加失败，则以 maximumPoolSize 判断执行任务。
     * 4、其他情况报 RejectedExecutionHandler
     * <p>
     * <p>
     * {@linkplain ThreadPoolExecutor#addWorker(Runnable, boolean)}
     * 1、首先是一个 for (;;) 。主要是为了判断 是否超过了最大size，超过返回false，否则继续执行任务，
     *    其中使用CAS 自旋
     * 2、将其封装在{@linkplain ThreadPoolExecutor.Worker}
     * 3、之后是在{@linkplain ThreadPoolExecutor#runWorker(ThreadPoolExecutor.Worker)}
     *      有beforeExecute 和 afterExecute 方法
     *    当一个方法执行完成后，通过{@linkplain ThreadPoolExecutor#getTask()} 获取新的方法来执行。
     *    getTask就是从队列中获取线程执行。
     * 4、当所有执行玩后 {@linkplain ThreadPoolExecutor#processWorkerExit(ThreadPoolExecutor.Worker, boolean)} 释放资源
     *
     */
    public static class ThreadPoolExecutorClass {

        public static void main(String[] args) {
            //用来计数的最大位数
            int COUNT_BITS = Integer.SIZE - 3;

            int RUNNING = -1 << COUNT_BITS;
            int SHUTDOWN = 0 << COUNT_BITS;
             int STOP = 1 << COUNT_BITS;
            int TIDYING = 2 << COUNT_BITS;
            int TERMINATED = 3 << COUNT_BITS;

            System.out.println("RUNNING   :"+toBinaryString(RUNNING));
            System.out.println("SHUTDOWN  :"+toBinaryString(SHUTDOWN));
            System.out.println("STOP      :"+toBinaryString(STOP));
            System.out.println("TIDYING   :"+toBinaryString(TIDYING));
            System.out.println("TERMINATED:"+toBinaryString(TERMINATED));
        }

    }

}
