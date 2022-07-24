package tset01.menu;

import tset01.menu.Menu;

import java.util.Scanner;

public class MyShopping {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Menu menu = new Menu();//实例一个对象
        boolean isTrue=false;//用来跳出循环
        int num=0;//登录界面数字
        int choice=0;//switch选择条件
        int a=0;//真情回馈的实参

    do {
        menu.showLoginMenu();//显示登陆菜单
        System.out.print("登录界面请输入，选择数字1登录：");
        num=in.nextInt();
        if (num==1) {//是否登录
            menu.showMainMenu();
            System.out.print("请选择，输入数字或者0返回上一级菜单");
             choice= in.nextInt();//输入switch选择条件
        }else {//输入2或者其他则退出系统 跳出循环
            isTrue=true;
            System.out.println("已退出，欢迎下次光临！");
        }
        switch (choice){
            case 0://等于0则返回上一级重新登录
                break;
            case 1:
                menu.showCustMenu("ysj",21);//客户信息管理方法调用
                System.out.print("请选择0返回上一级菜单");
                choice= in.nextInt();
                break;
            case 2:
                menu.showSendGMenu(4);//展示真情流露界面
                System.out.print("请选择，输入数字或者0返回登录菜单");
                a= in.nextInt();//选择真情流露中数字
                if (a == 0) {
                    choice=0;
                }else {
                    menu.showSendGMenu(a);
                    isTrue=true;
                }
                break;
            default:
        }
     }while (!isTrue);





    }
}
