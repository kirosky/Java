package cn.day3;
/*
* 比较两个数据是否相等
* 参数类型分别为两个byte,两个short,两个int,两个long
* 在main中测试
*
* */
public class Demooverload1 {
    public static void main(String[] args) {
        byte a=10;
        byte b=20;
        System.out.println(bijiao(a,b));
        System.out.println(bijiao((short)a,(short)b));
        System.out.println(bijiao(11,12));
        System.out.println(bijiao(13L,13L));
    }
    public static boolean bijiao(byte a,byte b) {
         boolean same;
        System.out.println("两个byte");
         if(a==b){
             same=true;
         }else{
             same=false;
         }
         return same;
    }
    public static boolean bijiao(short a,short b) {
        boolean same=a==b?true:false;
        System.out.println("两个short");
        return same;

    }
    public static boolean bijiao(int a,int b) {
        System.out.println("两个int");
        return a==b;

    }
    public static boolean bijiao(long a,long b) {
        System.out.println("两个long");
        if(a==b){
            return true;
        }else{
            return false;
        }

    }

}
