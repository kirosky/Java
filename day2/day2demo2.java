package cn.day2;

import java.sql.SQLOutput;

/*
* 定义方法的完整格式
* 修饰符 返回值类型 方法名称（参数类型 参数名称，...）{
*       方法体
*       return 返回值；
* }
* 修饰符：现阶段的固定写法，public static
* 返回值类型：也就是方法最终产生的数据结果是什么类型
* 方法名称：方法的名字，规则和变量一样，小驼峰
* 参数类型：进入方法的数据是什么类型
* 参数名称：进入方法的数据对应的变量名称
* PS:参数如果有多个，使用逗号进行分隔
* 方法体：方法做的事
* return:两个作用，第一停止当前方法，第二将后面的返回值还给调用处
* 返回值：也就是方法执行后最终产生的数据结果，必须与方法名前面的“返回值类型”对应
*
* 方法的三种调用格式
* 单独调用0->方法名称（参数）
* 打印调用System.out.println(方法名称（参数）)
* 赋值调用
*
* 返回值类型固定写为void，，此方法只能够单独调用，不能进行打印调用或赋值调用。
*
* 对于有返回值方法，可以单独调用/打印调用/赋值调用
* 对于无返回值的方法，只能单独调用，不能打印调用或者赋值调用。
* */
public class day2demo2 {
    public static void main(String[] args) {
        int t;
        t=sum(1,2) ;
        System.out.println(t);
    }
    public static int sum(int a,int b) {
        int r=a+b;
        return r;

    }
}
