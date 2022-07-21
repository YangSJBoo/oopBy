package com.excise;

public class Account {
    long id=2222;//声明卡号  赋值
    double balance=899.5;//声明余额    赋值
    boolean  qSucced=false;//判断是否能取钱
    boolean  cSucced=false;//判断是否能存钱
    Customer customer=new Customer();
    String CustomerN=customer.name;//将用户的姓名和卡的个人信息一致
    public void getInfo(){//输出用户姓名和卡号余额
        System.out.println("所属用户是："+CustomerN);
        System.out.println("卡号是；"+id+"余额是："+balance);
    }

    public static class Customer{//用户类
        String name="ysj";//有默认的值 用来和输入的值相比 判断是否能取存钱
        long nameH=123456;
        long number=654321;
        String addr="南京";
    public void say(){//say方法用来在控制台 展出个人信息
        System.out.println("个人信息");
        System.out.println("姓名："+name);
        System.out.println("身份证号是："+nameH);
        System.out.println("联系电话是："+number);
        System.out.println("家庭住址是："+addr);

    }

}
    public void save(){//存钱验证 卡号和身份证号
        if (customer.nameH==123456&&id==2222){
            cSucced=true;
            System.out.println("存钱成功");
        }else{
            cSucced=false;
            System.out.println("存钱失败");
        }
    }

    public void withdraw(){//取钱验证 卡号和身份证号
        if (customer.nameH==123456&&id==2222){
            qSucced=true;
            System.out.println("取钱成功");
        }else{
            qSucced=false;
            System.out.println("取钱失败");
        }
    }

}
