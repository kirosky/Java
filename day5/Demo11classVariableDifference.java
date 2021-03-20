package cn.day5;
/*
* 1.定义的位置不一样
* 局部变量：在方法内部
* 成员变量：在方法外部，直接写在类当中。
* 2.作用范围不一样
* 局部变量：只有方法当中可以使用，出了方法不能使用
* 成员变量：整个类都可以使用。
* 3.默认值不一样
* 局部变量：没有默认值，使用手动赋值
* 成员变量：如果没有赋值，会有默认值，规则和数组一样。
*4.内存的位置不一样
* 局部变量：位于栈内存
* 成员变量：位于堆内存
* 5.生命周期不一样（）
* 局部变量：随方法进栈而诞生，随方法出栈而消失。
* 成员变量：随对象创建而诞生，随对象被垃圾回收而消失。
*
*
* */
public class Demo11classVariableDifference {
    String name;//成员变量；
    public void method(){
        int num=20;//局部变量；
        System.out.println(num);
        System.out.println(name);
    }
    public void method1(int param){//方法的参数就是局部变量。
        System.out.println(param);//参数在方法调用的时候，必然会赋值。
        int age;
        //System.out.println(age);//没赋值不能用
        //System.out.println(num);//error跨方法了
        System.out.println(name);

    }
}
