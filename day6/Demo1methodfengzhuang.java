package cn.day6;
/*
* 面向对象三大特征：封装，继承，多态
* 封装性在Java当中的体现：
* 1.方法就是一种封装
* 2.关键字private也是一种封装。
* 封装就是将一些细节信息隐藏起来，对于外界不可见。
*
*
*
* */
public class Demo1methodfengzhuang {
    public static void main(String[] args) {
        int[] array={1,2,45,7,101,78,100};
        int max=getmax(array);
        System.out.println(max);
    }

    public static int getmax(int[] array) {
        int max=array[0];
        for (int i = 0; i < array.length; i++) {
            if (max<array[i]){
                max=array[i];
            }
        }
        return max;

    }
}
