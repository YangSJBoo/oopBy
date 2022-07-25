package demo01;
//static 修饰的变量和方法 是随着类加载而加载的
//类是一个抽象的 static是跟随这个抽象的东西而加载了
// 不能调用普通方法原因就是 普通方法还没存在 也就是对象还没被创建（包括被static修饰的变量也是）
// 而static是对象被创建前就已经加载实现了
public class person {
    String  name;
    int age;
    String contion;


    public void m1(){
        n1();//普通方法可以调用静态方法
        System.out.println("调用m1");
    }
    public void m2(){
        System.out.println("调用m2");
    }
     static public void n1(){
        //m1();
         //静态方法不可调用 普通方法
         //static 修饰的变量或者方法 都是随着类加载而加载的
         // 因为 普通方法并没有被实例化 所以并不能调用
        System.out.println("调用n1");
    }
   static public void n2(){
        System.out.println("调用n2");
    }
}
