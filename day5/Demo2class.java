package cn.day5;
/*
* 类：属性和行为的集合
* 属性该事物的状态信息
* 行为：该事物能做什么
*
* 类是对一类事物的描述，是抽象的
* 对象是一类事物的实例，是具体的
*
* 类是对象的模板，对象是类的实体。
*
*定义一个类模拟学生，两部分组成
* 属性（是什么）姓名，年龄
* 行为（能做什么）吃饭睡觉学习
*
* 对应到 java的类当中
* 成员变量（属性）：
    * String name;
    * int age;
* 成员方法（行为）没有static
    * public void eat()
    * public void sleep()
    * public void study()
*
* 注意：成员变量直接定义在类当中，在方法外边。
*   成员方法不要直接static关键字
* */
public class Demo2class {
    //成员变量
    String name;//姓名；
    int age;//年龄

    //成员方法
    public void eat(){
        System.out.println("eat======");

    }
    public void sleep(){
        System.out.println("sleep======");

    }
    public void study(){
        System.out.println("study======");

    }
}
