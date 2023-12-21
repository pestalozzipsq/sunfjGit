package com.sunfj;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author swaggyhang
 * @create 2023-07-01 10:49
 */
public class Test01 {
    public static void main(String[] args) {
        // 并发：多个线程操作同一个资源类，把资源类丢入线程中
        Ticket02 ticket = new Ticket02();

        // Runnable有@FunctionalInterface注解，是一个函数式接口，可以使用lambda表达式
        new Thread(() -> {
            // 循环60次去卖票，肯定能卖完50张票
            for (int i = 1; i <= 60; i++) {
                ticket.sale();
            }
        }, "A").start();

        new Thread(() -> {
            for (int i = 1; i <= 60; i++) {
                ticket.sale();
            }
        }, "B").start();

        new Thread(() -> {
            for (int i = 1; i <= 60; i++) {
                ticket.sale();
            }
        }, "C").start();
    }
}

// 资源类
class Ticket {
    // 50张票
    private int number = 50;

    // 卖票
    public synchronized void sale() {
            if (number > 0) {
            System.out.println(Thread.currentThread().getName() + "卖出了第" + (number--) + "票，还剩余" + number + "张票");
        }
    }
}


// 资源类
class Ticket02 {
    // 50张票
    private int number = 50;

    private Lock lock = new ReentrantLock();

    // 卖票
    public void sale() {
        // 加锁
        lock.lock();
        try {
            // 业务代码
            if (number > 0) {
                System.out.println(Thread.currentThread().getName() + "卖出了第" + (number--) + "票，还剩余" + number + "张票");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 解锁
            lock.unlock();
        }
    }
}