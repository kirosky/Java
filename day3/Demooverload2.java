package cn.day3;
//在调用输出语句，println方法其实就是进了多种数据类型的重载
public class Demooverload2 {
    public static void main(String[] args) {
        myprint(10);
        myprint("hello");
    }
    public static void myprint(byte num) {
        System.out.println(num);
    }
    public static void myprint(short num) {
        System.out.println(num);
    }
    public static void myprint(int num) {
        System.out.println(num);
    }
    public static void myprint(long num) {
        System.out.println(num);
    }
    public static void myprint(float num) {
        System.out.println(num);
    }
    public static void myprint(double num) {
        System.out.println(num);
    }
    public static void myprint(char zf) {
        System.out.println(zf);
    }
    public static void myprint(boolean b) {
        System.out.println(b);
    }
    public static void myprint(String str) {
        System.out.println(str);
    }
}
