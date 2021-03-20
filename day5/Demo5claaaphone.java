package cn.day5;

public class Demo5claaaphone {
    public static void main(String[] args) {
        Demo4classphone one=new Demo4classphone();
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("----====");
        one.call("cc");
        one.sendMessage();
        one.brand="meizu";
        one.color="blue";
        one.price=10000;
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println(".......................");
        Demo4classphone two=new Demo4classphone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println("----====");
        two.call("dd");
        two.sendMessage();
        two.brand="huawei";
        two.color="white";
        two.price=6789;
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);

    }
}
