package cn.day8;

import java.util.Scanner;

public class Demo5annoymous {
    public static void main(String[] args) {
        //普通方式
//        Scanner sc =new Scanner(System.in);
//        int num=sc.nextInt();

        //匿名对象方式
//        int num=new Scanner(System.in).nextInt();
//        System.out.println("输入的是"+num);

        //使用一般写法传入参数
//        Scanner sc =new Scanner(System.in);
//        methodparam(sc);

        //使用匿名对象进行传参
//        methodparam(new Scanner(System.in));
        Scanner sc =methodreturn();
        int num =sc.nextInt();
        System.out.println("输入的是"+num);
    }
    public static void methodparam(Scanner sc){
        int num=sc.nextInt();
        System.out.println("输入的是："+num);
    }
    public static Scanner methodreturn(){
//        Scanner sc=new Scanner(System.in);
//        return sc;
        return new Scanner(System.in);
    }
}
