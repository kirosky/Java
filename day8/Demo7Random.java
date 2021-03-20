package cn.day8;
/*
* 根据int变量要求，俩获取随机数字，范围是[1,n]
* 1.定义int变量n,随意赋值
* 2.要使用Random,导包，创建，使用
* 3.10---0~9，要1~10，整体+1
* 4.打印
* */
import java.util.Random;

public class Demo7Random {
    public static void main(String[] args) {
        Random n=new Random();
        int t=5;

        for (int i = 0; i < 100; i++) {
            int r=n.nextInt(t)+1;
            System.out.println(r);
        }
    }
}
