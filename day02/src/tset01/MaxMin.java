package tset01;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        MaxMin maxMin=new MaxMin();
        double []list={1,2,1,7,45,5};
        System.out.println("最大值是："+maxMin.max(list));
        System.out.println("最小值是："+maxMin.min(list));
        System.out.println("平均值是："+maxMin.aveger(list));
        System.out.print("排序后是：");
        maxMin.arr(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+" ");
        }

    }
    Scanner in=new Scanner(System.in);
    public double max(double a[]){//冒泡排序后返回最后一个值为最大值
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a.length-i-1; j++) {
                if (a[j]>a[j+1]){
                    double t;
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        return a[a.length-1];
    }
    public double min(double a[]){//冒泡排序后返回第一个值为最大值
       max(a);
        return a[0];
    }

    public void arr(double a[]){//冒泡排序后的数组 无返回值
        max(a);
    }
    public double aveger(double a[]){//平均值
        double sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        return (sum/a.length);
    }


}
