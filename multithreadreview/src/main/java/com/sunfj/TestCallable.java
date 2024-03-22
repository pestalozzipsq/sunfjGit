package com.sunfj;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        for (int i = 1; i <= 10; i++) {
            // FutureTask是Runnable接口的一个实现类
            // FutureTask构造器接收Callable参数
            FutureTask<String> futureTask = new FutureTask<>(new MyThread3());
            new Thread(futureTask, String.valueOf(i)).start();
            // futureTask.get()方法可能会产生阻塞，一般是放在程序最后
            // 或者使用异步通信来处理！
            System.out.println(futureTask.get());
        }
    }
}
class MyThread3 implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "call():" + Thread.currentThread().getName();
    }
}