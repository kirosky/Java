package day09jicheng.Demo03;

public class Zi extends Fu{
    int numzi=20;
    int num=200;
    int nums=21;
    //成员变量
    public void methodZi(){
        //因为本类当中有num，所以这里用的本类的num
        System.out.println(num);
        int nums=31;
        System.out.println("nums"+nums);//31
        System.out.println("nums"+this.nums);//21
        System.out.println("nums"+super.nums);//11
    }
}
