package cn.day4;

public class Demoarray5 {
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

        System.out.println("===========");
        int[] array2=array1;
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
