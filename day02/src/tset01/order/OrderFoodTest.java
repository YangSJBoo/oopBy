package tset01.order;

import tset01.order.OrderFood;

import java.util.Scanner;

public class OrderFoodTest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        OrderFood orderFood=new OrderFood();

        orderFood.names[0]="杨大";//给数组默认的值
        orderFood.dishMegs[0]="剁椒鱼头一份";
        orderFood.times[0]=12;
        orderFood.addresses[0]="小区门口";
        orderFood.states[0]=1;
        orderFood. sumPrices[0]=54;

        orderFood.names[1]="杨二";//给数组默认的值
        orderFood.dishMegs[1]="辣子鸡丁一份";
        orderFood.times[1]=11;
        orderFood.addresses[1]="小区南门";
        orderFood.states[1]=0;
        orderFood. sumPrices[1]=35;


        int zero=0;
        do {
            System.out.println("欢迎使用“吃货联盟订餐系统”");
            System.out.println("**********************************");
            System.out.println("1,我要订餐");
            System.out.println("2,查看餐袋");
            System.out.println("3,签收订单");
            System.out.println("4,删除订单");
            System.out.println("5,我要点赞");
            System.out.println("6,退出系统");
            System.out.println("************************");
            System.out.print("请选择:");
            int choice=in.nextInt();
            boolean isExit=false;//判断是否返回主菜单
            switch (choice){
               case 1:
                   orderFood.foodDing();
                    break;
               case 2:
                   orderFood.foodLook();
                    break;
               case 3:
                   orderFood.foodArrive();
                    break;
               case 4:
                   orderFood.foodDelete();
                    break;
               case 5:
                   orderFood.foodDzan();
                    break;
               case 6:
                   isExit=true;//不执行 返回的提示！
                   zero=1;//给zero赋值 跳出循环
                   System.out.println("已退出！欢迎下次光临！");
                    break;
            }
            if(!isExit){
                System.out.print("输入0返回");
                zero=in.nextInt();
            }
        }while (zero==0);

    }
}
