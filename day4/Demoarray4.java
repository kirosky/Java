package cn.day4;
/*java内存划分5个部分
1.栈（stack）存放的都是方法中的局部变量。方法运行一定要在栈中运行
局部变量：方法参数，或者是方法{}内部的变量
作用域：一旦超出作用域，立刻从栈内存当中消失
2.堆（heap）凡是new出来的东西，都在堆当中
堆内存里面的东西都有一个地址值，16进制
堆内存里面的数据，都有默认值，规则：
    *若果是整数类型，默认为0；
    * 如果是浮点类型，默认为0.0；
    * 如果是字符类型，默认是’\u0000‘;
    * 如果是布尔类型，默认是false;
    * 如果是引用类型，默认是 null;
3.方法区（method area）存储.class相关信息，包含方法的信息。
4.本地方法栈： 与操作系统相关
5.寄存器： 与cpu相关
 */
public class Demoarray4 {
    public static void main(String[] args) {
        int[] array1=new int[3];
        System.out.println(array1);
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);

        System.out.println("---------------");
        array1[1]=10;
        array1[2]=20;
        System.out.println(array1);
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);

        int[] array2=new int[3];
        System.out.println(array2);
        System.out.println(array2[0]);
        System.out.println(array2[1]);
        System.out.println(array2[2]);


        System.out.println("---------------");
        array2[1]=100;
        array2[2]=200;
        System.out.println(array2);
        System.out.println(array2[0]);
        System.out.println(array2[1]);
        System.out.println(array2[2]);
    }
}
