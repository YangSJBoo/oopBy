package tset01.menu;

public class Menu {

    //1,showLoginMenu()方法，实现显示登录菜单
    public void showLoginMenu(){
        System.out.println("欢迎使用我行我素购物管理系统");
        System.out.println("\t\t\t1.\t登录系统");
        System.out.println("\t\t\t2.\t退出");
    }

    //2,showMainMenu()方法，实现显示主菜单
   public void showMainMenu(){
           System.out.println("我行我素购物管理系统主菜单");
           System.out.println("\t\t\t1.\t客户信息管理");
           System.out.println("\t\t\t2.\t真情回馈");
   }
    //showCustMenu()方法，实现显示客户信息管理菜单
    public  void showCustMenu(String name,int age){
        System.out.println("您的用户名是；"+name);
        System.out.println("您的年龄是；"+age);
    }
    //showSendGMenu()方法，实现显示真情回馈菜单
    public  void showSendGMenu(int a){
        if (a == 1) {
            System.out.println("执行幸运大放送");
        }else if(a==2){
            System.out.println("执行幸运抽奖");
        }else if(a==3){
            System.out.println("执行生日问候");
        }else {
            System.out.println("我行我素购物管理系统>真情回馈");
            System.out.println("\t\t\t1.\t幸运大放送");
            System.out.println("\t\t\t2.\t幸运抽奖");
            System.out.println("\t\t\t3.\t生日问候");
        }

    }
}
