package day10.Demo02;

public interface MyInterface {
    public default void method(){
        System.out.println("接口的默认方法");
    }
}
