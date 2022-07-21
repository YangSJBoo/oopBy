package com.excise;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("您的姓名");
        String nameIn=in.next();
        System.out.print("请输入您的身份证号");
        long nameHIn=in.nextLong();
        System.out.print("请输入您的家庭电话");
        long numberIn=in.nextLong();
        System.out.print("请输入您的家庭住址");
        String addrIn=in.next();//输入相应信息


        Account account=new Account();//new一个类的对象

        account.customer.nameH=nameHIn;//将输入的值赋值给 用户类里的值
        account.customer.name=nameIn;
        account.customer.number=numberIn;
        account.customer.addr=addrIn;
        account.customer.say();//调用say方法 然后输出个人信息
        account.getInfo();//调用卡号余额
        account.withdraw();//取钱方法
        account.save();//存钱方法
    }
}
