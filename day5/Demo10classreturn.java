package cn.day5;

public class Demo10classreturn {
    public static void main(String[] args) {
        Demo4classphone two=getphone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }
    public static Demo4classphone getphone(){
        Demo4classphone one =new Demo4classphone();
        one.brand="apple";
        one.price=3999;
        one.color="red";
        return one;//使用一个对象类型作为方法的返回值时：返回值其实就是对象的地址值。
    }
}
