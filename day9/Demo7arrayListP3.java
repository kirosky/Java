package cn.day9;

import java.util.ArrayList;

/*
* 定义以指定格式打印集合的方法（ArrayList类型作为参数）使用{}括起集合，使用@分隔每个元素。
* 格式参照{元素@元素@元素}
*
*
* */
public class Demo7arrayListP3 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("柳岩");
        list.add("唐嫣");
        list.add("高圆圆");
        list.add("景甜");
        System.out.println(list);
        list1(list);
    }
    public static void list1(ArrayList<String> str){
        System.out.print("{");
        for (int i = 0; i < str.size(); i++) {
            if(i!=str.size()-1){
            System.out.print(str.get(i)+"@");
            }else{
                System.out.print(str.get(i));
            }
        }
        System.out.println("}");
    }

}
