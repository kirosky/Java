package cn.day10;
/*
* String当中于获取相关的常用方法有：
* public int length():获取字符串当中含有的字符个数，拿到字符串长度。
* public String concat(String str):将当前字符串和参数字符串拼接成为返回值新的字符串。
* public char charAt(int index):获取指定索引位置的单个字符。（索引从0开始）
* public int indexOf(String str):查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1.
*
*
* */
public class Demo04StringGet {
    public static void main(String[] args) {
        //获取字符串长度
        int length ="assdfhsk".length();
        System.out.println("字符串长度："+ length);
        //拼接字符
        String str1="hello";
        String str2="World";
        String str3=str1.concat(str2);
        System.out.println(str1);//不变
        System.out.println(str2);//不变
        System.out.println(str3);//新字符串

        //获取指定索引位置的单个字符
        char ch="Hello".charAt(1);
        System.out.println("在1号索引位置的字符:"+ch);

        //查找参数字符串在本来字符串当中出现的第一次索引位置，没有反-1
        String ori="helloworld";
        int index=ori.indexOf("llo");
        System.out.println("第一次索引值："+index);

        System.out.println("helloworld".indexOf("abc"));//-1

    }
}
