package tset01;

public class ZhaZhi {
    public static void main(String[] args) {
        ZhaZhi zhaZhi=new ZhaZhi();
        System.out.println(zhaZhi.zha("葡萄",4));//将形参传值成实参 并输出
    }

    public String zha(String f,int num){//声明形参
        String f1=f+"汁"+num+"杯";
        return f1;
    }
}
