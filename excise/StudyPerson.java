package com.excise;

public class StudyPerson {
    String name;//根据要求 使用不同的数据类型 声明变量
    int age;
    String grade;
    String hobby;
    public void show(){//show方法 展示控制台
        System.out.println("学员姓名是："+name);
        System.out.println("学员年龄是："+age);
        System.out.println("学员班级是："+grade);
        System.out.println("学员爱好是："+hobby);
    }

    static class StudyTeacher{//技术顾问的类
     String sName;//根据要求 使用不同的数据类型 声明变量
     String major;
     String tClass;
     int tAge;
        public void show(){//show方法 展示控制台
            System.out.println("技术顾问姓名是："+sName);
            System.out.println("技术顾问专业方向是："+major);
            System.out.println("技术顾问教授课程是："+tClass);
            System.out.println("技术顾问教龄是："+tAge);
        }
    }
}
