package day10.Demo05;
/*
* 在多态的代码中，成员方法的访问规则是：
*   看new的是谁，就优先用谁，没有则向上找。
*
*成员方法：编译看左边，运行看右边。
*成员变量：编译看左边，运行看左边。
* */
public class Demo02Multiethod {
    public static void main(String[] args) {
        Fu obj=new Zi();//多态
        obj.method();//父子都有，优先用子
        obj.methodFu();//子类没有，父类有，向上找到父类

        //编译看左边，左边是Fu,Fu当中没有methodZi方法，所以编译报错。
       // obj.methodZi();//error
    }
}
