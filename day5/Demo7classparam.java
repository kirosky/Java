package cn.day5;

public class Demo7classparam {
    public static void main(String[] args) {
         Demo4classphone one=new Demo4classphone();
         one.brand="apple";
         one.price=8388.0;
         one.color="土豪金";
         method(one);//传进去的参数其实是地址
    }

    public static void method(Demo4classphone param) {
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);
    }
}
