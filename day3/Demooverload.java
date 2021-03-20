package cn.day3;
/*
* 对于功能类似的方法来说，因为参数列表不一样，却需要记住那么多不同方法名称
*
*方法重载（Overload）：多个方法的名称一样，但是参数列表不一样。
*
*只需要记住一个方法名称，可以实现类似的多个功能
*
* 方法重载与下列因素有关
*
* 参数个数不同
* 参数类型不同
* 参数的多类型顺序不同
*
* 与下列无关
* 与参数名称无关
* 与方法的返回值类型无关
*public static double sum(int a,int b){
*   return a+b+0.0;
* }
* public static int sum(int x,int y){
*   return x+y;
* }
* */
public class Demooverload {
    public static void main(String[] args) {
        System.out.println(sum(12.9,44));
        //System.out.println(sum(1,2,3,4,5));
    }

    public static int sum(int a,int b) {
        int r=a+b;
        System.out.println("2个的方法");
        return r;
    }

    public static int sum(double a,double b) {
        System.out.println("2个的方法");
        return (int) (a+b);
    }
    public static int sum(int a,double b) {
        System.out.println("2个的方法");
        return (int) (a+b);
    }
    public static int sum(double a,int b) {
        System.out.println("2个的方法");
        return (int) (a+b);
    }
    public static int sum(int a,int b,int c) {
        int r=a+b;
        System.out.println("3个的方法");
        return r;
    }
    public static int sum(int a,int b,int c,int d) {
        int r=a+b;
        System.out.println("4个的方法");
        return r;
    }
}
