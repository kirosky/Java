package cn.day4;
/*
* 数组元素反转，对称位置元素交换
*遍历一个数组一个索引
* 对称位置需要两个索引min=0，max=length-1
* 交换位置a,b,temp;
*停止交换min=max,min>max;即min<max交换；
*
* */
public class Demoarray10reverse {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
        int a;
        int min,max;

        for (int i = 0; i < array.length/2; i++) {
            min=i;
            max= array.length-1-i;

            a=array[min];
            array[min]=array[max];
            array[max]=a;

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
        int b;
        int[] array1={10,20,30,40,50};
        for (int i = 0; i < array1.length; i++) {
            min=i;
            max=array1.length-1-i;
            if(min<max){
                b=array1[min];
                array1[min]=array1[max];
                array1[max]=b;
            }else{
                break;
            }
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
        }
    }
}
