package day09jicheng.Demo09;
/*
* super关键字用来访问父类内容，而this关键字用来访问本类内容。用法有三种：
* 1.在本类的成员方法中，访问本类的成员变量。
*2.在本类的成员方法中，访问本类的另一个成员方法。
*3.在本类的构造方法中，访问本类的另一个构造方法。
* this(...)调用也必须是构造方法的第一个语句。唯一一个
* supper和this两种构造调用，不能同时使用。
* */
public class Zi extends Fu{
    int num=10;
    public Zi(){
        //super()这一行不在赠送
        this(123);//本类的无参构造，调用本类的有参构造。
        //this(12,13);//error写法
    }
    public Zi(int n){
        this(0,3);
    }
    public Zi(int n,int m){

    }
    public void shomnum(){
        int num=20;
        System.out.println(num+"局部变量");//局部变量
        System.out.println(this.num+"本类中的成员变量");//本类中的成员变量
        System.out.println(super.num+"父类的成员变量");//父类的成员变量
    }
    public void methodA(){
        System.out.println("AAA");
    }

    public void methodB(){
        this.methodA();//在本类的成员方法中，访问本类的另一个成员方法
        System.out.println("BBB");
    }

}
