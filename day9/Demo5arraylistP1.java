package cn.day9;
/*
生成6个1-33随机整数，添加到集合，并遍历集合。
1.需要存储6个数字，创建集合<Integer>
2.产生随机数需要用到Random
3.用循环6次，来产生6个随机数：for循环
4.循环内调用r.random()参数33，0-32，整体+1才是1-33；
5.把数字添加到集合中：add
6.遍历集合：for,size, get
* */

import java.util.ArrayList;
import java.util.Random;

public class Demo5arraylistP1 {
    public static void main(String[] args) {
        //创建ArrayList
        ArrayList<Integer> list =new ArrayList<>();
        Random r=new Random();

        for (int i = 0; i < 6; i++) {
            int num=r.nextInt(33)+1;//1-33;
            System.out.println("第"+(i+1)+"个随机数:"+num);
            list.add(num);
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("遍历输出第"+(i+1)+"数："+list.get(i));
        }
    }
}
