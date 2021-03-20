package day10.Demo02;
//来源于两个接口的抽象方法都要覆盖重写
public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB{
    @Override
    public void methodA() {
        System.out.println("覆盖重写了A方法。。。。");
    }

    @Override
    public void methodAbs() {
        System.out.println("覆盖重写了AbS都有的抽象方法，，，，");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写了B方法。。。。");
    }
    @Override
    public void methoddefault(){
            System.out.println("对多个接口中冲突的默认方法进行了重写");
    }

}
