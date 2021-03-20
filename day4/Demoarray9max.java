package cn.day4;

public class Demoarray9max {
    public static void main(String[] args) {
        int[] array={5,15,30,20,10000,-20};
        int max=array[0],min=array[0];
        for (int i = 0; i < array.length; i++) {
            if(max<array[i]) {
                max = array[i];
            }
        }
        System.out.println("max:"+max);
        for (int i = 0; i < array.length; i++) {
            if(min>array[i]){
                min=array[i];
            }
        }
        System.out.println("min:"+min);
    }
}
