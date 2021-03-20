package cn.day4;
/*
* 数组索引从编号0开始，一直到“数组的长度-1”为止
* 如果访问数组元素的时候，索引编号并不存在，那么将会发生数组索引越界异常
* 原因编号写错
* 解决修改成为存在的正确索引编号。
*
*
*所有的引用类型变量，都可以赋值为一个null,代表其中什么都没有。
* 数组必须进行new初始化，才能使用其中的元素
* 如果只赋予一个null,没有进行new创建，那么将发生空指针异常NullPointerException
* 原因忘了new,解决补上new
* */
public class Demoarray6 {
    public static void main(String[] args) {
        int[] array1={1,23,45};
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);
        int[] array2=null;
        array2=new int[3];
        System.out.println(array2[0]);

    }
}
