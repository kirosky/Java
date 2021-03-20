package cn.day10;

import java.util.Scanner;

/*\
* 键盘输入一个字符串，并且统计其中各种字符出现的次数
* 种类有：大写字符了、小写字符，数字，其他
* 1.键盘输入 Scanner
* 2.键盘输入字符串String str=sc.next()
* 3.定义四个变量，分别代表四种字符各自出现次数。
* 需要对字符串一个字，一个字检查，String-->char[],方法就是toCharArray()
* 遍历char[]字符数组，对当前字符的种类进行判断，并用四个变量进行++
* 打印四个变量
*
*
* */
public class Demo09StringP2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" 请输入字符：");
        String str=sc.next();
        int chA=0,cha=0,num=0,oth=0;
        char[] charss=str.toCharArray();
        for (int i = 0; i < charss.length; i++) {
            if(charss[i]>='A'&&charss[i]<='Z'){
                chA++;
            }else if(charss[i]>='a'&&charss[i]<='z'){
                cha++;
            }else if(charss[i]>='0'&&charss[i]<='9'){
                num++;
            }
            else{
                oth++;
            }
        }
        System.out.println("字母总个数"+charss.length);
        System.out.println("大写字母个数："+chA);
        System.out.println("小写字母个数："+cha);
        System.out.println("数字个数："+num);
        System.out.println("其他字符个数："+oth);
    }
}
//qwe1234UTB#(&*^*^*&ghhhf$DcggHC 5778#%RTj7%^&jnkKkK:OV
