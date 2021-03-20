package day09jicheng.Demo13;
/*
* 1.抽象类不能创建对象，如果创建，编译无法通过而报错，只能创建其非抽象子类的对象。
* 2.抽象类中，可以构造方法，是提供子类创建对象时，初始化父类成员使用的。
*3.抽象类中，不一定包含抽象方法，但是有抽象方法的类必定是抽象类。
* 4.抽象类的子类，必须重写抽象父类中所有的抽象方法，否则，编译无法通过而报错。除非该子类也是抽象类。
*
*
* */
public class DemoMain {
    public static void main(String[] args) {
//        Animal animal=new Animal()   error
//        Dog dog=new Dog();  error抽象类
        Dog2H ha =new Dog2H();//这是普通类，可以直接new对象。
        ha.eat();
        ha.sleep();
        System.out.println("========================");
        DogGolden Dg=new DogGolden();
        Dg.eat();
        Dg.sleep();
    }
}
