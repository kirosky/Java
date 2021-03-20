package cn.day8;
import java.util.Scanner;
/*
*键盘输入两个int数字，求和；
* */
public class Demo2scannersum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" 请输入第一个数字：");
        int num1=sc.nextInt();
        System.out.println(" 请输入第二个数字：");
        int num2=sc.nextInt();
        int s=Sumd(num1,num2);
        System.out.println("两数和为"+s);

    }
    public static int Sumd(int a,int b){
        return a+b;
    }
}
