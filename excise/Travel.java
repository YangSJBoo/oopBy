package com.excise;

public class Travel {
    String name;//声明游客的姓名和年龄 以便对象赋值
    int age;
    public void ticket(){//门票价格方法
        if (age>=20) {//使用if判断年龄大小来收费
            System.out.println(name+"的年龄是："+age+"所以门票的价格是：20");
        }else {
            System.out.println(name+"的年龄是："+age+"所以 门票的价格是：0");
        }
    }
}
