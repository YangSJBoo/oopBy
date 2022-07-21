package com.excise;

import java.util.Scanner;

public class StudyPersonTest {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("请输入学员的姓名");
        String iName=in.next();
        System.out.print("请输入学员的年龄");
        int iAge= in.nextInt();
        System.out.print("请输入学员的班级");
        String iGrade=in.next();
        System.out.print("请输入学员的爱好");
        String iHobby=in.next();//使用scann接受以便下面赋值给学员类

        StudyPerson studyPerson=new StudyPerson();
        studyPerson.name=iName;
        studyPerson.age=iAge;
        studyPerson.grade=iGrade;
        studyPerson.hobby=iHobby;
        studyPerson.show();//将输入的值赋值给学员类的相应变量

        System.out.print("请输入技术顾问的姓名");
        String jName=in.next();
        System.out.print("请输入技术顾问的专业方向");
        String jMajor= in.next();
        System.out.print("请输入技术顾问的教授课程");
        String jClass=in.next();
        System.out.print("请输入技术顾问的教龄");
        int jAge=in.nextInt();//和上面学员类操作一样

        StudyPerson.StudyTeacher studyTeacher=new StudyPerson.StudyTeacher();
        studyTeacher.sName=jName;
        studyTeacher.major=jMajor;
        studyTeacher.tClass=jClass;
        studyTeacher.tAge=jAge;
        studyTeacher.show();

    }
}
