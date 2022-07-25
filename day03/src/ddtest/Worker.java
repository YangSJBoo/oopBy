package ddtest;

public class Worker {
    String name;//工人的姓名
    int age;//年龄
    double salary;//工资时薪
    Address addr;
    public Worker() {}//无参的构造方法

    public Worker(String name, int age, double salary) {//有参的构造方法
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public void work(){
        System.out.println("工人的姓名是："+name+"，工人的年龄是："+age+",工人的工资是："+salary);
    }
    public void work(int hours){
        System.out.println("工人的姓名是："+name+"，工人的年龄是："+age+",工人的工资是："+(salary*hours)+"，工作时间是："+hours);
    }

    public static void main(String[] args) {
        Worker worker1=new Worker("ysj1",21,21);
        Worker worker2=new Worker("ysj2",22,22);
        Worker worker3=new Worker("ysj3",23,23);
        worker1.work();
        worker2.work();
        worker3.work(2);
        Worker worker=new Worker("zhangsan",25,2500);
        worker.work();
        worker.addr=new Address("北京市海淀区清华园一号","100084");

    }
}
