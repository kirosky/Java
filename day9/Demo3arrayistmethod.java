package cn.day9;
import java.util.ArrayList;
/*
* ArrayList当中常用的方法：
* public boolean add(E,e);向集合当中添加元素，参数的类型和泛型一致。返回值代表添加是否成功。
* 备注：对于ArrayList集合来说，add添加动作一定是成功的，所以返回值可用可不用。
* 但是对于其他集合（今后学习）来说，add添加动作不一定成功
* public E get(int index):从集合当中获取元素，参数是索引编号，返回值就是对应位置元素
* public E remove(int index): 从集合当中删除元素，参数是索引编号，返回值就是被删除的元素。
* public int size():获取集合的尺寸长度，返回值是集合中包含的元素个数。
*
*
* */
public class Demo3arrayistmethod {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        System.out.println(list);
        //向集合当中添加元素：add
        boolean success=list.add("柳岩");
        System.out.println(list);//[柳岩]
        System.out.println("添加动作是否成功："+success);
        list.add("高圆圆");
        list.add("赵又廷");
        list.add("李小璐");
        list.add("贾跃亭");
        System.out.println(list);//[柳岩, 高圆圆, 赵又廷, 李小璐, 贾跃亭]

        //从集合中获取元素：get。索引从0开始
        String name=list.get(2);
        System.out.println("第二号索引位置："+name);
        System.out.println(list);
        //从集合中删除元素： remove索引从0开始
        String whorremoved=list.remove(3);
        System.out.println("删除元素："+whorremoved);
        System.out.println(list);
        //获取集合的长度尺寸，也就是其中元素个数
        int size =list.size();
        System.out.println("集合长度："+size);
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }

}
