package day10.Demo01;

public interface MyInterfacePrivateB {
    public static void methodStatciv1() {
        System.out.println("静态方法1");
        methodStaticcommon();
    }

    public static void methodStatic2() {
        System.out.println("静态方法2");
        methodStaticcommon();
    }

    //    public default void methodcommon(){
//        System.out.println("AAA");
//        System.out.println("BBB");
//        System.out.println("CCC");
//    }
    private static void methodStaticcommon() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
//    }
    }
}
