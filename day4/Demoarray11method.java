package cn.day4;
/*
* 数组可以作为方法的参数
* 当调用方法的时候，向方法的小括号进行传参，传进去的其实是数组的地址值。
*
*
* */
public class Demoarray11method {
    public static void main(String[] args) {
        int[] array = {10, 2320, 30, 40, 50};
        PrintArray(array);
        System.out.println();
        System.out.println("============aaa=============");
        PrintArray(array);
        System.out.println();
        System.out.println("===========bbb=============");
        PrintArray(array);
    }
    public static void PrintArray(int[] array1){
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            }
        }
}
