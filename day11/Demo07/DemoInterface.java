package day11.Demo07;

import java.util.ArrayList;
import java.util.List;
/*
* java.util.List正是ArrayList所实现的接口。
*
* */
public class DemoInterface {
    public static void main(String[] args) {
        //左边接口名称，右边是实现类名称，这就是多态写法
        List<String> list=new ArrayList<>();

        List<String> result=addNames(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(result.get(i));

        }

    }
    public static List<String> addNames(List<String> list){
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        return list;
    }
}
