package cn.day4;

public class Demoarray8 {
    public static void main(String[] args) {
        int[] array1={23,45,67,123,45,6};

        //原始方式遍历System.out.println();

        //循环,次数为数组长度
        for(int i=0;i<6;i++){
            System.out.println(array1[i]);
        }
        System.out.println("==========");
        for(int i=0;i<array1.length;i++){
            System.out.println(array1[i]);
        }//数组名.fori  自动提示


    }
}
