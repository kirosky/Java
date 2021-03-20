package cn.day8;
/*
* random类用来生成随机数字，使用起来也是三个步骤。
* 1.导包
* import java.util.Random;
* 2.创建
* Random r=new Random();//小括号中留空
* 3.使用
* 获取一个随机的int数字（范围是int所有范围，由正负两种）：int num=r.nextInt()
*获取一个随机int数字，（参数代表范围，左闭右开区间）；int num=r.nextInt(3)
* 实际上代表的含义是：[0,3),也就是0~2
*
* */
import java.util.Random;

public class Demo6Random {
    public static void main(String[] args) {
        Random r=new Random();
        int num=r.nextInt();
        System.out.println("随机数："+num);
        Random r1=new Random();
        for (int i = 0; i < 100; i++) {
            int num1=r1.nextInt(10);
            System.out.println(num1);
        }

    }
}
