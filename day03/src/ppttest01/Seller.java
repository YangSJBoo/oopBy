package ppttest01;

import java.util.Scanner;

public class Seller {
    private  String name="ysj";
    public String getName() {
        System.out.println("本销售员姓名是"+name);
        return name;
    }
    public void sell(Excelle car){//第一种销售方式只卖一辆 且是凯旋的方法
        System.out.println("销售了一辆凯旋");
        System.out.println("型号是："+car.getType()+",id是："+car.getId());
    }

    public void sell(Regal car){//第一种销售方式只卖一辆 且是君威的方法  方法重载
        System.out.println("销售了一辆君威");
        System.out.println("型号是："+car.getType()+",id是："+car.getId());
    }
    public void sell(Excelle[] car,int num){
        //可以买用户输入的量数num
        // 使用数组 形参为凯旋的对象的数组集合
        System.out.println("销售了"+num+"辆凯旋");
        for (int i = 0; i < car.length; i++) {
            System.out.println("型号是："+car[i].getType()+",id是："+car[i].getId());
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Seller seller=new Seller();
        seller.getName();//销售员的姓名
        seller.sell(new Excelle("123","A6"));//第一种销售方式 卖凯旋
        seller.sell(new Regal("123","A5"));//第一种销售方式 卖君威
        System.out.print("请输入你想要买凯旋的辆数");//第二种销售方式 卖凯旋
        int num=in.nextInt();//使用num获得用户需要的辆数
        Excelle excelle=new Excelle("123","a9");//初始化凯旋的id和型号
        Excelle []excelles=new Excelle[num];//声明一个凯旋对象的数组 且长度为用户输入辆数
        for (int i = 0; i < excelles.length; i++) {//使用for循环将初始化的凯旋对象赋值给数字
            excelles[i]=excelle;
        }
        seller.sell(excelles,num);//将实参写入方法

    }
}
