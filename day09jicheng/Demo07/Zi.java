package day09jicheng.Demo07;

public class Zi extends Fu{
    public Zi(){
        //super();
        //默认隐含，不写也有，super();//调用父类无参构造方法。
        super( 10);//调用父类重载的构造方法。
        System.out.println("子类构造方法");
    }
    public void method(){
        //super();//错误，只有子类构造方法，才能调用父类构造方法。
    }
}
