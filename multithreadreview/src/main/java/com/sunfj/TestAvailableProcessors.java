package com.sunfj;

public class TestAvailableProcessors {
    public static void main(String[] args) {
        int i = Runtime.getRuntime().availableProcessors();
        System.out.println(i);
    }
}
