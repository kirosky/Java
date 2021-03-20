package day11.Demo01;

public class Zi extends Fu{
    @Override
    public void methodabs() {
        //重写抽象方法
    }
//错误写法：不能覆盖重写父类当中final的方法
    //    @Override
//    public void method(){
//        System.out.println("子类覆盖父类方法执行");
//    }
}
