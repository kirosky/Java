package cn.day9;
/*集合可以当方法参数，也可以当方法返回值*/
import java.util.ArrayList;
import java.util.Random;

/*
* 用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合当中。
* 要求使用自定义的方法来实现。
*
* */
public class Demo8arraylistP4 {
    public static void main(String[] args) {
        Random r=new Random();
        ArrayList<Integer> list =new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int num=r.nextInt(100);
            list.add(num);
        }
        System.out.println(list);
        System.out.println(list.size());
        ArrayList<Integer> list1=arrayreturn(list);
        System.out.println(list1);
    }
    public static ArrayList<Integer> arrayreturn(ArrayList<Integer> str){

//        ArrayList<Integer> smalllist=new ArrayList<>();
//        for (int i = 0; i < 20; i++) {
//            int num=biglist.get();
//            if(num%2==0){
//                smalllist.add(num);
//            }
//        }
//        return smalllist;
        int n=0;
        for (int i = 0; i < str.size(); i++) {
            if(str.get(i)%2!=0){
                str.remove(str.get(i));
                i=0;
                n++;
            }
        }
        System.out.println("奇数个数："+n);
        return str;
    }
}
