package cn.day5;
/*
*  通常情况下，一个类并不能直接使用，需要根据类创建一个对象才能使用
* 1.导包；也就是指出需要使用的类，在什么位置
* import 包名称.类名称；
* import cn.day5.Demo3class;
* 对于和当前类属于同一个包的情况下，可以省略导包语句不写
* 2.创建格式：
* 类名称 对象名=new 类名称（）；
* Demo3class stu=new Demo3class();
* 3.使用，分为两种情况：
* 使用成员变量：对象名.成员变量名
* 使用成员方法：对象名.成员方法名（参数）
* （也就是，想用对象名点谁）
*
*注意：如果成员变量没有进行赋值，那么将会有一个默认值，规则和数组一样。
*
*
* */
public class Demo3class {
    public static void main(String[] args) {
        /*
        * 1.导包
        * 我需要使用Demo2class类，和我自己Demo3class位于同一包下，所以省略导包语不写
        * 2.创建，格式：
        * 类名称 对象名=new类名称();
        * 根据Student类，创建一个名为stu的对象
        * */
        Demo2class stu=new Demo2class();
        //3.使用其中的成员变量，格式：
        //对象名.成员变量名
        System.out.println(stu.name);//null
        System.out.println(stu.age);//0
        System.out.println("---------");
        //改变对象当中的成员变量名
        stu.name="cc";
        stu.age=18;
        System.out.println(stu.name);//null
        System.out.println(stu.age);//0
        //4.使用对象的成员方法，格式：
        //对象名.成员方法名()
        stu.study();
        stu.eat();
        stu.sleep();
    }
}
