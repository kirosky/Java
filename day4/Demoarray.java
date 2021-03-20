package cn.day4;
//数组是一种引用数据类型
//数组当中的多个数据，类型必须统一
//数组的长度在程序运行期间不可改变
/*
* 数组初始化，内存中创建数组，并向其中赋予一些默认值
*
* 两种方式：
* 动态初始化（指定长度）
* 静态初始化（指定内容）
*
* 动态初始化数组格式：
* 数据类型[] 数组名称 = new 数据类型[数组长度]；
* 左侧数据类型：数组中保存的数据，全都是统一的什么类型
* 左侧的中括号：代表我是一个数组
* 左侧数组名称：给定数组取一个名字
* 右侧new:代表创建数组的动作
* 右侧数据类型：必须和左边的数据类型保持一致、
* 右侧中括号的长度：数组当中可以保存多少个数据，是一个int字
*
*静态初始化基本格式
* 数据类型[] 数据名称 =new 数据类型[]{元素1，元素2...};
* 静态初始没有直接告诉长度，根据大括号里面具体内容，可以自动推算
*
*
* */
public class Demoarray {
    public static void main(String[] args) {
        int[] arraya=new int[300];
        double[] arrayb=new double[10];
        String[] arrayc=new String[5];

        int[] array1=new int[]{1,2,3};
        String[] array2=new String[]{"hello","world","see"};
    }
}
