package cn.day7;
/*
* 当方法的局部变量和类的成员变量重名时，根据就近原则，优先使用局部变量。
*如果需要访问本类当中的成员变量，需要使用格式：this.成员变量名。
* "谁通过调用的方法，谁就是 this"
* 重名下起到区分效果
* */
public class Person {
    String name;//自己名字
    public void sayhello(String name){//对方名字
        System.out.println(name+",hi,i am "+this.name);
        System.out.println(this);
    }
}
