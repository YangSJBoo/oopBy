package tset01;
import java.util.Scanner;

public class StudentBiz {
    String studentArr[];
    public String[] addName(String name){//增加学生的姓名 返回的String的数组
        System.out.println("增加学生的姓名是："+name);
        String studentArr1[]=new String[studentArr.length+1];//给原来的学生数组增加一个位置（声明一个比它大一个数组）
        for (int i = 0; i < studentArr1.length; i++) {
            if (i<studentArr1.length-1) {//将原来的值赋值给新的数组
                studentArr1[i] = studentArr[i];
            }
        }
        studentArr1[studentArr1.length-1]=name;//新数组的最后一个赋值为需要增加的学生姓名
        studentArr=studentArr1;//因为上面没有确定数组的长度 所以这边可以做一个一直赋值新的数组操作
        for (int i = 0; i < studentArr1.length; i++) {
            studentArr[i]=studentArr1[i];
        }
        return studentArr;
    }
    public  String[] showName(String a[]){//展示数组 就是循环形参a的值
        for (int i = 0; i < a.length; i++) {
            System.out.println("第"+(i+1)+"个学生姓名是"+a[i]);
        }
        return a;
    }

   public  boolean searchName(int start,int end,String name1){//使用布尔类型判断是否查找成功
        boolean isTure=false;
       for (int i = start-1; i < end-1; i++) {
           if (studentArr[i].equals(name1)) {
               isTure=true;
               break;
           }
           else{
               isTure=false;
           }
       }
        return isTure;
   }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        StudentBiz studentBiz=new StudentBiz();
        String names[]={"ysj1","ysj2","ysj2"};//原有的数组
        studentBiz.studentArr=names;//将原有的数组 赋值给 new出来对象的属性
        boolean isN=false;
        do {//使用dowhile循环确定是否增加学生
            System.out.print("请输入你想增加的学生姓名：");
            String str= in.next();
            studentBiz.studentArr=studentBiz.addName(str);//因为addName返回值是数组 所以使用studentArr接受
            studentBiz.showName(studentBiz.studentArr);//使用showName方法遍历
            System.out.print("是否继续增加学生？   输出y继续输入其他退出");
            String Y= in.next();
            if (Y.equals("y")) {
                isN=false;
            }else {
                isN=true;
            }
        }while (!isN);

        System.out.println("请输入你需要查找的姓名");
        String str1=in.next();
        boolean s=studentBiz.searchName(1,studentBiz.studentArr.length+1,str1);
        //因为数组长度不固定 所以这边结束的是需要是数组的长度
        if (s) {
            System.out.println("查找成功！");
        }else {
            System.out.println("查无此人");
        }
    }

}
