package day08.Demo1;

public class MyClass {
    int num;//成员变量
    static int numstatic;//静态变量

    //成员方法
    public void method(){
        System.out.println("普通方法成员");
        //成员方法可以访问成员变量
        System.out.println(num);
        //成员方法可以访问静态变量
        System.out.println(numstatic);
    }
    //静态方法
    public static void mtthodStatic(){
        System.out.println("静态方法");
        //静态方法可以访问静态变量
        System.out.println(numstatic);
        //静态方法不能直接访问非静态变量
//        System.out.println(num);//error

        //静态方法中不能使用this 关键字。
        //System.out.println(this);//error  静态方法类名称.方法名，不用对象，this代表当前对象，矛盾。
    }
}
