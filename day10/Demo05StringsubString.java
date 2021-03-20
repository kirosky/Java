package cn.day10;
/*
* public String substring(int index):截取从参数位置一直到字符串末尾，返回新字符串。
* public String substring(int begin,int end):截取从begin开始，一直到end结束，中间的字符串。【begin,end）包含左边，不包含右边
*
*
* */
public class Demo05StringsubString {
    public static void main(String[] args) {
        String str1="HelloWorld";
        String str2=str1.substring(5);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("------------");

        String str3=str1.substring(4,7);
        System.out.println(str3);

        /*
        * 下面写法，字符串内容仍然没有改变
        * 两个字符串
        * StrA保存地址值
        * 本来地址值是Hello的0x666
        * 后来地址值变成Java的0x999
        * */
        String strA="Hello";
        System.out.println(strA);
        strA="Java";
        System.out.println(strA);
    }
}
