package cn.day10;
/*
* ==是进行对象的地址值比较，如果确实需要字符串的内容比较，可以使用两个方法。
* public boolean equals(Object obj):参数可以是任何对象，只有参数是一个字符串并且内容相同的才会给true;否则返回false.
* 备注： 1.任何对象都能用object进行接受。
*       2.equals方法具有对称性，也就是a.equals(b)和b.equals(a)效果一样。
*       3.如果比较双方一个常量一个变量，推荐把常量字符串写在前面。
*       推荐：“abc”.equals(str) 不推荐str.equals("abc")
* public boolean equalsIgnoreCase(String str):忽略大小写，进行内容比较
*
*
*
* */
public class Demo03StringEquals {
    public static void main(String[] args) {
        String str1="hello";
        String str2="hello";
        char[] chararray={'h','e','l','l','o'};
        String str3=new String(chararray);
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("hello"));
        System.out.println("hello".equals(str1));
        String str4="Hello";
        System.out.println(str1.equals(str4));

        String str5=null;
        System.out.println("abc".equals(str5));//推荐false
        //System.out.println(str5.equals("abc"));//不推荐报错空指针异常  null.()

        String strA="Java";
        String strB="java";
        System.out.println(strA.equals(strB));//false
        System.out.println(strA.equalsIgnoreCase(strB));//true
        //只有英文区分大小写，其他不区分
    }
}
