package com.excise;
public class WifeTest {
    public static void main(String[] args) {
        Wife wife=new Wife();
        wife.age=20;
        wife.name="1妻子";
        Husband husband=new Husband();
        husband.age=21;
        husband.name="1丈夫";
        System.out.println("调用妻子信息");
        wife.getInfo();
        husband.getInfo();
        System.out.println("调用丈夫信息");
        husband.getInfo();
        wife.getInfo();
    }
}
