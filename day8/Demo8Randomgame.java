package cn.day8;
/*
* 猜数字游戏
* 1.产生一个随机数，一旦产生不再变化，用random的nextInt
* 需要键盘输入，用到scanner
* 获取键盘输入的数字，用Scanner中的nextInt方法、
* 已经得到两个数字，用if
*   太大，提示，重试
*   太小，提示，重试
*   猜中，游戏结束
* 5.重试再来一次，循环次数不确定，用while(true)
* */
import java.util.Random;
import java.util.Scanner;

public class Demo8Randomgame {
    public static void main(String[] args) {
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        int num=r.nextInt(100)+1;

        while(true){
            System.out.println("请输入数字：");
            int rt=sc.nextInt();
            if(rt==num){
                System.out.println("猜对了");
                break;
            }else if(rt<num){
                System.out.println("小了");


            }else{
                System.out.println("大了");
            }
        }
        System.out.println("游戏结束");
    }
}
