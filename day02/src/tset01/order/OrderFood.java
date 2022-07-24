package tset01.order;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
public class OrderFood {
    Scanner in=new Scanner(System.in);
    String[] names = new String[4]; // 保存订餐人名称
    String[] dishMegs = new String[4]; // 保存菜品名及份数
    int[] times = new int[4]; // 保存送餐时间
    String[] addresses = new String[4]; // 保存送餐地址
    int[] states = new int[4]; // 保存订单状态： 0：已预订 1：已完成
    double[] sumPrices = new double[4]; // 保存订单的总金额
    String str=" ";
    String []disMeg=new String[]{"辣子鸡丁","剁椒鱼头","锅包肉"};//菜单列表数组
    double[] moeny=new double[]{35,54,48};//菜品价格数组
    int []zan=new int[]{0,0,0};

    public void foodDing(){
        if (names[names.length-1]!=null) {//用names数组最后一个来判断 餐袋是否满
            // 满了调用查看餐袋的方法再用break跳出循环
            System.out.println("餐袋已满");
            foodLook();
            return;
        }
        double sumMoney;
       double sMoney;
        System.out.println("***我要订餐***");
        System.out.print("请输入订餐人姓名：");
        String iName=in.next();
        System.out.println("序号\t\t菜名\t\t单价(元)\t\t点赞数");
        for (int i = 0; i < disMeg.length; i++) {//展示菜单
            System.out.println((i+1)+"\t\t"+disMeg[i]+"\t\t"+moeny[i]+"\t\t"+zan[i]);
        }
        System.out.print("请输入您想要点的菜品编号:");
        int iHao= in.nextInt();
        if (iHao>3||iHao<1) {//判断输入的序号是否正确！
            System.out.println("没有您需要的菜品！请重新输入！");
            iHao= in.nextInt();
        }
        System.out.print("请输入您需要的份数：");
        int iFen=in.nextInt();
        System.out.print("请输入送餐时间（送餐时间10--20点间整点送餐）：");
        int iTime= in.nextInt();
        if (iTime<10||iTime>20){//判断输入的时间是都符合要求
            System.out.print("不好意思，这个点商家已休息！请重新输入！");
            iTime= in.nextInt();
        }
        if (moeny[iHao-1]*iFen>50) {//若是 总价格大于50 则需要一个5元的跑路费
            sMoney=5;
            sumMoney=moeny[iHao-1]*iFen+sMoney;
        }else {
            sMoney=0;
            sumMoney=moeny[iHao-1]*iFen+sMoney;
        }
        System.out.print("请输入送餐地址：");
        String iAdder=in.next();
        System.out.println("订餐成功！");
        System.out.println("您订的是:"+disMeg[iHao-1]);
        System.out.println("送餐时间是："+iTime);
        System.out.println("餐费是："+(moeny[iHao-1]*iFen)+"元,送餐费是"+sMoney+",总计是："+sumMoney);
        for (int i = 0; i < names.length; i++) {//利用循环将用户输入的信息 赋值给空的数组
            if (names[i] == null) {
                names[i]=iName;
                dishMegs[i]=disMeg[iHao-1]+iFen+"份";
                times[i]=iTime;
                addresses[i]=iAdder;
                sumPrices[i]=sumMoney;
                states[i]=0;
                break;
            }
        }


    }

    public void foodLook(){//查看餐袋
        System.out.println("***查看餐袋***");
        System.out.println("序号\t\t订单人\t\t餐品信息\t\t送餐日期\t\t送餐地址\t\t总金额\t\t订单状态");

        for (int i = 0; i <names.length; i++) {//利用循环将之前声明的数组遍历  前提是不为空
            if (states[i] == 1) {
               str="已完成";
            }else {
                str="已预定";
            }
            if (names[i] != null) {
                System.out.println((i+1)+"\t\t"+names[i]+"\t\t"+dishMegs[i]+"\t\t"+times[i]+"\t\t"+addresses[i]+"\t\t"+sumPrices[i]+"\t\t"+str);
            }
        }

    }

    public void foodArrive(){//签收
        System.out.println("****签收订单***");
        foodLook();
        System.out.print("请选择要签收的订单号：");
        int iArrive= in.nextInt();
            if (names[iArrive-1]!=null&&states[iArrive-1]==0){//将需要签收的订单状态改为已完成
                states[iArrive-1]=1;
                System.out.println("签收成功！");
            }else {
                System.out.println("未找到需要的订单（已完成或者没该订单！）");
            }


    }

    public  void foodDelete(){//删除订单
        System.out.println("***删除订单***");
        System.out.print("请输入您需要删除的订单:");
        int iDel=in.nextInt();
        if(states[iDel-1]==0){//已预定不可签收  0已预定
            System.out.println("您选择的订单未签收，不能删除！");
        }else  if(iDel>4||iDel<1){//如果输入的序号大于4或小于1 则需要重新输入
            System.out.println("不存在该订单，请重新输入！");
            iDel=in.nextInt();
        }
        for (int i = 0; i < names.length; i++) {//将输入序号后的值迁移一个位置 注意下标越界！
            if ((i+1==iDel)&&names[i]!=null&&states[i]==1) {//在循环里找到匹配条件的
                for (int j =iDel-1; j<names.length-1; j++) {//再利用循环前移
                    names[j]=names[j+1];
                   dishMegs[j]=dishMegs[j+1];
                    addresses[j]=addresses[j+1];
                    states[j]=states[j+1];
                    times[j]= times[j+1];
                    sumPrices[j]= sumPrices[j+1];
                }
                names[names.length-1]=null;//将最后一个赋值为null
                System.out.println("已删除！");
                break;
            }else if(names[i]!=null && states[i]==1 && iDel==i+1){//状态为已预定不可删除
                System.out.println("不好意思 该订单还没完成");
                break;
            }

        }


    }

    public  void foodDzan(){//点赞功能
        System.out.println("太好吃了！我要点赞！");
        System.out.println("序号\t\t菜名\t\t单价(元)\t\t点赞数");
        for (int i = 0; i < disMeg.length; i++) {//循环出菜单 以便点赞
            System.out.println((i+1)+"\t\t"+disMeg[i]+"\t\t"+moeny[i]+"\t\t"+zan[i]);
        }
        System.out.print("请选择您要点赞的菜品序号：");
        int iDhao= in.nextInt();
        for (int i = 0; i < 3; i++) {//循环可以点赞3次（3个菜）
            if (iDhao<4&&iDhao>0) {//输入的值不可大于3或小于1
                zan[iDhao-1]+=1;
                System.out.print("点赞成功！继续点赞嘛？(输入y继续输入其他不继续)");
                String Y=in.next();
                if (Y.equals("y")) {//不想点赞可以 输入其他
                    System.out.print("请选择您要点赞的菜品序号：");
                    iDhao= in.nextInt();
                }else {//输入其他再遍历一次 点赞后的菜单
                    System.out.println("感谢你的点赞！您给的赞是：");
                    System.out.println("序号\t\t菜名\t\t单价(元)\t\t点赞数");
                    for (int k = 0; k < disMeg.length; k++) {
                        System.out.println((k+1)+"\t\t"+disMeg[k]+"\t\t"+moeny[k]+"\t\t"+zan[k]);
                    }
                    break;
                }
            }else {
                System.out.println("没有你想要点赞的菜品");
                break;
            }

        }

    }
}
