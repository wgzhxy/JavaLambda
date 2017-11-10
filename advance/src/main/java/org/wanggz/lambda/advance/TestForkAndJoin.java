package org.wanggz.lambda.advance;

import org.junit.Test;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;


/**
 * 双端队列， 实现并行处理，采用工作窃取算法
 */
public class TestForkAndJoin {

    @Test
    public void testMain() {

        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask<Integer> submit = pool.submit(new ForkAndJoin(1, 3));

        try {
            System.out.println("Final result:" + submit.get());
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

class ForkAndJoin extends RecursiveTask<Integer> {

    //阈值
    private static final int THRESHOLD = 2;
    //起始值
    private int start;
    //结束值
    private int end;

    public ForkAndJoin(int start, int end) {
        this.start = start;
        this.end = end;
    }


    @Override
    protected Integer compute() {
        boolean compute = (end - start) <= THRESHOLD;
        int res = 0;
        if (compute) {
            for (int i = start; i <= end; i++) {
                res += i;
            }
        } else {

            //如果长度大于阈值，则分割为小任务
            int mid = (start + end) / 2;
            ForkAndJoin task1 = new ForkAndJoin(start, mid);
            ForkAndJoin task2 = new ForkAndJoin(mid + 1, end);

            //计算小任务的值
            task1.fork();
            task2.fork();

            //得到两个小任务的值
            int task1Res = task1.join();
            int task2Res = task2.join();

            res = task1Res + task2Res;
        }
        return res;
    }
}


