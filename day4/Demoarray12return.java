package cn.day4;
/*
*一个方法可以有0，1，多个参数，但是只有0或者1个返回值，不能有多个返回值
* 如果希望一个方法当中产生多个结果数据进行返回
* 用一个数组作为返回值类型即可
*
*任何数据类型都能作为方法的参数类型，或者返回值类型
* 数组作为方法的参数，传进去的其实是数组的地址值。
* 数组作为方法的返回值，返回的其实是数组的地址值。
* */
public class Demoarray12return {
    public static void main(String[] args) {
        int[] r=calculate(10,20,30);
        System.out.println("sum"+r[0]);
        System.out.println("avg"+r[1]);
        System.out.println("main方法接收到返回值数组是");
        System.out.println(r);
    }
    public static int[] calculate(int a,int b,int c){
        int sum=a+b+c;
        int avg=sum/3;//两个数据都需保存,用数组保存返回
        int[] array=new int[2];
        array[0]=sum;
        array[1]=avg;
        System.out.println("方法内部数组：");
        System.out.println(array);
        return array;
    }
}
