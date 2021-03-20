package cn.day10;
/*
* 定义一个方法，把数组{1，2，3}按指定的格式拼接成一个字符串，格式参照如下：[word1#word2#word3]
* 1.准备一个int[]数组，内容是：1，2，3
* 2.定义一个方法，用来将数组变成字符串
* 三要素：方法名称
* 返回值类型：String
* 列表参数：int[]
* 3.格式[word1#word2#word3]
* 用到：for,字符串拼接，每个数组元素之前都有word,分隔用#，区分是否最后一个
* 4.调用方法，得到返回值，并打印结果字符。
* */
public class Demo08StringP1 {
//    public static void main(String[] args) {
//        String[] stra={"word1","word2","word3"};
//        strprint(stra);
//    }
//    public static  void strprint(String[] str){
//        System.out.print("[");
//        for (int i = 0; i < str.length; i++) {
//            if(i!=str.length-1) {
//                System.out.print(str[i] + "#");
//            }else{
//                System.out.print(str[i]);
//            }
//        }
//        System.out.println("]");
//    }
    public static void main(String[] args) {
        int[] numarray={1,2,3};
        String str1=fromnumtostr(numarray);
        System.out.println(str1);
    }
    public static String fromnumtostr(int[] numarray){
        String str="[";
        for (int i = 0; i < numarray.length; i++) {
            if(i==numarray.length-1){
                str+="Word"+numarray[i]+"]";
            }else{
                str+="Word"+numarray[i]+"#";
            }
        }
        return str;
    }
}
