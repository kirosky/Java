package cn.day4;
/*
* 如何获取数组的长度格式：
* 数组名.length
* 这将会得到一个int数字，代表数组的长度。
*
*
*
* */
public class Demoarray7length {
    public static void main(String[] args) {
        int[] array=new int[3];
        int[] array2={1,2,3,2,1,3,5,6,7,8,90,5,3,2,1};
        int len=array2.length;
        System.out.println("数组长度："+len);

        int[] array3=new int[3];
        System.out.println(array3.length);
        System.out.println(array3);
        array3=new int[5];//数组名相当于标签，新建数组地址替换了标签内容
        System.out.println(array3.length);
        System.out.println(array3);

    }
}
