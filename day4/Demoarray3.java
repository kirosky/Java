package cn.day4;
/*
* 使用动态初始化数组，其中元素将会自动拥有一个默认值：
* 若果是整数类型，默认为0；
* 如果是浮点类型，默认为0.0；
* 如果是字符类型，默认是’\u0000‘;
* 如果是布尔类型，默认是false;
* 如果是引用类型，默认是 null;
*
*静态初始化其实也有默认值过程，系统自动将默认值替换成大括号当中的具体数值
* */
public class Demoarray3 {
    public static void main(String[] args) {
        int[] arraya=new int[3];
        System.out.println(arraya);//地址值
        System.out.println(arraya[0]);//0
        System.out.println(arraya[1]);//0
        System.out.println(arraya[2]);//0
        System.out.println("-------------");
        arraya[1]=123;

        System.out.println(arraya[1]);
    }
}
