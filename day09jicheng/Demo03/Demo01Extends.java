package day09jicheng.Demo03;
/*
* 在继承关系中，“子类就是一个父类”，也就是说，子类可以被当成父类看待。
* 列如父类是员工，子类是讲师，那么“讲师是员工”，关系is-a
*
* 定义父类格式：（一个普通类定义）
* public class 父类名称{
*   //。。。。。
*
* }
* 定义子类格式：
* public class 子类名称 extends 父类名称{
*   //。。。。。。
*
* }
*
*
* */
public class Demo01Extends {
    public static void main(String[] args) {
        //创建一个子类对象
        Teacher teacher =new Teacher();
        //Teacher类中虽然什么都没写，但会继承来自父类的method.
        teacher.method();

        //创建另一个子类助教对象
        Assistant assistant=new Assistant();
        assistant.method();
    }

}
