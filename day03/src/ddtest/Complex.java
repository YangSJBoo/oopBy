package ddtest;

import java.util.Scanner;

public class Complex {
    double real;//复数的实数部分
    double im;//复数的虚数部分
    //静态修饰 要不然会出现.StackOverflowError推内存超出分配的内存限制
  static Complex result=new Complex(0,0);//不加static修饰 会一直在7 8行循环直到超出分配的堆栈空间
    String str;//接收show方法返回值
    String iStr1;//接收输入对象的show方法的返回值
    String iStr2;//接收this的返回值

    public Complex(double real, double im) {
        this.real = real;
        this.im = im;
    }
    public  String show(){
        str="("+real+"+"+im+")";
        return str;
    }
    public Complex() {}//无参构造
    public Complex add(Complex c){//返回值是一个负数对象
        result.real=this.real+c.real;
        result.im=this.im+c.im;
        iStr1=c.show();
        iStr2=this.show();
        if (result.im<0){//判断虚数是否为负来选择怎么输出
            System.out.println(iStr1+iStr2+"相加结果为："+result.real+result.im+"i");
        }else if(result.im>0){
            System.out.println(iStr1+iStr2+"相加结果是："+result.real+"+"+result.im+"i");
        }

        return result;
    }
    public Complex add(double real){//返回值是一个负数对象
        result.real=real+this.real;
        result.im=this.im;
        iStr2=this.show();
        if (result.im<0){//判断虚数是否为负来选择怎么输出
            System.out.println(iStr1+iStr2+"相减结果为："+result.real+result.im+"i");
        }else if(result.im>0){
            System.out.println(iStr2+"与实数"+real+"相加结果为："+result.real+"+"+result.im+"i");
        }
        return result;
    }
    public Complex sub(Complex c){
        result.real=c.real-this.real;
        result.im=c.im-this.im;
        iStr1=c.show();
        iStr2=this.show();
        if (result.im<0){//判断虚数是否为负来选择怎么输出
        System.out.println(iStr1+iStr2+"相减结果为："+result.real+result.im+"i");
        }else if(result.im>0){
            System.out.println(iStr1+iStr2+"相减结果为："+result.real+"+"+result.im+"i");
        }
        return result;
    }

    public  Complex mul(Complex c){
       result.real=c.real*this.real;
       result.im=c.im*this.im;
        iStr1=c.show();
        iStr2=this.show();
        if (result.im<0){//判断虚数是否为负来选择怎么输出
            System.out.println(iStr1+iStr2+"相乘结果为："+result.real+result.im+"i");
        }else if(result.im>0){
            System.out.println(iStr1+iStr2+"相乘结果为："+result.real+"+"+result.im+"i");
        }
        return  result;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("输入第一个复数的实数");
        double num1=in.nextInt();
        System.out.print("输入第一个复数的虚数");
        double num2=in.nextInt();
        Complex complex=new Complex(num1,num2);
        System.out.print("第一个复数为"+complex.show()+"\n");
        System.out.print("输入第二个复数的实数");
        double num3=in.nextInt();
        System.out.print("输入第二个复数的虚数");
        double num4=in.nextInt();
        Complex complex1=new Complex(num3,num4);
        System.out.print("第二个复数为"+complex1.show()+"\n");
        System.out.print("第一个复数实数位加一");
        complex.add(1);//实数相加
        complex.add(complex1);//复数与复数相加
        complex.sub(complex1);//复数相减结果
        complex.mul(complex1);//复数相乘

    }
}
