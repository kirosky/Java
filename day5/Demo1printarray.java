package cn.day5;

import java.util.Arrays;
//面向过程：每个步骤亲历亲为
//面向过程：不关心具体步骤，找具有功能的人来做
//打印格式[10,20,30,40,50]
public class Demo1printarray {
    public static void main(String[] args) {
        int[] array={20,30,40,50,60};
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if(i== array.length-1){
                System.out.println(array[i]+"]");

            }else{
                System.out.print(array[i]+", ");
            }
        }
        System.out.println("=============");
        //面向对象
        System.out.println(Arrays.toString(array));
    }
}
