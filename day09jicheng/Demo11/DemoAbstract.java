package day09jicheng.Demo11;
/*
*如果父类当中的方法不确定如何进行{}方法体实现，那么这就应该是一个抽象方法。
*
*
*
* */
public class DemoAbstract {

    public static void main(String[] args) {
        //Animal animal=new Animal();//错误写法，不能直接创建抽象类对象
        Cat cat=new Cat();
        cat.eat();
    }
}
