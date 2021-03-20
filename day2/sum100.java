package cn.day2;
/*
* 返回值，方法名称，参数列表
*
*
*
* */
public class sum100 {
    public static void main(String[] args) {
        System.out.println("结果"+hsum());
    }

    public static int hsum() {
        int sum=0;
        for (int i=1;i<=100;i++){
            sum=sum+i;
        }
        return sum;
    }
}
