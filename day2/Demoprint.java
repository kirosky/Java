package cn.day2;
//打印指定次数的helloworld
public class Demoprint {
    public static void main(String[] args) {
        wprint(5);
    }

    public static void wprint(int a) {
        for (int i=1;i<=a;i++){
            System.out.println("helloworld"+i);

        }

    }
}
