package day08.Demo2;
/*
* 计算-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少、、
* 1.确定范围for循环
* 2.起点位置-10.8应该转换成-10，两种方法：
    * 2.1可以使用Math.ceil向上取整
    * 2.2强制成为int，自动舍弃所有小数位
3。每个数字都是整数，所以步进表达式应该是num++,每次都是+1
* 拿到绝对值Math.abs
* 一旦发现一个数字，需要让计数器++统计

* */
public class Demo04MathpractiseP2 {
    public static void main(String[] args) {
        int c=0;
        double min=-10.8;
        double max=5.9;//int i=(int)min;
        for(double i=Math.ceil(-10.8);i<5.9;i++){
           if( Math.abs(i)<2.1||6<Math.abs(i)){
               c++;
               System.out.print(" "+i);
           }
        };
        System.out.println();
        System.out.println(c);

    }
}
