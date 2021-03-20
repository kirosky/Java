package day10.Demo01;

public class Demo04inteface {
    public static void main(String[] args) {
        MyInterfacePrivateB.methodStatciv1();
        MyInterfacePrivateB.methodStatic2();
        System.out.println("==============");
        MyInterfacePrivateAImpl impl=new MyInterfacePrivateAImpl();

        impl.methodDefault1();
        impl.methodDefault2();

    }
}
