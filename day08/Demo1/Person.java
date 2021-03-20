package day08.Demo1;

public class Person {
    static {
        System.out.println("静态代码块执行！");

    }
    public Person(){
        System.out.println("Person构造方法执行！");
    }
}
