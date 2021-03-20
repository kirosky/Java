package day10.Demo01;
/*
* 解决方法：
* 从JAVA9开始，接口当中允许定义私有方法。
* 1.普通私有方法，解决多个默认方法之间重复代码问题
* 格式：
* private 返回值类型 方法名称（参数列表）{
*   方法体
* }
* 2.静态私有方法，解决多个静态方法之间重复代码问题
* 格式：
* private ststic 返回值类型 方法名称（参数列表）{
*   方法体
*
* }
*
*
*
* */
public interface MyInterfacePrivateA {
    public default void methodDefault1() {
        System.out.println("默认方法1");
        methodcommon();
    }

    public default void methodDefault2() {
        System.out.println("默认方法2");
        methodcommon();
    }

    //    public default void methodcommon(){
//        System.out.println("AAA");
//        System.out.println("BBB");
//        System.out.println("CCC");
//    }
    private void methodcommon() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
//    }
    }
}
