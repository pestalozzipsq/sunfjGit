package com.sunfj;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

public class TestCountDownLatch {

    public static void main(String[] args) throws InterruptedException {
        int count  = 1000;
        int[] ints=new int[count];
        CountDownLatch countDownLatch = new CountDownLatch(count);
        for (int i = 0; i < count; i++) {
            new Thread(new TaskThread(countDownLatch,ints),"tt"+i).start();
        }
        countDownLatch.await();
        System.out.println("任务完成:"+ Arrays.toString(ints));
    }
}


class TaskThread implements Runnable{
    private final int[] ints;
    private static int intsCount  = 0;
    
    private static final Object lock = new Object();
    private final CountDownLatch countDownLatch;
    TaskThread(CountDownLatch countDownLatch ,int[] ints) {
        this.countDownLatch = countDownLatch;
        this.ints = ints;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        try {
            synchronized (lock){
                System.out.println("run执行："+name);
                ints[intsCount]=1;
                System.out.println("insCount="+intsCount);
                intsCount++;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("run执行完成"+name);
            countDownLatch.countDown();
        }
    }
}