package cn.day2;

public class Demosame {

    public static void main(String[] args) {
        System.out.println(dsame(1,2));

    }
    public static boolean dsame(int a,int b) {
        if (a == b) {
            return true;
        } else {
            return false;

        }
    }
    public static boolean issame(int a,int b) {
        boolean same=a==b?true:false;
//        boolean same=a==b;
//        return a==b;
        return same;

    }
}
