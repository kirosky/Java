package day10.Demo03;
/*\
* 这个子接口当中有几个方法？：4个
* methodA 来源于接口A
* methodB 来源于接口B
* methodCommon 同时来源于接口A和B
* method 来源于我自己
*
*
* */
public interface MyInterface extends MyInterfaceA,MyInterfaceB{

    public abstract void method();

    @Override
    public default void methodDefault() {

    }
}

