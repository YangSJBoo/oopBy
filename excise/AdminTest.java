package com.excise;

import java.util.Scanner;

public class AdminTest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("请输入用户名");
        String iUser=in.next();
        System.out.print("请输入密码");
        long iPassword=in.nextLong();//使用scanner接受用户输入的密码

        Admin admin=new Admin();
        if (iPassword ==admin.password) {//判断是否和默认的密码对不 然后进行判断
            admin.isTrue=false;//和默认密码相等 进来 然后把布尔类型改为false 以便判断
            System.out.print("请输入新密码");
            iPassword=in.nextLong();
            admin.password=iPassword;//将修改的密码将默认的密码覆盖然后调用更新方法
            admin.update();
        }else if(iPassword!=admin.password) {
            admin.isTrue=true;//密码错误布尔改为true 调用 更新方法
            admin.update();
        }

    }
}
