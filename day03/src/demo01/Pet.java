package demo01;

public class Pet {
    String name;
    int health=100;
    int love;
    String sexy;
    public void show(){
        System.out.println("您的宠物的名字是："+name+",健康值是"+health+",和主人请密度是"+love+",品种是"+sexy);
    }

    public Pet() {
        System.out.println("调用无参构造");
        show();
    }public Pet(String name, int health) {
        this();//调用构造方法 必须再第一行
        this.name=name;
        this.health=health;
        System.out.println("调用有参构造");
        show();
    }

    public static void main(String[] args) {
//        Pet pet=new Pet();
        Pet pet1=new Pet("petOne",50);

    }


}
