package day09jicheng.Demo03;
/*
*在父子类的继承关系中，如果成员变量重名，则创建子类对像时，访问有两种方式：
* 直接通过子类对象访问成员变量；
*   等号左边是谁，就优先用谁，没有则向上找。
* 间接通过成员方法访问成员变量
*   该方法属于谁，就优先用谁，没有则向上找。
*
*子，父，及子类中成员方法重名
* 局部变量：直接写成员变量名
* 本类的成员变量：this.成员变量名
* 父类的成员变量：super.成员变量名
*
* */
public class Demo02ExtendsField {
    public static void main(String[] args) {
        Fu fu=new Fu();//创建父类对象
        System.out.println("zi:"+fu.numfu);//只能使用父类的东西，没有任何子类东西

        Zi zi=new Zi();
        System.out.println("fu:"+zi.numfu);//10使用子类包含父类的内容
        System.out.println("zi:"+zi.numzi);//20
        System.out.println("============");

        //Zi zi=new Zi();等号左边是谁，就优先用谁，没有则向上找
        System.out.println(zi.num);//200
        //System.out.println(zi.abcc);//到处没有报错
        System.out.println("============");

        //这个方法是子类的，优先用子类的没有向上找。
        zi.methodZi();//200
        //这个方法是父类当中定义的，
        zi.methodFu();//100
        System.out.println("============");
        zi.methodZi();

    }
}
