package day11.Demo08;
/*

 Person；类继承了Object类，可以使用Object的toString()方法
 String toString()返回该对象的字符串表示
 直接打印对象的地址值没有意义，需要重写Object类的toString方法
 看一个类是否重写了toString方法，直接打印这个类对应对象名字即可，没有-为地址值，有-重写方法打印

 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Demo01ToString {
    public static void main(String[] args) {
        Person p=new Person("sd",23);
        String s=p.toString();
        //覆盖重写后，就出什么
        System.out.println(s);
        System.out.println(p);

        Random r=new Random();
        System.out.println(r);

        Scanner sc =new Scanner(System.in);
        System.out.println(sc);

        ArrayList<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
    }
}
