package com.excise;

import java.util.Scanner;

public class TravelTest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {//使用一个循环 可以循环10次不同顾客的门票价格
            System.out.print("请输入姓名：");
            String iName=in.next();//输入的姓名存在iName
            System.out.print("请输入年龄：");
            int iAge=in.nextInt();//和上面类似
            Travel travel=new Travel();
            travel.name=iName;//new一个对象
            travel.age=iAge;//将输入的年龄复制给类
            travel.ticket();//调用类里的方法
            System.out.print("输出n退出程序输出其他继续操作");//是否退出 退出就退出程序 不在循环
            String exit=in.next();
            if (exit.equals("n")) {//判断是否退出
                System.out.println("已退出");
                break;//退出break
            }else {
                System.out.println("请继续");
                continue;//继续continue
            }
        }


    }
}
