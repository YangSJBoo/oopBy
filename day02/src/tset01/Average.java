package tset01;

import java.util.Scanner;

public class Average {
//    int jScore,cScore,dbScore;
public static void main(String[] args) {
    Average average1=new Average();
    Scanner in=new Scanner(System.in);
    System.out.print("请输入Java的成绩：");//接受三个成绩
    int sJava=in.nextInt();
    System.out.print("请输入c#的成绩：");
    int sC=in.nextInt();
    System.out.print("请输入DB的成绩：");
    int sDb=in.nextInt();
    average1.sum(sJava,sC,sDb);//使用总成绩方法和平均成绩方法
    average1.average(sJava,sC,sDb);
//    int jScore1=average.javaScore(80);
//    int cScore1=average.cScore(95);
//    int dbScore1=average.dbScore(65);
//    System.out.println("总成绩是："+(jScore1+dbScore1+cScore1));
//    System.out.println("平均成绩是："+((double)(jScore1+dbScore1+cScore1)/3));
}
//    public int javaScore(int jScore){
//        System.out.println("请输入Java成绩: "+jScore);
//        return jScore;
//    }
//    public int cScore(int cScore){
//        System.out.println("请输入C#成绩: "+cScore);
//        return cScore;
//    }
//    public int dbScore(int dbScore){
//        System.out.println("请输入db成绩: "+dbScore);
//        return dbScore;
//    }
    public int sum(int java,int c,int db){//直接声明一个总成绩的方法 将主函数里输入的三个成绩作为返回值
        System.out.println("总成绩是："+(java+c+db));
        return (java+c+db);
    }
    public double average(int java, int c, int db){//直接声明一个平均成绩的方法 将主函数里输入的三个成绩的double作为返回值
        System.out.println("平均成绩是："+((double)(java+c+db)/3));
    return ((double)(java+c+db)/3);
    }

}
