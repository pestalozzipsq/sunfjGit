package com.sunfj.algorithm;

//70. 爬楼梯
//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
//
//每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
//斐波那契数列
public class test1 {
    public static int n=3;
    public static void main(String[] args) {
        int[] result = new int[3];
        result[0]=1;
        result[1]=1;
        for(int i=0;i<n-1;i++){
            result[2]=result[0]+result[1];
            result[0]=result[1];
            result[1]=result[2];
        }
        System.out.printf(String.valueOf(result[2]));
    }

}
