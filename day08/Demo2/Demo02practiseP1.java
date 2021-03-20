package day08.Demo2;

import java.util.Arrays;

public class Demo02practiseP1 {
    public static void main(String[] args) {
        String str ="qwehuhauihd234739ad";
        //升序排列sort
        //数组才能用Arrays.sort
        //String-->数组，toCharArray
        char[] chars=str.toCharArray();
        Arrays.sort(chars);
        System.out.println(chars);//对字符数组升序排列
        for (int i=chars.length-1;i >=0;i--) {//倒叙遍历
            System.out.print(chars[i]);
        //
        }
        //数组名.forr//倒叙排
    }
}
