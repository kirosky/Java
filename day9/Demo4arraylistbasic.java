package cn.day9;
/*
* 如果希望向集合ArrayList当中储存基本类型数据，必须使用基本类型对应的”包装类“
*基本类型  包装类（引用类型，包装类都位于java.lang包下）
* byte      Byte
* short     Short
* int       Integer 特殊
* long      Long
* float     Float
* double    Double
* char      Character 特殊
* boolean   Boolean
*
*从jdk1.5+支持自动装箱，自动拆箱。
* 自动装箱：基本类型--》包装类型
* 自动拆箱：包装类型--》基本类型
*
* */
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Demo4arraylistbasic {
    public static void main(String[] args) {
        ArrayList<String> lista=new ArrayList<>();
        //错误写法！泛型只能是引用类型，不能是基本类型。
//        ArrayList<int> listb=new ArrayList<>();
        ArrayList<Integer> listc=new ArrayList<>();
        listc.add(100);
        listc.add(200);
        System.out.println(listc);//[100, 200]
        int num=listc.get(1);
        System.out.println("第一号元素："+num);
    }
}
