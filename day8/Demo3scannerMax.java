package cn.day8;

import java.util.Scanner;

public class Demo3scannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第1个数字：");
        int a = sc.nextInt();
        System.out.println("输入第2个数字：");
        int b = sc.nextInt();
        System.out.println("输入第3个数字：");
        int c = sc.nextInt();
        int maxd=MAxDigit(a,b,c);
        System.out.println("3数最大为："+maxd);
    }
    public static int MAxDigit(int a,int b,int c){
        int m;
        if(a>=b){//int temp=a>b?a:b    temp>c?temp:c   可三元运算符
            m=a;
        }else{
            m=b;
        }

        if(m>=c){
            return m;
        }else{
            return c;
        }

    }

}
