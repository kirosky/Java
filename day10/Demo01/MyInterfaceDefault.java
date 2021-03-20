package day10.Demo01;
/*
* 从java8开始，接口里允许定义默认方法。
* 格式：
* public default 返回值类型 方法名称(参数列表){
*   方法体
* }
* 备注：接口当中的默认方法，可以解决接口升级的问题。
* */
public interface MyInterfaceDefault {
    //抽象方法
    public abstract void methodAbs();
    //接口新添加了个抽象方法，需要在所有实现类覆盖重写，避免多余更改
   // public abstract void methodAbs2();
    //新添加的方法改成默认方法，就能解决问题
    public default void methodDefault(){
        System.out.println("新添加的默认方法");
    }
}
