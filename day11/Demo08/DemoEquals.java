package day11.Demo08;
/*
* person类默认继承了Object类，所以可以使用Object类idequal方法
*   boolean equals(Object obj)指示其他某个对象是否与此对象相等
*
*   public boolean equals(Object obj){
*   return (this==obj);
*   Object obj可以传递任意对象
* 方法体：
* this那个对象调用的方法，方法中的this就是那个对象
* }
* */
public class DemoEquals {
    public static void main(String[] args) {
        Person p1=new Person("aaa",12);
        Person p2=new Person("qwer",22);
        System.out.println(p1+"=p1");
        System.out.println(p2+"=p2");
        boolean b=p1.equals(p2);//引用比较的地址内容
        System.out.println(b);
    }
}
