package com.sunfj;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TestReentrantLock {
    public static void main(String[] args) throws InterruptedException {
        int count = 100;
        CountDownLatch countDownLatch = new CountDownLatch(count);
        for (int i = 0; i < count; i++) {
            new Thread(new SynThread(countDownLatch),"线程"+i).start();
        }
        countDownLatch.await();
        System.out.println(SynThread.arrayList.get(0));
    }



}
class SynThread implements Runnable{
    CountDownLatch countDownLatch;

    public SynThread(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    static final ArrayList<String> arrayList = new ArrayList<>();
    static {
        arrayList.add("0");
    }
    static final ReentrantLock reentrantLock = new ReentrantLock();
    @Override
    public void run() {
        try {
            reentrantLock.lock();
            String name = Thread.currentThread().getName();
            String s = arrayList.get(0);
            int i = Integer.parseInt(s)+1;
            arrayList.set(0, i + "");
            System.out.println(name+"赋值"+i);
        }finally {
            reentrantLock.unlock();
            countDownLatch.countDown();
        }
    }
}