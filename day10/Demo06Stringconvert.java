package cn.day10;
/*
* public char[] tochararray():将当前字符串拆分成字符数组作为返回值。
* public byte[] getBytes():获得当前字符串底层的字节数组。
* public String replace(CharSequence oldString,CharSequence newString)
* 将所有出现的老字符串替换为新的字符串，返回替换之后的结果新字符串。
*备注：CharSequence意思就是说可以接受字符串类型。
*
*
* */
public class Demo06Stringconvert {
    public static void main(String[] args) {
        char[] chars="hello".toCharArray();
        System.out.println("第一个元素："+chars[0]);
        System.out.println("长度："+chars.length);
        System.out.println("=========");
        for (int i = 0; i < chars.length; i++) {
            System.out.print(" "+chars[i]);
        }
        System.out.println();
        System.out.println("=============");
        //转换成字节数组
        byte[] bytes="abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(" "+bytes[i]);
        }
        System.out.println();
        System.out.println("===========");
        //字符串内容替换
        String str1="How do you do";
        String str2=str1.replace("o","*");
        System.out.println(str1);
        System.out.println(str2);

    }
}
