package com.excise;

public class Admin {
    String user="admin";//声明管理员的用户名
    long password=111111;//声明管理员的密码
    boolean isTrue=false;//用来判断修改密码成不成功
    public void update(){//更新新密码的方法
       if (!isTrue){//因为结果是两个 修改成功或者不成功 所以我使用if选择
           System.out.println("修改密码成功！您的新密码是："+password);
       }else {
           System.out.println("您的用户名和密码不匹配！ 你没有权限修改信息");
       }
    }

}
