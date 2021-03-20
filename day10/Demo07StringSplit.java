package cn.day10;
/*
* 分隔字符串的方法 ：
* public String[] split(String regex):按照参数的规则，将字符串切分成若干部分。
*split方法的参数其实是一个“正则表达式”，
* 如果按照英文句点“.”进行切分，必须写“\\.”(两个反斜杠)
* */
public class Demo07StringSplit {
    public static void main(String[] args) {
        String str1="aaa,bbb,ccc";
        String[] array1= str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(" "+array1[i]);
        }
        System.out.println("===========");
        String str2="aaa bbb ccc ddd";
        String[] array2 = str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("=========");

        String str4="XXX.CCC.VVV";
        String[] array3=str4.split("\\.");
        System.out.println(array3.length);
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }


    }
}
