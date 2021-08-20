package javaSc.thread.executor;

import java.util.Date;
import java.util.concurrent.*;

/**
 *
 * {@linkplain Executor}
 * Executor 执行器
 *
 * {@linkplain java.util.concurrent.ThreadPoolExecutor}
 * Thread 线程
 * Pool 水池
 * Executor
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/3/13 10:37 下午
 */
public class newExecutorTest {
    public static void main(String[] args) {
        final ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        executorService.setRejectedExecutionHandler(new RejectedTaskController());
        for(int i = 0; i < 20; i ++){
            executorService.execute(new Task("Task"+i));
        }
        executorService.shutdown();
        executorService.execute(new Task("Task end"));
    }

    /**
     * 任务类
     */
    private static class Task implements Runnable{
        private final Date intiDate;
        private final String name;

        public Task(String name) {
            this.name = name;
            this.intiDate = new Date();
        }

        @Override
        public void run() {
            System.out.printf("%s: Task %s Created on: %s\n",
                    Thread.currentThread().getName(),
                    name,
                    intiDate);
            System.out.printf("%s: Task  Started on: %s\n",
                    Thread.currentThread().getName(),
                    name
                    );

            try {
                Long duration = (long)(Math.random()*10);
                System.out.printf("%s: Task %s Doing atask during %d seconds \n",
                        Thread.currentThread().getName(),
                        name,
                        duration);
                TimeUnit.SECONDS.sleep(duration);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.printf("%s: Task  Finished on: %s\n",
                    Thread.currentThread().getName(),
                    name
            );
        }
    }

    public static class RejectedTaskController implements RejectedExecutionHandler{


        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            System.out.printf("RejectedTaskController: the task %s has been rejected\n",r.toString());
            System.out.printf("RejectedTaskController:%s \n",executor.toString());
        }
    }

}
