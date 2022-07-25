package demo01;

import java.util.Scanner;
public class Dog {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Dog dog=new Dog();
        System.out.println("欢迎您来到宠物店！");
        System.out.print("请输入你要领养的宠物名字：");
        dog.name= in.next();
        System.out.print("请选择要领养的宠物类型，（1，狗狗 2，猫咪）");
        int choice= in.nextInt();
        int iChoice;
        switch (choice){
            case 1:
                System.out.print("请选择狗狗的品种（1，二哈 2，拉布拉多）");
               iChoice=in.nextInt();
                if (iChoice == 1) {
                    dog.sexy="二哈";
                    dog.show();
                }else if (iChoice == 2) {
                    dog.sexy="拉布拉多";
                    dog.show();
                }
                break;
            case 2:
                System.out.print("请选择猫咪的品种（1，橘猫 2，狸花猫）");
                iChoice=in.nextInt();
                if (iChoice == 1) {
                    dog.sexy="橘猫";
                    dog.show();
                }else if (iChoice == 2) {
                    dog.sexy="狸花猫";
                    dog.show();
                }
                break;
            default:
                System.out.println("没有你想要领养的宠物！");
        }
    }
    String name;
    int health=100;
    int love;
    String sexy;
    public void show(){
        System.out.println("您的宠物的名字是："+name+",健康值是"+health+",和主人请密度是"+love+",品种是"+sexy);
    }
}
